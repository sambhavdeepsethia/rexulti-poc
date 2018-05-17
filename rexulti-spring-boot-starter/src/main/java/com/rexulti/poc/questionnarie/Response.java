package com.rexulti.poc.questionnarie;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "responses")
public class Response {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="rid_seq")
	@SequenceGenerator(name = "rid_seq", sequenceName="questions_id_seq")
	@Column(name = "id")
    private Long id;
	
	@Column(name = "response")
	private String response;
	
	@ManyToMany(mappedBy = "responses")
	private List<Question> questions;
	
	public Response() {}
	
	public Response(String response) {
		super();
		this.response = response;
	}

	public Response(String response, List<Question> questions) {
		super();
		this.response = response;
		this.questions = questions;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	
}
