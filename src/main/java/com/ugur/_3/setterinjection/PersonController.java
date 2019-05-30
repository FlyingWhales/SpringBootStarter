package com.ugur._3.setterinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	public PersonService personService;
	
	@RequestMapping("/getPerson")
	public String getName() {
		return personService.getName();		
	}
	
	@Autowired
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	
}
