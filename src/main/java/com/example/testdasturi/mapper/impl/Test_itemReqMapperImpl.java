package com.example.testdasturi.mapper.impl;

import com.example.testdasturi.dto.requestDTO.Test_itemRequestDTO;
import com.example.testdasturi.entities.Test_item;
import com.example.testdasturi.mapper.TestReqMapper;
import com.example.testdasturi.mapper.TestResMapper;
import com.example.testdasturi.mapper.Test_itemReqMapper;
import com.example.testdasturi.repositories.TestRepository;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class Test_itemReqMapperImpl implements Test_itemReqMapper {
    private final TestRepository testRepository;
    private final TestReqMapper testReqMapper;
    private final TestResMapper testResMapper;
    @Override
    public Test_itemRequestDTO toDTO(Test_item testItem) {
        return Test_itemRequestDTO.builder().test_id(testItem.getTest().getId()).build();
    }

    @Override
    public Test_item toEntity(Test_itemRequestDTO testItemRequestDTO) {


        return Test_item.builder().test(testRepository.getReferenceById(testItemRequestDTO.getTest_id())).question_task(testItemRequestDTO.getQuestion_task()).build();
    }

    @Override
    public List<Test_itemRequestDTO> toDTOs(List<Test_item> testItems) {
        return testItems.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<Test_item> toEntities(List<Test_itemRequestDTO> testItemRequestDTOS) {
        return testItemRequestDTOS.stream().map(this::toEntity).collect(Collectors.toList());
    }
}
