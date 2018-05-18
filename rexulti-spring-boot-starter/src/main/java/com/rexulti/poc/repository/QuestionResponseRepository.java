package com.rexulti.poc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.rexulti.poc.questionnarie.QuestionResponse;


public interface QuestionResponseRepository extends CrudRepository<QuestionResponse, Long>{

	@Query("Select qr.responseId from QuestionResponse qr where qr.questionId = :questionId")
	List<Long> getResponseIds(@Param("questionId")Long questionId);


}