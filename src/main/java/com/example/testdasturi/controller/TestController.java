package com.example.testdasturi.controller;

import com.example.testdasturi.dto.requestDTO.TestRequestDTO;
import com.example.testdasturi.dto.responseDTO.TestResponseDTO;
import com.example.testdasturi.service.TestServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class TestController {
    private final TestServiceImpl testService;
    @GetMapping
    public List<TestResponseDTO> getAllTest(){
        return testService.getALLTest();
    }

    @GetMapping("/{id}")
    public TestResponseDTO getTestById(@PathVariable Integer id){
        return testService.getTestByID(id);
    }


    @PostMapping
    public TestResponseDTO createTest(@RequestBody TestRequestDTO testRequestDTO){
         return testService.createTest(testRequestDTO);
    }

    @PutMapping("/{id}")
    public TestResponseDTO updateTest(@PathVariable Integer id,@RequestBody TestRequestDTO testRequestDTO){
        return  testService.updateTest(id,testRequestDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteTest(@PathVariable Integer id){
        testService.deleteTest(id);
    }
}
