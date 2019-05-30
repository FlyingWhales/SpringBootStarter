package com.ugur._7.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MomElephant {

	@Autowired
	BabyElephant babyElephant;
}
