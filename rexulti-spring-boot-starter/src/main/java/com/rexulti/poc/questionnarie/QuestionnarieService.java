package com.rexulti.poc.questionnarie;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	public List<Person> getAllPersons(){
		List<Person> persons = new ArrayList<>();
		Iterable<Person> personItr = personRepository.findAll();
		for(Person person: personItr)
				persons.add(person);
		
		return persons;
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
	
	public void addQuestionnarie(Questionnarie questionarrie) {
		if(personRepository.existsByName(questionarrie.getPersonName())){
			questionnarieRepository.save(questionarrie);
		}
		else {
			throw new EntityNotFoundException("Person: " + questionarrie.getPersonName() + " doesn't exist");
		}
				
	}
	
	public void updateQuestionnarie(Questionnarie questionarrie) {
		if(personRepository.existsByName(questionarrie.getPersonName())){
			questionnarieRepository.save(questionarrie);
		}
		else {
			throw new EntityNotFoundException("Person: " + questionarrie.getPersonName() + " doesn't exist");
		}
				
	}
	
	public void deleteQuestionnarie(Questionnarie questionarrie) {
		questionnarieRepository.delete(questionarrie);
	}
	
	
	//public void addQuestionnarie
	
	
}
