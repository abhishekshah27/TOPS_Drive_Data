package com.fundamental;

import java.util.Scanner;

class A
{
	A()
	{
		System.out.println("A's Default Constructor");
	}
	void show()
	{
		System.out.println("Show From A");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B's Default Constructor");
	}
	void show()
	{
		super.show();
		System.out.println("Show From B");
	}
}
class C extends B
{
	C()
	{
		System.out.println("C's Default Constructor");
	}
	void show()
	{
		super.show();
		System.out.println("Show From C");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
	
		C c=new C();
		c.show();
	}
}









