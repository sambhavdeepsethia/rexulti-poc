package com.rexulti.poc.questionnarie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "question_response")
public class QuestionResponse {
	

		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="qrid_seq")
		@SequenceGenerator(name = "qrid_seq", sequenceName="question_response_id_seq")
		@Column(name = "id")
	    private Long id;
		
		@Column(name = "question_id")
		private Long questionId;
		
		@Column(name = "response_id")
		private Long responseId;

		public QuestionResponse() {
		}

		public QuestionResponse(Long questionId, Long responseId) {
			super();
			this.questionId = questionId;
			this.responseId = responseId;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getQuestionId() {
			return questionId;
		}

		public void setQuestionId(Long questionId) {
			this.questionId = questionId;
		}

		public Long getResponseId() {
			return responseId;
		}

		public void setResponseId(Long responseId) {
			this.responseId = responseId;
		}
		
		
		
		

}
