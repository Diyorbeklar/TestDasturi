package com.example.testdasturi.mapper.impl;

import com.example.testdasturi.dto.responseDTO.TechDTO;
import com.example.testdasturi.dto.responseDTO.TestResponseDTO;
import com.example.testdasturi.entities.Test;
import com.example.testdasturi.mapper.TechResMapper;
import com.example.testdasturi.mapper.TestResMapper;
import com.example.testdasturi.repositories.TechRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class TestResMapperImpl implements TestResMapper {
    private final TechResMapper techResMapper;
    @Override
    public TestResponseDTO toDTO(Test test) {
        return TestResponseDTO.builder().text(test.getText()).techDTO(techResMapper.toDTO(test.getTech())).build();
    }

    @Override
    public Test toEntity(TestResponseDTO testResponseDTO) {
        return Test.builder().text(testResponseDTO.getText()).tech(techResMapper.toEntity(testResponseDTO.getTechDTO())).build();
    }

    @Override
    public List<TestResponseDTO> toDTOs(List<Test> tests) {
        return tests.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<Test> toEntities(List<TestResponseDTO> testResponseDTOS) {
        return testResponseDTOS.stream().map(this::toEntity).collect(Collectors.toList());
    }
}
