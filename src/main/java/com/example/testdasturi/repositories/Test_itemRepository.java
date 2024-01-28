package com.example.testdasturi.repositories;

import com.example.testdasturi.entities.Test_item;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Test_itemRepository extends JpaRepository<Test_item, Integer> {
}
