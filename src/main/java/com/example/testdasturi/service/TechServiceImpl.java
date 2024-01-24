package com.example.testdasturi.service;

import com.example.testdasturi.dto.requestDTO.TechRequestDTO;
import com.example.testdasturi.dto.responseDTO.TechDTO;
import com.example.testdasturi.entities.Tech;
import com.example.testdasturi.repositories.TechRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TechServiceImpl implements TechService{
    private final TechRepository techRepository;

    @Override
    public TechDTO getTechById(Integer id) {
        return techRepository.getReferenceById(id).toDTO();
    }

    @Override
    public List<TechDTO> getALLTech() {
        return techRepository
                .findAll()
                .stream()
                .map(Tech::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public TechDTO createTech(TechRequestDTO techRequestDTO) {
        return techRepository
                .save(techRequestDTO.toTech())
                .toDTO();
    }

    @Override
    public TechDTO updateTech(Integer id, TechRequestDTO techRequestDTO) {
        Tech tech = techRepository.getReferenceById(id);
        tech.setName(techRequestDTO.toTech().getName());

        return techRepository.save(tech).toDTO();
    }

    @Override
    public void deleteTech(Integer id) {
         techRepository.deleteById(id);
    }
}
