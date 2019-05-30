package com.ugur._7.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircusController {

	
	@Autowired
	MomElephant momElephant;
	
	@Autowired
	BabyElephant babyElephant;
	
	@Autowired
	MomCat momCat;
	
	@Autowired
	BabyCat babyCat;
	
	@RequestMapping("showElephants")
	public boolean showElephants() {
		
		return true;
	}
	
	@RequestMapping("showCats")
	public void showCats() {
		System.out.println(this.babyCat);
	}
	
}
