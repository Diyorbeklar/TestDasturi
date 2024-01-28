package com.example.testdasturi.dto.responseDTO;

import com.example.testdasturi.entities.Test;
import com.example.testdasturi.entities.Test_item;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Test_answersResponseDTO {
    Test_item testItem;
    Test test;
    String answer;
    String Orders;
    String isCorrect;
}
