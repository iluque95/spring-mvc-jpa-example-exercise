package com.sinensia.demojpa.backend.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.demojpa.backend.integration.model.EquipoPL;
import com.sinensia.demojpa.backend.integration.model.JugadorPL;
import com.sinensia.demojpa.backend.integration.repositories.EquipoPLRepository;
import com.sinensia.demojpa.backend.integration.repositories.JugadorPLRepository;
import com.sinensia.demojpa.backend.presentation.model.JugadorDTO;

@RestController
public class JugadorPLController {

	@Autowired
	private JugadorPLRepository jugadorPLRepository;
	
	@Autowired
	private EquipoPLRepository equipoPLRepository;
	
	@GetMapping("/jugadores")
	public List<JugadorPL> getAll(){
		return jugadorPLRepository.findAll();
	}
	
	@GetMapping("/equipos")
	public List<EquipoPL> getAllEquipos(){
		return equipoPLRepository.findAll();
	}
	
	@GetMapping("/equipos/{codigo}/jugadores")
	public List<JugadorPL> getAllJugadoresPorEquipo(@PathVariable Integer codigo){
		return jugadorPLRepository.findByEquipoId(codigo);
	}
	
	@GetMapping("/jugadores-posicion")
	public List<Object[]> getAllCentrales(@RequestParam String posicion){
		return jugadorPLRepository.getDatosFromPosicion(posicion);
	}
	
	@GetMapping("/jugadores-dto")
	public List<JugadorDTO> getDTOs(){
		return jugadorPLRepository.getJugadoresDTO();
	}
	
}
