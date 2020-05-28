package com.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="Person")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID")
	private long id;
	private String name;
	private String lastname;
	private int age;
	private String documentNumber;
	@ManyToOne
    @JoinColumn(name="person_type", nullable=false, referencedColumnName = "ID")
	private PersonType persontype;
}
