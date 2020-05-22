package com.fundamental;

public class StaticDemo {

	static int a=10;
	static int b;
	
	static void meth(int x)
	{
		System.out.println("X : "+x);
		System.out.println("A : "+a);
		System.out.println("B : "+b);
	}
	static
	{
		System.out.println("Static Block Initialized");
		b=a*4;
	}
	public static void main(String[] args) {
		meth(12);
	}
}
