package com.ugur._4.ifinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClauseController {

	@Autowired
	ClauseServiceInterface service;
	
	@RequestMapping("/clauses")
	public String getClauses() {
		return service.getClauses();
	}
}
