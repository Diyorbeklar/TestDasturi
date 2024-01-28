package com.example.testdasturi.service;

import com.example.testdasturi.dto.responseDTO.TestWithTechsDTO;
import com.example.testdasturi.dto.responseDTO.Test_itemWithTestsDTO;
import com.example.testdasturi.entities.Test_item;
import com.example.testdasturi.mapper.Test_itemWithTestsMapper;
import com.example.testdasturi.repositories.Test_itemRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data
public class Test_itemWithTestsSeviceImpl implements Test_itemWithTestsService {
    @Qualifier("test_itemWithMapperImpl")
    private final Test_itemWithTestsMapper testItemWithTestsMapper;
    private final Test_itemRepository testItemRepository;
    @Override
    public Test_itemWithTestsDTO getTest_itemWithTestsById(Integer id) {
        return testItemWithTestsMapper.toDTO(testItemRepository.getReferenceById(id)) ;
    }

    @Override
    public List<Test_itemWithTestsDTO> getTest_itemWithTests() {
        return testItemWithTestsMapper.toDTOs(testItemRepository.findAll());
    }

    @Override
    public void DeleteTest_itemWithTestsById(Integer id) {
        testItemRepository.deleteById(id);
    }
}
