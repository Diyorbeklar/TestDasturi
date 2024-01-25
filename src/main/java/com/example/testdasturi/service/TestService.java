package com.example.testdasturi.service;

import com.example.testdasturi.dto.requestDTO.TestRequestDTO;
import com.example.testdasturi.dto.responseDTO.TestResponseDTO;

import java.util.List;

public interface TestService {
    TestResponseDTO getTestByID(Integer id);
    List<TestResponseDTO> getALLTest();
    TestResponseDTO createTest(TestRequestDTO testRequestDTO);
    TestResponseDTO updateTest(Integer id,TestRequestDTO testRequestDTO);
    void deleteTest(Integer id);
}
