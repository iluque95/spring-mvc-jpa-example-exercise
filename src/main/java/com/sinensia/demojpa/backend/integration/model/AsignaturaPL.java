package com.sinensia.demojpa.backend.integration.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ASIGNATURAS")
public class AsignaturaPL {

	@Id
	private Integer id;
	
	private String nombre;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
	  name = "ASIGNATURAS_ALUMNOS", 
	  joinColumns = @JoinColumn(name = "ID_ASIGNATURA"), 
	  inverseJoinColumns = @JoinColumn(name = "ID_ALUMNO"))
	private List<AlumnoPL> alumnos;
	
	public AsignaturaPL() {
		
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

	public List<AlumnoPL> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<AlumnoPL> alumnos) {
		this.alumnos = alumnos;
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
		AsignaturaPL other = (AsignaturaPL) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AsignaturaPL [id=" + id + ", nombre=" + nombre + ", alumnos=" + alumnos + "]";
	}
}
