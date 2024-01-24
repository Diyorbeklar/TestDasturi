package com.example.testdasturi.dto.requestDTO;

import com.example.testdasturi.entities.Tech;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TechRequestDTO {
    String name;

    public Tech toTech(){
        return Tech .builder().name(this.name).build();
    }
}
