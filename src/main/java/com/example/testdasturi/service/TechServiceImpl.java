package com.example.testdasturi.service;

import com.example.testdasturi.dto.requestDTO.TechRequestDTO;
import com.example.testdasturi.dto.responseDTO.TechDTO;
import com.example.testdasturi.entities.Tech;
import com.example.testdasturi.mapper.TechReqMapper;
import com.example.testdasturi.mapper.TechResMapper;
import com.example.testdasturi.mapper.impl.TechReqMapperImpl;
import com.example.testdasturi.mapper.impl.TechResMapperImpl;
import com.example.testdasturi.repositories.TechRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TechServiceImpl implements TechService{
    private final TechRepository techRepository;
    private final TechResMapper techResMapper;
    private final TechReqMapper techReqMapper;
    @Override
    public TechDTO getTechById(Integer id) {
        return techResMapper.toDTO(techRepository.getReferenceById(id));
    }

    @Override
    public List<TechDTO> getALLTech() {
        return techResMapper.toDTOs(techRepository
                .findAll());

    }

    @Override
    public TechDTO createTech(TechRequestDTO techRequestDTO) {
        return techResMapper.toDTO(techRepository
                        .save(techReqMapper.toEntity(techRequestDTO)));
    }

    @Override
    public TechDTO updateTech(Integer id, TechRequestDTO techRequestDTO) {
        Tech tech = techRepository.getReferenceById(id);
        tech.setName(techRequestDTO.getName());
        return techResMapper.toDTO(techRepository.save(tech));
    }

    @Override
    public void deleteTech(Integer id) {
         techRepository.deleteById(id);
    }
}
