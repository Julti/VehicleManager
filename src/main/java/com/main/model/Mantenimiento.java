package com.main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="Mantenimiento")
public class Mantenimiento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String details;
	private Date fecha;
	private double costo;
	@ManyToOne
    @JoinColumn(name="vehiculo_id", nullable=false, referencedColumnName = "ID")
    private Vehiculo vehiculo;
	public Mantenimiento() {
		
	}
	public Mantenimiento(String details, Date fecha, double costo, Vehiculo vehiculo) {
		super();
		this.details = details;
		this.fecha = fecha;
		this.costo = costo;
		this.vehiculo = vehiculo;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	@Override
	public String toString() {
		return "Mantenimiento [id=" + id + ", details=" + details + ", fecha=" + fecha + ", costo=" + costo + "]";
	}


	
}
