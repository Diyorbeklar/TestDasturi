package com.example.testdasturi.service;

import com.example.testdasturi.dto.responseDTO.TestWithTechsDTO;
import com.example.testdasturi.mapper.TestWithTechsMapper;
import com.example.testdasturi.repositories.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TestWithTechsServiceImpl implements TestWithTechsService {
    private final TestWithTechsMapper testWithTechsMapper;
    private final TestRepository testRepository;
    @Override
    public TestWithTechsDTO getTestWithTechsById(Integer id) {
        return testWithTechsMapper.toDTO(testRepository.getReferenceById(id)) ;
    }

    @Override
    public List<TestWithTechsDTO> getTestWithTechs() {
        return testWithTechsMapper.toDTOs(testRepository.findAll());
    }

    @Override
    public void deleteTestWithTechs(Integer id) {
        testRepository.deleteById(id);
    }
}
