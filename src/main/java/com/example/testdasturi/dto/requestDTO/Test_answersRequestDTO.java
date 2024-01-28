package com.example.testdasturi.dto.requestDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Test_answersRequestDTO {
    Integer test_item_id;
    Integer test_id;
    String answer;
    String Orders;
    String isCorrect;
}
