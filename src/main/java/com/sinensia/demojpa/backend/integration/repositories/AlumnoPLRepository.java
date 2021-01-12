package com.sinensia.demojpa.backend.integration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sinensia.demojpa.backend.integration.model.AlumnoPL;

@Repository
public interface AlumnoPLRepository extends JpaRepository<AlumnoPL, Integer>{

}
