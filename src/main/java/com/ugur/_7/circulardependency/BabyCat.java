package com.ugur._7.circulardependency;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BabyCat {
	
	private final MomCat momcat;

	public BabyCat(@Lazy MomCat momcat) { //uncomment @Lazy to fix circular dependency problem
		this.momcat = momcat;
		System.out.println("BabyCat constructor");
	}
	
	
	
}
