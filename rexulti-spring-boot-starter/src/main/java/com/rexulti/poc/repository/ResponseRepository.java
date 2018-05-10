package com.rexulti.poc.repository;
import org.springframework.data.repository.CrudRepository;

import com.rexulti.poc.questionnarie.Response;


public interface ResponseRepository extends CrudRepository<Response, String>{

	public boolean existsByResponse(String response);
	
}
