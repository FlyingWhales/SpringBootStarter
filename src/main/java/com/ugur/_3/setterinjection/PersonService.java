package com.ugur._3.setterinjection;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

	public String getName() {
		return "Uğur";
	}
	
	public PersonService() {
		System.out.println("PersonService.constructor");
	}

}
