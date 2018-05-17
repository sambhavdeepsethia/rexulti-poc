package com.rexulti.poc.repository;
import org.springframework.data.repository.CrudRepository;

import com.rexulti.poc.questionnarie.Question;


public interface QuestionRepository extends CrudRepository<Question, Long>{
	
	
}
