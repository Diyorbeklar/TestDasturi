package com.example.testdasturi.service;

import com.example.testdasturi.dto.requestDTO.Test_answersRequestDTO;
import com.example.testdasturi.dto.requestDTO.Test_itemRequestDTO;
import com.example.testdasturi.dto.responseDTO.Test_answersResponseDTO;
import com.example.testdasturi.dto.responseDTO.Test_itemResponseDTO;
import com.example.testdasturi.entities.Test_answers;
import com.example.testdasturi.mapper.Test_answersReqMapper;
import com.example.testdasturi.mapper.Test_answersResMapper;
import com.example.testdasturi.mapper.impl.Test_ReqMapperImpl;
import com.example.testdasturi.repositories.TestRepository;
import com.example.testdasturi.repositories.Test_answersRepostory;
import com.example.testdasturi.repositories.Test_itemRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data
public class Test_answerServiceImpl implements Test_answerService{
    private final Test_answersRepostory testAnswersRepostory;
    @Qualifier("test_answersResMapper")
    private final Test_answersResMapper testAnswersResMapper;
    private final Test_ReqMapperImpl testAnswersReqMapper;
    private final Test_itemRepository testItemRepository;
    private final TestRepository testRepository;
    @Override
    public List<Test_answersResponseDTO> getTest_answers() {
        return testAnswersResMapper.toDTOs(testAnswersRepostory.findAll());
    }

    @Override
    public Test_answersResponseDTO getTest_answerById(Integer id) {
        return testAnswersResMapper.toDTO(testAnswersRepostory.getReferenceById(id));
    }

    @Override
    public Test_answersResponseDTO createTest_answer(Test_answersRequestDTO testAnswersRequestDTO) {
        return testAnswersResMapper.toDTO(testAnswersRepostory.save(testAnswersReqMapper.toEntity(testAnswersRequestDTO)));
    }

    @Override
    public Test_answersResponseDTO updateTest_answer(Integer id,Test_answersRequestDTO testAnswersRequestDTO) {
        Test_answers testAnswers = testAnswersRepostory.getReferenceById(id);
        testAnswers.setOrders(testAnswersRequestDTO.getOrders());
        testAnswers.setAnswer(testAnswersRequestDTO.getAnswer());
        testAnswers.setIsCorrect(testAnswersRequestDTO.getIsCorrect());
        testAnswers.setTest_item(testItemRepository.getReferenceById(testAnswersRequestDTO.getTest_item_id()));
        testAnswers.setTest(testRepository.getReferenceById(testAnswersRequestDTO.getTest_id()));
        return testAnswersResMapper.toDTO(testAnswersRepostory.save(testAnswers));
    }

    @Override
    public void deleteTest_answer(Integer id) {
        testAnswersRepostory.deleteById(id);
    }
}
