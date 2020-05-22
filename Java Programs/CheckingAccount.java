package com.fundamental;

public class CheckingAccount {

	int acno;
	double balance=0;
	
	public CheckingAccount(int acno) {
		this.acno=acno;
	}
	
	public void deposite(double amount)
	{
		balance=balance+amount;
	}
	
	public void withdraw(double amount) throws InSufficientFund
	{
		
		
		if(amount<=balance)
		{
			balance=balance-amount;
		}
		else
		{
			double needs=amount-balance;
			throw new InSufficientFund(needs);
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
}
