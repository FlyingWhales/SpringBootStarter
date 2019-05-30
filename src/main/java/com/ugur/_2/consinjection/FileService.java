package com.ugur._2.consinjection;

import org.springframework.stereotype.Service;

@Service
public class FileService {
	
	public FileService() {
		System.out.println("FileService.hasDocument");
	}

	public boolean hasDocument() {
		return true;
	}

	
}
