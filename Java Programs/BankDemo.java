package com.fundamental;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		CheckingAccount c=new CheckingAccount(101);
		System.out.println("Current Balance : "+c.getBalance());
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Amount To Deposite : ");
		double amount=sc.nextDouble();
		c.deposite(amount);
		System.out.println("Current Balance : "+c.getBalance());
		try
		{
			System.out.print("Enter Amount To Withdraw : ");
			amount=sc.nextDouble();
			c.withdraw(amount);
			System.out.println("Current Balance : "+c.getBalance());
		}
		catch(InSufficientFund e)
		{
			System.out.println("Sorry You Need Another "+e.getAmount());
			System.out.println("Current Balance : "+c.getBalance());
		}
	}
}
