package com.sinensia.demojpa.backend.integration.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="JUGADORES")
public class JugadorPL {

	@Id
	private Integer id;
	
	private String nombre;
	private String posicion;
	private String apodo;
	
	@ManyToOne
	@JoinColumn(name = "ID_EQUIPO") // FK
	private EquipoPL equipo;
	
	public JugadorPL() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public EquipoPL getEquipo() {
		return equipo;
	}

	public void setEquipo(EquipoPL equipo) {
		this.equipo = equipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JugadorPL other = (JugadorPL) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "JugadorPL [id=" + id + ", nombre=" + nombre + ", posicion=" + posicion + ", apodo=" + apodo
				+ ", equipo=" + equipo + "]";
	}
	
}
