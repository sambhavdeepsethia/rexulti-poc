package com.rexulti.poc.questionnarie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class Question {


//	@Column(name = "id")
//	private String id;
	@Id
	@Column(name = "question")
	private String question;
	
	public Question() {}

	public Question(String question) {
		super();
//		this.id = id;
		this.question = question;
	}

/*	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}*/

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	
}
