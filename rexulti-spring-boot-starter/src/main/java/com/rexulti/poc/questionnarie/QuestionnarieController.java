package com.rexulti.poc.questionnarie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class QuestionnarieController {

	@Autowired
	private QuestionnarieService questionnarieService; 
	
	@RequestMapping(method=RequestMethod.GET, value="/persons")
	public List<Person> getAllProjects(){
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
	
	@RequestMapping(method=RequestMethod.POST, value="/questionnaries")
	public void addQuestionnarie(@RequestBody Questionnarie questionarrie) throws javax.persistence.EntityNotFoundException{
		 questionnarieService.addQuestionnarie(questionarrie);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/questionnaries")
	public void updateQuestionnarie(@RequestBody Questionnarie questionarrie) throws javax.persistence.EntityNotFoundException{
		 questionnarieService.updateQuestionnarie(questionarrie);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/questionnaries")
	public void deleteQuestionnarie(@RequestBody Questionnarie questionarrie){
		questionnarieService.deleteQuestionnarie(questionarrie);
	}
	
}
