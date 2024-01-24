package com.example.testdasturi.service;

import com.example.testdasturi.dto.requestDTO.TechRequestDTO;
import com.example.testdasturi.dto.responseDTO.TechDTO;
import com.example.testdasturi.entities.Tech;

import java.util.List;

public interface TechService {
    TechDTO getTechById(Integer id);
    List<TechDTO> getALLTech();
    TechDTO createTech(TechRequestDTO techRequestDTO);
    TechDTO updateTech(Integer id,TechRequestDTO techRequestDTO);
    void deleteTech(Integer id);

}
