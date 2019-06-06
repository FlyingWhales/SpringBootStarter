package com.ugur._8.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Autowired
	PersonRepository personRepository;

	public void save(Person person) {
		personRepository.save(person);
	}
	
	public List<Person> findByName(String name) {
		return personRepository.findByName(name);
	}
	
	public Optional<Person> findById(int id) {
		return personRepository.findById(id);
	}

}
