package com.rexulti.poc.repository;
import org.springframework.data.repository.CrudRepository;

import com.rexulti.poc.questionnarie.Questionnarie;


public interface QuestionnarieRepository extends CrudRepository<Questionnarie, String>{

	public boolean existsByQuestion(String question);

	public boolean existsByPersonname(String personname);
	
	
}


