package com.example.testdasturi.dto.responseDTO;

import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class Test_itemResponseDTO {
    TestResponseDTO testResponseDTO;
    String question_task;
}
