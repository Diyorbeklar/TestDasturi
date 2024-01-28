package com.example.testdasturi.mapper.impl;

import com.example.testdasturi.dto.responseDTO.Test_itemWithTestsDTO;
import com.example.testdasturi.entities.Test_item;
import com.example.testdasturi.mapper.TestResMapper;
import com.example.testdasturi.mapper.Test_itemWithTestsMapper;
import com.example.testdasturi.repositories.TestRepository;
import jakarta.annotation.Priority;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Component
@Priority(1)
public class test_itemWithMapperImpl implements Test_itemWithTestsMapper {
    private final TestRepository testRepository;
    private final TestResMapper testResMapper;
    @Override
    public Test_itemWithTestsDTO toDTO(Test_item testItem) {
        return Test_itemWithTestsDTO.builder().question_task(testItem.getQuestion_task()).testResponseDTOList(testResMapper.toDTOs(testRepository.findAll())).build();
    }

    @Override
    public Test_item toEntity(Test_itemWithTestsDTO testItemWithTestsDTO) {
        return null;
    }

    @Override
    public List<Test_itemWithTestsDTO> toDTOs(List<Test_item> testItems) {
        return testItems.stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<Test_item> toEntities(List<Test_itemWithTestsDTO> testItemWithTestsDTOS) {
        return null;
    }
}
