package com.rexulti.poc.questionnarie;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rexulti.poc.repository.PersonRepository;
import com.rexulti.poc.repository.QuestionRepository;
import com.rexulti.poc.repository.QuestionResponseRepository;
import com.rexulti.poc.repository.QuestionnarieRepository;
import com.rexulti.poc.repository.ResponseRepository;

@Service
public class QuestionnarieService {

	@Autowired
	private QuestionnarieRepository questionnarieRepository;
	
	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private ResponseRepository responseRepository;
	@Autowired
	private QuestionResponseRepository questionResponseRepository;
	
	public List<Person> getAllPersons(){
		Iterable<Person> personItr = personRepository.findAll();
		
		return (List<Person>) personItr;
//		for(Person person: personItr)
//				persons.add(person);
//		
//		return persons;
	}
	
	public List<Question> getAllQuestions(){
		List<Question> questions = new ArrayList<>();
		Iterable<Question> questionItr = questionRepository.findAll();
		for(Question question: questionItr)
			questions.add(question);
		
		return questions;
	}
	
	
	public List<Response> getAllResponses(){
		List<Response> responses = new ArrayList<>();
		Iterable<Response> responseItr = responseRepository.findAll();
		for(Response response: responseItr)
			responses.add(response);
		
		return responses;
	}
	
	public List<Questionnarie> getAllQuestionnaries() {
		List<Questionnarie> questionnaries = new ArrayList<>();
		Iterable<Questionnarie> questionnarieItr = questionnarieRepository.findAll();
		for(Questionnarie questionnarie : questionnarieItr)
			questionnaries.add(questionnarie);
		
		return questionnaries;
	}
	
	public void addQuestionnarie(Questionnarie questionarrie) {
		
		System.out.println("Services Person name: "+ questionarrie.getPersonname());
		if( !personRepository.existsByName(questionarrie.getPersonname())
			&& !questionnarieRepository.existsByQuestion(questionarrie.getQuestion())
			&& !responseRepository.existsByResponse(questionarrie.getResponse())){
			
			throw new EntityNotFoundException();
			
		}
		else if(questionnarieRepository.existsByPersonname(questionarrie.getPersonname())
				&& questionnarieRepository.existsByQuestion(questionarrie.getQuestion())) {
			throw new EntityExistsException("The person by name: " + questionarrie.getPersonname()  
			+ " and question: " + questionarrie.getQuestion() + " already exists. Try PUT method instead");
		}
		else {
			questionnarieRepository.save(questionarrie);
		}
				
	}
	
	public void updateQuestionnarie(Questionnarie questionarrie) {
		if( personRepository.existsByName(questionarrie.getPersonname())
				&& questionnarieRepository.existsByQuestion(questionarrie.getQuestion())
				&& responseRepository.existsByResponse(questionarrie.getResponse())){
			questionnarieRepository.save(questionarrie);
		}
		else {
			throw new EntityNotFoundException();
		}
				
	}
	
	public void deleteQuestionnarie(Long id) {
		questionnarieRepository.delete(questionnarieRepository.findById(id));
	}

	public Questionnarie getQuestionnarie(Long id) {
		
		return questionnarieRepository.findById(id);

	}

	public List<Response> getQuestionResponse(Long question_id) {
		
		List<Long> response_ids = questionResponseRepository.getResponseIds(question_id);
		List<Response> responses = new ArrayList<>();
		for(Long id : response_ids) {
			responseRepository.findById(id).ifPresent(responses::add);
		}
		
		return responses;
		
	}
	
	
	
	//public void addQuestionnarie
	
	
}
