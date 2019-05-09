package com.ugur.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class AccountService {

	private int balance;

	public AccountService(@Value("5") int balance) {
		this.balance = balance;
		System.out.println("AccountService.constructor is called. Current balance is " + this.balance);

	}

	public boolean isBalanceAvailable() {
		if (balance > 0) {
			System.out.println("Balance available");
			return true;
		}

		System.out.println("Balance not available");
		return false;
	}

	public void pay() {
		balance--;
	}

}
