package com.ugur._5.constructionorder;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class MailService {

	public MailService() {
		System.out.println("MailService.constructor");
	}

	public boolean sendMail() {
		return false;
	}
	
	@PostConstruct
	private void postInit() {
		System.out.println("@postInit MailService");
	}

}
