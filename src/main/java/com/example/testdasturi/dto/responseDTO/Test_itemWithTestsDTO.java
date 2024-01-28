package com.example.testdasturi.dto.responseDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Test_itemWithTestsDTO {
    List<TestResponseDTO> testResponseDTOList;
    String question_task;
}
