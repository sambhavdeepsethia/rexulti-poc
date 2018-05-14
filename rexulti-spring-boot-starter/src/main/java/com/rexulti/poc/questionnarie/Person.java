package com.rexulti.poc.questionnarie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "persons")
public class Person {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_seq")
	@SequenceGenerator(name = "id_seq", sequenceName="persons_id_seq")
	@Column(name = "id")
    private Long id;
	
	@Column(name = "name")
	private String name;
	
	public Person() {}
	
	public Person(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
