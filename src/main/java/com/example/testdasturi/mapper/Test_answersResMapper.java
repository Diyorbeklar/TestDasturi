package com.example.testdasturi.mapper;

import com.example.testdasturi.dto.responseDTO.Test_answersResponseDTO;
import com.example.testdasturi.entities.Test_answers;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface Test_answersResMapper extends EntityMapper<Test_answersResponseDTO, Test_answers>{
}
