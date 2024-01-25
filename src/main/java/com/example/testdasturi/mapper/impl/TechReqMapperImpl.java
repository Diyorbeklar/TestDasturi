package com.example.testdasturi.mapper.impl;

import com.example.testdasturi.dto.requestDTO.TechRequestDTO;
import com.example.testdasturi.entities.Tech;
import com.example.testdasturi.mapper.TechReqMapper;
import com.example.testdasturi.mapper.TechResMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class TechReqMapperImpl implements TechReqMapper {
    @Override
    public TechRequestDTO toDTO(Tech tech) {
        return TechRequestDTO.builder().name(tech.getName()).build();
    }

    @Override
    public Tech toEntity(TechRequestDTO techRequestDTO) {
        return Tech.builder().name(techRequestDTO.getName()).build();
    }

    @Override
    public List<TechRequestDTO> toDTOs(List<Tech> teches) {
        return teches.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<Tech> toEntities(List<TechRequestDTO> techRequestDTOS) {
        return techRequestDTOS.stream().map(this::toEntity).collect(Collectors.toList());
    }
}
