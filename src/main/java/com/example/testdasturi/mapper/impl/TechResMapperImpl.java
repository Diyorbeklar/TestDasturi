package com.example.testdasturi.mapper.impl;

import com.example.testdasturi.dto.responseDTO.TechDTO;
import com.example.testdasturi.entities.Tech;
import com.example.testdasturi.mapper.TechResMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class TechResMapperImpl implements TechResMapper {

    @Override
    public TechDTO toDTO(Tech tech) {
        return TechDTO.builder().name(tech.getName()).build();
    }

    @Override
    public Tech toEntity(TechDTO techDTO) {
        return Tech.builder().name(techDTO.getName()).build();
    }

    @Override
    public List<TechDTO> toDTOs(List<Tech> teches) {
        return teches.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<Tech> toEntities(List<TechDTO> techDTOS) {
        return techDTOS.stream().map(this::toEntity).collect(Collectors.toList());
    }
}
