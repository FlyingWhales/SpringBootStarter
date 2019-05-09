package com.ugur.circulardependency;

import org.springframework.stereotype.Component;

@Component
public class BabyCat {
	
	private final MomCat momcat;

	public BabyCat(MomCat momcat) {
		this.momcat = momcat;
	}
	
	
	
}
