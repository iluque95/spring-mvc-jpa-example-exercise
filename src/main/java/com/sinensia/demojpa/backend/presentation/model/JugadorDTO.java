package com.sinensia.demojpa.backend.presentation.model;

public class JugadorDTO {

	private String nombreCompleto;
	private String demarcacion;
	
	public JugadorDTO(String nombreCompleto, String demarcacion) {
		this.nombreCompleto = nombreCompleto;
		this.demarcacion = demarcacion;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	@Override
	public String toString() {
		return "JugadorDTO [nombreCompleto=" + nombreCompleto + ", demarcacion=" + demarcacion + "]";
	}
	
}
