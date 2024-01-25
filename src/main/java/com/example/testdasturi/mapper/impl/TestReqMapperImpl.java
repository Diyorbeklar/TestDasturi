package com.example.testdasturi.mapper.impl;

import com.example.testdasturi.dto.requestDTO.TestRequestDTO;
import com.example.testdasturi.entities.Test;
import com.example.testdasturi.mapper.TechReqMapper;
import com.example.testdasturi.mapper.TestReqMapper;
import com.example.testdasturi.repositories.TechRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class TestReqMapperImpl implements TestReqMapper {
    private final TechRepository techRepository;
    @Override
    public TestRequestDTO toDTO(Test test) {
        return TestRequestDTO.builder().text(test.getText()).tech_id(test.getId()).build();
    }

    @Override
    public Test toEntity(TestRequestDTO testRequestDTO) {
        return Test.builder().text(testRequestDTO.getText()).tech(techRepository.getReferenceById(testRequestDTO.getTech_id())).build();
    }

    @Override
    public List<TestRequestDTO> toDTOs(List<Test> tests) {
        return tests.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<Test> toEntities(List<TestRequestDTO> testRequestDTOS) {
        return testRequestDTOS.stream().map(this::toEntity).collect(Collectors.toList());
    }
}
