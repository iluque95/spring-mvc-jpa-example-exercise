package com.sinensia.demojpa.backend.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.demojpa.backend.integration.model.AlumnoPL;
import com.sinensia.demojpa.backend.integration.model.AsignaturaPL;
import com.sinensia.demojpa.backend.integration.repositories.AlumnoPLRepository;
import com.sinensia.demojpa.backend.integration.repositories.AsignaturaPLRepository;

@RestController
public class DocenciaController {

	@Autowired
	private AlumnoPLRepository alumnoRepository;
	
	@Autowired
	private AsignaturaPLRepository asignaturaPLRepository;
	
	@GetMapping("/alumnos")
	public List<AlumnoPL> getAlumnos(){
		return alumnoRepository.findAll();
	}
	
	@GetMapping("/asignaturas")
	public List<AsignaturaPL> getAsignaturas(){
		
		List<AsignaturaPL> asignaturas = asignaturaPLRepository.findAll();
	
		return asignaturas;
	}
	
	
	
}
