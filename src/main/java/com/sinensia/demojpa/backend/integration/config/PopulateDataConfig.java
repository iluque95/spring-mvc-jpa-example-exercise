package com.sinensia.demojpa.backend.integration.config;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;

import com.sinensia.demojpa.backend.integration.model.EquipoPL;
import com.sinensia.demojpa.backend.integration.repositories.EquipoPLRepository;

//@Configuration
public class PopulateDataConfig {

	@Autowired
	private EquipoPLRepository equipoPLRepository;
	
	@Transactional
	@Bean
	public void populateEquipo() {
		System.out.println("entra....");
		EquipoPL e1 = new EquipoPL();
		e1.setId(1000);
		e1.setNombre("Real Sociedad");
		
		equipoPLRepository.save(e1);
	}
	
}
