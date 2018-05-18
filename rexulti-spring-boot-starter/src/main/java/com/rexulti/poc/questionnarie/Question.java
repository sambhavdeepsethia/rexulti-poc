package com.rexulti.poc.questionnarie;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class Question{


	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="qid_seq")
	@SequenceGenerator(name = "qid_seq", sequenceName="questions_id_seq")
	@Column(name = "id")
    private Long id;
	
	
	@Column(name = "question")
	private String question;
	
//	@OneToMany
//	private List<Response> responseObj;
//	@ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "question_response", joinColumns = @JoinColumn(name = "question_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "response_id", referencedColumnName = "id"))
//    public List<Response> responses;
	
//	@OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
//	private List<QuestionResponse> responses;
//	
	public Question() {}

	public Question(String question) {
		super();
		this.question = question;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestionText() {
		return question;
	}

	public void setQuestionText(String question) {
		this.question = question;
	}

//	public List<QuestionResponse> getResponses() {
//		return responses;
//	}

	
}
