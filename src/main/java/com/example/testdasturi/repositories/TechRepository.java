package com.example.testdasturi.repositories;

import com.example.testdasturi.entities.Tech;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechRepository extends JpaRepository<Tech,Integer> {

}
