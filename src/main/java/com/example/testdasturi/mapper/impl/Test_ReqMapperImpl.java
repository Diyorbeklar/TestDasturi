package com.example.testdasturi.mapper.impl;

import com.example.testdasturi.dto.requestDTO.Test_answersRequestDTO;
import com.example.testdasturi.entities.Test_answers;
import com.example.testdasturi.mapper.Test_answersReqMapper;
import com.example.testdasturi.repositories.TestRepository;
import com.example.testdasturi.repositories.Test_itemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Test_ReqMapperImpl implements Test_answersReqMapper {
    private final TestRepository testRepository;
    private final Test_itemRepository testItemRepository;
    @Override
    public Test_answersRequestDTO toDTO(Test_answers testAnswers) {
        return null;
    }

    @Override
    public Test_answers toEntity(Test_answersRequestDTO testAnswersRequestDTO) {
        System.out.println("dddd"+testAnswersRequestDTO.getTest_item_id());
        return Test_answers.builder().answer(testAnswersRequestDTO.getAnswer())
                .test(testRepository.getReferenceById(testAnswersRequestDTO.getTest_id()))
                .isCorrect(testAnswersRequestDTO.getIsCorrect())
                .test_item(testItemRepository.getReferenceById(testAnswersRequestDTO.getTest_item_id()))
                .isCorrect(testAnswersRequestDTO.getIsCorrect()).build();
    }

    @Override
    public List<Test_answersRequestDTO> toDTOs(List<Test_answers> testAnswers) {
        return null;
    }

    @Override
    public List<Test_answers> toEntities(List<Test_answersRequestDTO> testAnswersRequestDTOS) {
        return null;
    }
}
