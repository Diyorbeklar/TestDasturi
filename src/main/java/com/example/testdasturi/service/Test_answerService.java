package com.example.testdasturi.service;

import com.example.testdasturi.dto.requestDTO.Test_answersRequestDTO;
import com.example.testdasturi.dto.requestDTO.Test_itemRequestDTO;
import com.example.testdasturi.dto.responseDTO.Test_answersResponseDTO;
import com.example.testdasturi.dto.responseDTO.Test_itemResponseDTO;

import java.util.List;

public interface Test_answerService {
    List<Test_answersResponseDTO> getTest_answers();
    Test_answersResponseDTO getTest_answerById(Integer id);
    Test_answersResponseDTO createTest_answer(Test_answersRequestDTO testAnswersRequestDTO);
    Test_answersResponseDTO updateTest_answer(Integer id,Test_answersRequestDTO test_answersRequestDTO);
    void deleteTest_answer(Integer id);
}
