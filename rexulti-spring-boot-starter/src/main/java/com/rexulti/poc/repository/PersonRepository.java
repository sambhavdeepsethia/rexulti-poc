package com.rexulti.poc.repository;
import org.springframework.data.repository.CrudRepository;

import com.rexulti.poc.questionnarie.Person;



public interface PersonRepository extends CrudRepository<Person, Long>{
	
	public Person findByName(String name);

	public boolean existsByName(String name);
	
}
