package com.rexulti.poc.questionnarie;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class QuestionnarieController {

	@Autowired
	private QuestionnarieService questionnarieService; 
	
	@RequestMapping(method=RequestMethod.GET, value="/persons")
	public List<Person> getAllPersons(){
		return questionnarieService.getAllPersons();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/questions")
	public List<Question> getAllQuestions(){
		return questionnarieService.getAllQuestions();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/responses")
	public List<Response> getAllResponses(){
		return questionnarieService.getAllResponses();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/questions/{id}/responses")
	public List<Response> getQuestionResponse(){
		return questionnarieService.getAllResponses();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/questionnaries")
	public List<Questionnarie> getAllQuestionarries(){
		return questionnarieService.getAllQuestionnaries();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/questionnaries/{id}")
	public Questionnarie getQuestionarrie(@PathVariable Long id){
		return questionnarieService.getQuestionnarie(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/questionnaries")
	public void addQuestionnarie(@RequestBody Questionnarie questionarrie){
		try {
		 	questionnarieService.addQuestionnarie(questionarrie);
		}
		catch(EntityNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/questionnaries/{id}")
	public void updateQuestionnarie(@RequestBody Questionnarie questionarrie) {
		try {
			questionnarieService.updateQuestionnarie(questionarrie);
		}
		catch(EntityNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/questionnaries/{id}")
	public void deleteQuestionnarie(@PathVariable Long id){
		try {
			questionnarieService.deleteQuestionnarie(id);
		}
		catch(EntityNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
