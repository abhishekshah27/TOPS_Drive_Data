package com.fundamental;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.print("Enter Value Of A:");
			a=sc.nextInt();
			System.out.print("Enter Value Of B:");
			b=sc.nextInt();
			c=a/b;
			System.out.println("Divsion : "+c);
			int arr[]= {1,2,3};
			arr[7]=45;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Caught");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Exception Caught");
		}
		catch (Exception e) {
			System.out.println("Exception Caught");
		}
		System.out.println("End Of The Program");
	}
}
