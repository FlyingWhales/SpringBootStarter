package com.ugur.circulardependency;

import org.springframework.stereotype.Component;

@Component
public class MomCat {

	private final BabyCat babycat;

	public MomCat(BabyCat babycat) {
		this.babycat = babycat;
	}

	

}
