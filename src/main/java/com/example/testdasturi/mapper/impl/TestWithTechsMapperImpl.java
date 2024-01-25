package com.example.testdasturi.mapper.impl;

import com.example.testdasturi.dto.responseDTO.TestWithTechsDTO;
import com.example.testdasturi.entities.Test;
import com.example.testdasturi.mapper.TechReqMapper;
import com.example.testdasturi.mapper.TechResMapper;
import com.example.testdasturi.mapper.TestWithTechsMapper;
import com.example.testdasturi.repositories.TechRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
@RequiredArgsConstructor
public class TestWithTechsMapperImpl implements TestWithTechsMapper {
    private final TechRepository techRepository;
    private final TechResMapper techResMapper;
    @Override
    public TestWithTechsDTO toDTO(Test test) {
        return TestWithTechsDTO.builder().text(test.getText()).teches(techResMapper.toDTOs(techRepository.findAll())).build();
    }

    @Override
    public Test toEntity(TestWithTechsDTO testWithTechsDTO) {
        return null;
    }

    @Override
    public List<TestWithTechsDTO> toDTOs(List<Test> tests) {
        return tests.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<Test> toEntities(List<TestWithTechsDTO> testWithTechsDTOS) {
        return null;
    }
}
