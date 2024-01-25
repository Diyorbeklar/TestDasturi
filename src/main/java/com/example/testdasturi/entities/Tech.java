package com.example.testdasturi.entities;

import com.example.testdasturi.dto.requestDTO.TechRequestDTO;
import com.example.testdasturi.dto.responseDTO.TechDTO;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
@Builder
public class Tech {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;
    @OneToMany(mappedBy = "tech")
    private List<Test> list;

}
