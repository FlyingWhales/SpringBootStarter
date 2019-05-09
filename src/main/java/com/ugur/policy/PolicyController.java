package com.ugur.policy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyController {

	@Autowired
	PolicyService policyService;

	@RequestMapping("/getAllPolicies")
	public String getAllPolicies() {
		return policyService.getAllPolicies().toString() + "\n\r";
	}

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
}
