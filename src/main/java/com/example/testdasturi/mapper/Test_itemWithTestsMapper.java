package com.example.testdasturi.mapper;

import com.example.testdasturi.dto.responseDTO.Test_itemResponseDTO;
import com.example.testdasturi.dto.responseDTO.Test_itemWithTestsDTO;
import com.example.testdasturi.entities.Test_item;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

public interface Test_itemWithTestsMapper extends EntityMapper<Test_itemWithTestsDTO, Test_item>{

}
