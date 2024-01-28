package com.example.testdasturi.controller;

import com.example.testdasturi.dto.requestDTO.Test_itemRequestDTO;
import com.example.testdasturi.dto.responseDTO.Test_itemResponseDTO;
import com.example.testdasturi.service.Test_itemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test_item")
@RequiredArgsConstructor
public class Test_itemController {
    private final Test_itemService testItemService;
    @GetMapping
    public List<Test_itemResponseDTO> GetALLTest_item(){

        return testItemService.getAllTest_item();
    }
    @GetMapping("/{id}")
    public Test_itemResponseDTO getTest_itemById(@PathVariable Integer id){
        return testItemService.getByIdTest_item(id);
    }

    @PostMapping
    public Test_itemResponseDTO createTest_item(@RequestBody Test_itemRequestDTO testItemRequestDTO){
        return testItemService.createTest_item(testItemRequestDTO);
    }

    @PutMapping("/{id}")
    public Test_itemResponseDTO updateTest_item(@PathVariable Integer id,@RequestBody Test_itemRequestDTO testItemRequestDTO){
        return testItemService.updateTest_item(id,testItemRequestDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteTest_item(@PathVariable Integer id){
        testItemService.deleteById(id);
    }

}
