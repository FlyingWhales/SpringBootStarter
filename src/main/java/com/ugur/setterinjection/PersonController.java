package com.ugur.setterinjection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	private PersonService personService;
	
	@RequestMapping("/getPerson")
	public String getName() {
		return personService.getName();		
	}
	
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	
}
