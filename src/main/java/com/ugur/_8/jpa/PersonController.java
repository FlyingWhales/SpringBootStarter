package com.ugur._8.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@Autowired
	PersonService personService;
	
	@RequestMapping("/addPeople")
	public boolean add() {
		Person p = new Person();
		p.setName("Uğur");
		p.setSweetness(200);
		p.setDefinition("It's me!");
		
		personService.save(p);
		
		return true;
	}
	
	
	@RequestMapping("/find/{id}")
	public String find( @PathVariable("id") int id) {
		return personService.findById(id).toString();
	}
}
