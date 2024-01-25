package com.example.testdasturi.service;

import com.example.testdasturi.dto.requestDTO.TestRequestDTO;
import com.example.testdasturi.dto.responseDTO.TestResponseDTO;
import com.example.testdasturi.entities.Test;
import com.example.testdasturi.mapper.TestReqMapper;
import com.example.testdasturi.mapper.TestResMapper;
import com.example.testdasturi.repositories.TechRepository;
import com.example.testdasturi.repositories.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService{
    private final TestRepository testRepository;
    private final TestResMapper testResMapper;
    private final TestReqMapper testReqMapper;
    private final TechRepository techRepository;

    @Override
    public TestResponseDTO getTestByID(Integer id) {
        return testResMapper.toDTO(testRepository.getReferenceById(id));
    }

    @Override
    public List<TestResponseDTO> getALLTest() {
        return testResMapper.toDTOs(testRepository.findAll());
    }

    @Override
    public TestResponseDTO createTest(TestRequestDTO testRequestDTO) {
        return testResMapper.toDTO(testRepository.save(testReqMapper.toEntity(testRequestDTO)));
    }

    @Override
    public TestResponseDTO updateTest(Integer id, TestRequestDTO testRequestDTO) {
        Test test = new Test();
        test.setText(testRequestDTO.getText());
        test.setTech(techRepository.getReferenceById(testRequestDTO.getTech_id()));
        return testResMapper.toDTO(testRepository.save(test));
    }

    @Override
    public void deleteTest(Integer id) {
        testRepository.deleteById(id);
    }
}
