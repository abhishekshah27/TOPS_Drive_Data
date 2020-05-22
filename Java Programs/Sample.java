package com.fundamental;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value Of A:");
		a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("A Is Even Number");
		}
		else
		{
			System.out.println("A Is Odd Number");
		}
	}
}
