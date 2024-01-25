package com.example.testdasturi.controller;

import com.example.testdasturi.dto.responseDTO.TestWithTechsDTO;
import com.example.testdasturi.service.TestServiceImpl;
import com.example.testdasturi.service.TestWithTechsService;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/testWithTechs")
public class TestWithTechsController {
    private final TestWithTechsService testWithTechsService;
    @GetMapping
    List<TestWithTechsDTO> getALLTestWithTechs(){
        return testWithTechsService.getTestWithTechs();
    }

    @GetMapping("/{id}")
    TestWithTechsDTO getTestWithTechsById(@PathVariable Integer id){
        return testWithTechsService.getTestWithTechsById(id);
    }


    @DeleteMapping("/{id}")
    void deleteTestWithTechs(@PathVariable Integer id){
        testWithTechsService.deleteTestWithTechs(id);
    }
}
