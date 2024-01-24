package com.example.testdasturi.dto.responseDTO;

import lombok.Data;

@Data
public class TechDTO {

    private String name;

    public TechDTO(String name) {
        this.name = name;
    }
}
