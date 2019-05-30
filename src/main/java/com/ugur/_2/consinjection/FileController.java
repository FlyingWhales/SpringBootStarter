package com.ugur._2.consinjection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

	final private FileService finalService;
	
	public FileController(FileService finalService) {
		this.finalService = finalService;
	}


	@RequestMapping("/hasDocument")
	public boolean hasDocument() {
		
		return finalService.hasDocument();
		
	}
	
}
