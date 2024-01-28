package com.example.testdasturi.service;

import com.example.testdasturi.dto.requestDTO.Test_itemRequestDTO;
import com.example.testdasturi.dto.responseDTO.TestResponseDTO;
import com.example.testdasturi.dto.responseDTO.Test_itemResponseDTO;

import java.util.List;

public interface Test_itemService {
    List<Test_itemResponseDTO> getAllTest_item();
    Test_itemResponseDTO getByIdTest_item(Integer id);

    Test_itemResponseDTO createTest_item(Test_itemRequestDTO testItemRequestDTO);
    Test_itemResponseDTO updateTest_item(Integer id,Test_itemRequestDTO testItemRequestDTO);

    void deleteById(Integer id);
}
