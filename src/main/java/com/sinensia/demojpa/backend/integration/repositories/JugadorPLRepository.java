package com.sinensia.demojpa.backend.integration.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sinensia.demojpa.backend.integration.model.JugadorPL;
import com.sinensia.demojpa.backend.presentation.model.JugadorDTO;

@Repository
public interface JugadorPLRepository extends JpaRepository<JugadorPL, Integer> {

	public List<JugadorPL> findByEquipoId(Integer id);
	
	public List<JugadorPL> findByPosicion(String posicion);

	@Query("SELECT CONCAT(j.id, ' - ',j.nombre), "
			    + "CONCAT('[' , j.equipo.nombre, ']'), "
			    + "j.posicion "
			    + "FROM JugadorPL j "
			    + "WHERE j.posicion = :p")
	public List<Object[]> getDatosFromPosicion(@Param ("p") String posicion);
	
	
	
	@Query("SELECT new com.sinensia.demojpa.backend.presentation.model.JugadorDTO "
		+ "(CONCAT(j.nombre,' - ', j.apodo), j.posicion) "
	 	+  "FROM JugadorPL j")
	public List<JugadorDTO> getJugadoresDTO();
	
	
	
	
	
	
	
}
