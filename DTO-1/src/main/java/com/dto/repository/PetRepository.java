package com.dto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.entities.Pet;


public interface PetRepository extends JpaRepository <Pet, Long>{

}
