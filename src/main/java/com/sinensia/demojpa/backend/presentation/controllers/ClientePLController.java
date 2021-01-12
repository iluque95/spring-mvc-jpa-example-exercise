package com.sinensia.demojpa.backend.presentation.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.demojpa.backend.integration.model.ClientePL;
import com.sinensia.demojpa.backend.integration.repositories.ClientePLRepository;

@RestController
@RequestMapping("/clientes")
public class ClientePLController {

	@Autowired
	private ClientePLRepository clientePLRepository;
	
	@DeleteMapping("/{codigo}")
	public ResponseEntity<?> delete(@PathVariable Integer codigo) {
		clientePLRepository.deleteById(codigo);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/{codigo}")
	public ClientePL getById(@PathVariable Integer codigo) { 
		Optional<ClientePL> optionalCliente = clientePLRepository.findById(codigo);
		return optionalCliente.isPresent() ? optionalCliente.get() : null;
	}
	
	@PutMapping
	public ClientePL update(@RequestBody ClientePL cliente) {
		ClientePL updatedCliente = clientePLRepository.save(cliente);
		return updatedCliente;
	}
	
	@PostMapping
	public ClientePL create(@RequestBody ClientePL cliente) {
		ClientePL createdCliente = clientePLRepository.save(cliente);
		return createdCliente;
	}
	
	@GetMapping
	public List<ClientePL> getAll(){
		
	//	List<ClientePL> clientes = clientePLRepository.findAll();
		List<ClientePL> clientes = clientePLRepository.findByNombre("Honorio");
		
		return clientes;
	}
	
	
	
	
}
