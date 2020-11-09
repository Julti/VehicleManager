package com.main.base.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name="Persona")
public class Persona {
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	public PersonType getPersontype() {
		return persontype;
	}
	public void setPersontype(PersonType persontype) {
		this.persontype = persontype;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID")
	private long id;
	private String name;
	private String lastname;
	private int age;
	private String documentNumber;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="person_type", nullable=false, referencedColumnName = "ID")
	private PersonType persontype;
	
	@OneToMany(mappedBy="conductor")
	private Set<Ruta> rutas;
}
