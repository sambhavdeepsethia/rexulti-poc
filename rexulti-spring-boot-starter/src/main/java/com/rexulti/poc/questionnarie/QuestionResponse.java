package com.rexulti.poc.questionnarie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "question_response")
public class QuestionResponse {
	
	@Id
	private Long id;
	
	@Column(name="question_id")
	private Long question_id;
	
	@Column(name="response_id")
	private Long response_id;

	
	public QuestionResponse() {
		super();
	}
		
	public QuestionResponse(Long question_id, Long response_id) {
		super();
		this.question_id = question_id;
		this.response_id = response_id;
	}
	

	public Long getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(Long question_id) {
		this.question_id = question_id;
	}

	public Long getResponse_id() {
		return response_id;
	}

	public void setResponse_id(Long response_id) {
		this.response_id = response_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
}
