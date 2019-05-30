package com.ugur._6.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@Service
@RequestScope
public class PayrollService {

	private int payCount;
	
	public PayrollService(@Value("0") int payCount) {
		this.payCount = payCount;
		System.out.println("PayrollService.constructor called. Paycount is : " + this.payCount);
	}
	
	public void process() {
		payCount++;
		System.out.println("PayrollService.process(). PayCount is " + payCount);
	}
}
