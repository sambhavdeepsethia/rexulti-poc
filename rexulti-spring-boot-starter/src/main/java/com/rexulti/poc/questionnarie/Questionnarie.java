package com.rexulti.poc.questionnarie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "questionnaries")
public class Questionnarie {

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_seq")
	@SequenceGenerator(name = "id_seq", sequenceName="questionnaries_id_seq")
	@Column(name = "id")
    private Long id;

	
	@Column(name = "personname")
	@NotNull
	private String personname;
	
	
	@Column(name = "question")
	@NotNull
	private String question;
	
	@Column(name = "response")
	@NotNull
	private String response;
	
	public Questionnarie() {}
	
	public Questionnarie(@NotNull String personname, @NotNull String question, @NotNull String response) {
		super();
		this.personname = personname;
		this.question = question;
		this.response = response;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPersonname() {
		return personname;
	}

	public void setPersonname(String personname) {
		this.personname = personname;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	
	

}
