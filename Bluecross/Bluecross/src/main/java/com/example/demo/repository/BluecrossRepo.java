package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bluecross;

@Repository
public interface BluecrossRepo extends JpaRepository<Bluecross, Integer>{

}
