package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Owner;

public interface OwnerRepo extends JpaRepository<Owner, Integer> {

}
