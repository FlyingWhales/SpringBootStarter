package com.ugur.ifinjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class DBClauseService implements ClauseServiceInterface {

	public DBClauseService() {
		System.out.println("DBClauseService()");
	}

	@Override
	public String getClauses() {
		return "DBClauseService";

	}

}
