package com.example.testdasturi.service;

import com.example.testdasturi.dto.responseDTO.TestWithTechsDTO;

import java.util.List;

public interface TestWithTechsService {
      TestWithTechsDTO getTestWithTechsById(Integer id);
      List<TestWithTechsDTO> getTestWithTechs();
      void deleteTestWithTechs(Integer id);
}
