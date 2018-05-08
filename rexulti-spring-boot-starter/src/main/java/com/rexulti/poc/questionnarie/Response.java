package com.rexulti.poc.questionnarie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "responses")
public class Response {

	@Id
//	@Column(name = "id")
//	private String id;
	@Column(name = "response")
	private String response;
	
	public Response() {}
	
	public Response(String response) {
		super();
//		this.id = id;
		this.response = response;
	}

/*	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}*/

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
}
