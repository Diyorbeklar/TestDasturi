package com.example.testdasturi.controller;

import com.example.testdasturi.dto.responseDTO.TestWithTechsDTO;
import com.example.testdasturi.dto.responseDTO.Test_itemResponseDTO;
import com.example.testdasturi.dto.responseDTO.Test_itemWithTestsDTO;
import com.example.testdasturi.service.Test_itemWithTestsService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Test_itemWith")
@Data
public class Test_itemWithTestsController {
    private final Test_itemWithTestsService testItemWithTestsService;
    @GetMapping("/{id}")
    public Test_itemWithTestsDTO getTest_itemWithTestsById(@PathVariable Integer id){
        return testItemWithTestsService.getTest_itemWithTestsById(id);
    }
    @GetMapping
    public List<Test_itemWithTestsDTO> getTest_itemWithTests(){
        return testItemWithTestsService.getTest_itemWithTests();
    }

    @DeleteMapping("/{id}")
    public void deleteTest_itemWithTest(@PathVariable Integer id){
        testItemWithTestsService.DeleteTest_itemWithTestsById(id);
    }
}
