package com.example.testdasturi.dto.responseDTO;

import com.example.testdasturi.dto.requestDTO.TechRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TestResponseDTO {
    String text;
    TechDTO techDTO;
}
