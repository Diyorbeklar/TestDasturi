package com.example.testdasturi.service;

import com.example.testdasturi.dto.responseDTO.TestWithTechsDTO;
import com.example.testdasturi.dto.responseDTO.Test_itemWithTestsDTO;

import java.util.List;

public interface Test_itemWithTestsService {
    Test_itemWithTestsDTO getTest_itemWithTestsById(Integer id);
    List<Test_itemWithTestsDTO> getTest_itemWithTests();
    void DeleteTest_itemWithTestsById(Integer id);

}
