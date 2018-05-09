package com.rexulti.poc.questionnarie;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "questionnaries")
public class Questionnarie {

//	@ManyToOne
//	private Person person;
//	@ManyToOne
//	private Question question;
//	@ManyToOne
//	private Response response;
//	
	@Column(name = "personName")
	@NotNull
	private String personName;
	@Column(name = "question")
	@NotNull
	private String question;
	@Column(name = "response")
	@NotNull
	private String response;
	
	public Questionnarie() {}

	public Questionnarie(String personName, String question, String response) {
		super();
		this.personName = personName;
		this.question = question;
		this.response = response;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
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
	
	
	
/*	public Questionnarie(String name, String question, String response) {
		super();
		this.person = new Person(name);
		this.question = new Question(question);
		this.response = new Response(response);
	}*/
	
	
}
