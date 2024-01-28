package com.example.testdasturi.service;

import com.example.testdasturi.dto.requestDTO.Test_itemRequestDTO;
import com.example.testdasturi.dto.responseDTO.TestResponseDTO;
import com.example.testdasturi.dto.responseDTO.Test_itemResponseDTO;
import com.example.testdasturi.entities.Test_item;
import com.example.testdasturi.mapper.Test_itemReqMapper;
import com.example.testdasturi.mapper.Test_itemResMapper;
import com.example.testdasturi.repositories.TestRepository;
import com.example.testdasturi.repositories.Test_itemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Test_itemServiceImpl implements Test_itemService{
    private final Test_itemRepository testItemRepository;
    private final Test_itemResMapper testItemResMapper;
    private final Test_itemReqMapper testItemReqMapper;
    private final TestRepository testRepository;
    @Override
    public List<Test_itemResponseDTO> getAllTest_item() {
        return testItemResMapper.toDTOs(testItemRepository.findAll());
    }

    @Override
    public Test_itemResponseDTO getByIdTest_item(Integer id) {
        return testItemResMapper.toDTO(testItemRepository.getReferenceById(id));
    }

    @Override
    public Test_itemResponseDTO createTest_item(Test_itemRequestDTO testItemRequestDTO) {
        Test_item testItem = new Test_item();
        testItem.setTest(testRepository.getReferenceById(testItemRequestDTO.getTest_id()));
        testItem.setQuestion_task(testItemRequestDTO.getQuestion_task());
        return testItemResMapper.toDTO(testItemRepository.save(testItem));
    }

    @Override
    public Test_itemResponseDTO updateTest_item(Integer id,Test_itemRequestDTO testItemRequestDTO) {
        Test_item testItem = testItemRepository.getReferenceById(id);
        testItem.setTest(testRepository.getReferenceById(testItemRequestDTO.getTest_id()));
        testItem.setQuestion_task(testItemRequestDTO.getQuestion_task());
        return testItemResMapper.toDTO(testItemRepository.getReferenceById(id));
    }

    @Override
    public void deleteById(Integer id) {
        testRepository.deleteById(id);
    }
}
