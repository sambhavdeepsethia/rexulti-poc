package com.rexulti.poc.questionnarie;
import javax.persistence.JoinColumn;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class Question {


	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_seq")
	@SequenceGenerator(name = "id_seq", sequenceName="questions_id_seq")
	@Column(name = "id")
    private Long id;
	
	
	@Column(name = "question")
	private String question;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "question_response", joinColumns = @JoinColumn(name = "question_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "response_id", referencedColumnName = "id"))
    public List<Response> responses;
	
	public Question() {}

	public Question(String question) {
		super();
		this.question = question;
	}
	
	public Question(String question, List<Response> responses) {
		super();
		this.question = question;
		this.responses = responses;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Response> getResponses() {
		return responses;
	}

	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}
	
	
}
