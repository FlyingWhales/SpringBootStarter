package com.ugur._4.ifinjection;

import org.springframework.stereotype.Service;

@Service
public class WSClauseService implements ClauseServiceInterface {

	public WSClauseService() {
		System.out.println("WSClauseService()");
	}

	@Override
	public String getClauses() {
		return "WSClauseService";
	}
}