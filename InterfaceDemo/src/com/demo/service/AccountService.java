package com.demo.service;

import com.demo.beans.Account;

public interface AccountService {

	void addNewData();

	Account[] displayAll();

	int withdrawAmt(int id, int pin, double amt);

	int depositAmt(int id, int pin, double amt);

	double checkBalance(int id, int pin);

	int deleteAccount(int id, int pin);

}
