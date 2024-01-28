package com.example.testdasturi.mapper;

import com.example.testdasturi.dto.requestDTO.Test_answersRequestDTO;
import com.example.testdasturi.entities.Test_answers;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;


public interface Test_answersReqMapper extends EntityMapper<Test_answersRequestDTO, Test_answers>{
}
