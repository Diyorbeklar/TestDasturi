package com.example.testdasturi.repositories;

import com.example.testdasturi.entities.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test,Integer> {
}
