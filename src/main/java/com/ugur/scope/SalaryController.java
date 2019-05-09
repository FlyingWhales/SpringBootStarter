package com.ugur.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalaryController {

	@Autowired
	private AccountService accountService;
	
	@Autowired
	private PayrollService payrollService;

	@RequestMapping("/processSalaries")
	public boolean processSalaries() {
		
		if (accountService.isBalanceAvailable()) {
			accountService.pay();
			payrollService.process();
			return true;
		}
		
		return false;
	}
	
	
}
