package com.ugur.constructionorder;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

	MailService mailService;
	
	public MailController(MailService mailService) {
		this.mailService = mailService;
		System.out.println("MailController constructor");
	}
	
	@PreDestroy
	private void PreDestroy() {
		System.out.println("@PreDestroy");
	}

	@PostConstruct
	private void postInit() {
		System.out.println("@postInit");
	}

	@RequestMapping("/sendMail")
	public boolean sendMail() {
		return mailService.sendMail();
	}
	
}
