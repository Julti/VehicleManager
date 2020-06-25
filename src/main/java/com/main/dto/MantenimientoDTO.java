package com.main.dto;

import java.util.Date;

import com.main.model.Vehiculo;

public class MantenimientoDTO {
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public long getVehiculoId() {
		return vehiculoId;
	}
	public void setVehiculoId(long vehiculoId) {
		this.vehiculoId = vehiculoId;
	}
	private String details;
	private Date fecha;
	private double costo;
	private long vehiculoId;
}
