package com.sinensia.demojpa.backend.integration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sinensia.demojpa.backend.integration.model.AsignaturaPL;

@Repository
public interface AsignaturaPLRepository extends JpaRepository<AsignaturaPL, Integer>{

}
