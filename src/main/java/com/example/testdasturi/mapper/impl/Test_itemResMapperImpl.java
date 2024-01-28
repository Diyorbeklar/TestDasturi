package com.example.testdasturi.mapper.impl;

import com.example.testdasturi.dto.responseDTO.TestResponseDTO;
import com.example.testdasturi.dto.responseDTO.Test_itemResponseDTO;
import com.example.testdasturi.entities.Test_item;
import com.example.testdasturi.mapper.TestReqMapper;
import com.example.testdasturi.mapper.TestResMapper;
import com.example.testdasturi.mapper.Test_itemResMapper;
import com.example.testdasturi.repositories.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class Test_itemResMapperImpl implements Test_itemResMapper {
    private final TestRepository testRepository;
    private final TestReqMapper testReqMapper;
    private final TestResMapper testResMapper;
    @Override
    public Test_itemResponseDTO toDTO(Test_item testItem) {
        return Test_itemResponseDTO.builder().testResponseDTO(testResMapper.toDTO(testItem.getTest())).question_task(testItem.getQuestion_task()).build();
    }

    @Override
    public Test_item toEntity(Test_itemResponseDTO testItemResponseDTO) {
        return Test_item.builder().test(testResMapper.toEntity(testItemResponseDTO.getTestResponseDTO())).question_task(testItemResponseDTO.getQuestion_task()).build();
    }

    @Override
    public List<Test_itemResponseDTO> toDTOs(List<Test_item> testItems) {
        return testItems.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<Test_item> toEntities(List<Test_itemResponseDTO> testItemResponseDTOS) {
        return testItemResponseDTOS.stream().map(this::toEntity).collect(Collectors.toList());
    }
}
