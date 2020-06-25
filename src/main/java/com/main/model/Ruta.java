package com.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="Ruta")
public class Ruta {
	public Ruta(Ciudad origen, Ciudad destino, Vehiculo vehiculo, Persona conductor) {
		this.origen = origen;
		this.destino = destino;
		this.vehiculo = vehiculo;
		this.conductor = conductor;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID")
	private long id;
	@ManyToOne
	@JoinColumn(name="origen_id", nullable=false, referencedColumnName = "ID")
	private Ciudad origen;
	@ManyToOne
	@JoinColumn(name="destino_id", nullable=false, referencedColumnName = "ID")
	private Ciudad destino;
	@ManyToOne
	@JoinColumn(name="vehiculo_id", nullable=false, referencedColumnName = "ID")
	private Vehiculo vehiculo;
	@ManyToOne
	@JoinColumn(name="conductor_id", nullable=false, referencedColumnName = "ID")
	private Persona conductor;
}
