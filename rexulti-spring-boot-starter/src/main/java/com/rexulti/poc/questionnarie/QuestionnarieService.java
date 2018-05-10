package com.rexulti.poc.questionnarie;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rexulti.poc.repository.PersonRepository;
import com.rexulti.poc.repository.QuestionRepository;
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
				&& !questionnarieRepository.existsByQuestion(questionarrie.getQuestion())
				&& !responseRepository.existsByResponse(questionarrie.getResponse())){
			questionnarieRepository.save(questionarrie);
		}
		else {
			throw new EntityNotFoundException();
		}
				
	}
	
	public void deleteQuestionnarie(Questionnarie questionarrie) {
		questionnarieRepository.delete(questionarrie);
	}
	
	
	//public void addQuestionnarie
	
	
}
