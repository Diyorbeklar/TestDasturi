package com.example.testdasturi.controller;

import com.example.testdasturi.dto.requestDTO.Test_answersRequestDTO;
import com.example.testdasturi.dto.responseDTO.Test_answersResponseDTO;
import com.example.testdasturi.service.Test_answerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/testAnswer")
@RequiredArgsConstructor
public class Test_answerController {
    private final Test_answerService testAnswerService;
    @GetMapping
    List<Test_answersResponseDTO> getTest_answer(){
        return testAnswerService.getTest_answers();
    }
    @GetMapping("/{id}")
    Test_answersResponseDTO getTest_answerById(@PathVariable Integer id){
        return testAnswerService.getTest_answerById(id);
    }
    @PostMapping
    Test_answersResponseDTO createTest_answer(@RequestBody Test_answersRequestDTO testAnswersRequestDTO) {
        return testAnswerService.createTest_answer(testAnswersRequestDTO);
    }

    @PutMapping("/{id}")
    Test_answersResponseDTO updateTest_answer(@PathVariable Integer id, @RequestBody Test_answersRequestDTO  test_answersRequestDTO){
        return testAnswerService.updateTest_answer(id,test_answersRequestDTO);
    }

    @DeleteMapping("/{id}")
    void delete_test_answer(@PathVariable Integer id){
        testAnswerService.deleteTest_answer(id);
    }

}
