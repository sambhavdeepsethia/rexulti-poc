package com.rexulti.poc.questionnarie;
import org.springframework.data.repository.CrudRepository;



public interface PersonRepository extends CrudRepository<Person, String>{
	
	public Person findByName(String name);

	public boolean existsByName(String name);
	
}
