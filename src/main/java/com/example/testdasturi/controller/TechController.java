package com.example.testdasturi.controller;

import ch.qos.logback.core.model.INamedModel;
import com.example.testdasturi.dto.requestDTO.TechRequestDTO;
import com.example.testdasturi.dto.responseDTO.TechDTO;
import com.example.testdasturi.entities.Tech;
import com.example.testdasturi.service.TechServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tech")
@RequiredArgsConstructor
public class TechController {
    private final TechServiceImpl techService;

    @GetMapping
    public List<TechDTO> getALLTech(){
        return techService.getALLTech();
    }

    @GetMapping("/{id}")
    public TechDTO getTech(@PathVariable("id") Integer id){
        return techService.getTechById(id);
    }

    @PostMapping
    public TechDTO createTech(@RequestBody TechRequestDTO techRequestDTO){
        return techService.createTech(techRequestDTO);
    }

    @PutMapping("/{id}")
    public TechDTO updateTech(@PathVariable("id") Integer id, @RequestBody TechRequestDTO techRequestDTO){
        return techService.updateTech(id,techRequestDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteTech(@PathVariable("id") Integer id){
        techService.deleteTech(id);
    }

}
