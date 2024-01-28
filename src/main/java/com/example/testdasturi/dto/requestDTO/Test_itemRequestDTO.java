package com.example.testdasturi.dto.requestDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Test_itemRequestDTO {
    Integer test_id;
    String question_task;
}
