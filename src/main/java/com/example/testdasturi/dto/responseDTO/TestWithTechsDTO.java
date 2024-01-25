package com.example.testdasturi.dto.responseDTO;

import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class TestWithTechsDTO {
    String text;
    List<TechDTO> teches;
}
