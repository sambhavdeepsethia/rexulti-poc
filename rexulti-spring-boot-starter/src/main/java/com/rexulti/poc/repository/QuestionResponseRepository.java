package com.rexulti.poc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.rexulti.poc.questionnarie.QuestionResponse;

public interface QuestionResponseRepository extends CrudRepository<QuestionResponse, Long>{

	@Query("select qr.response_id from question_response qr where qr.question_id = question_id")
	public List<Long> getResponseIds(@Param("question_id")Long question_id);
}