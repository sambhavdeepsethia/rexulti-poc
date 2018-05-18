package com.rexulti.poc.questionnarie;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	

	
/*	@ManyToMany(mappedBy = "responses")
	private List<Question> questions;*/
	

//	
//	@OneToMany(mappedBy = "response", cascade = CascadeType.ALL, orphanRemoval = true)
//	private List<QuestionResponse> question;
	
	public Response() {}
	
	public Response(String response) {
		super();
		this.response = response;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResponseText() {
		return response;
	}

	public void setResponseText(String response) {
		this.response = response;
	}

//	public List<QuestionResponse> getQuestion() {
//		return question;
//	}
//	
}
