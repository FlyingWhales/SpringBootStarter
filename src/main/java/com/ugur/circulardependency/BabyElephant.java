package com.ugur.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BabyElephant {

	@Autowired
	MomElephant momElephant;
}
