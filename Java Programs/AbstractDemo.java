package com.fundamental;

abstract class Abs1
{
	void meth1()
	{
		System.out.println("Meth1");
	}
	abstract void meth2();
}
class abs2 extends Abs1
{
	void meth2() {
		System.out.println("meth2 from abs2");
	}
	
}
class abs3 extends Abs1
{
	void meth2() {
		System.out.println("meth2 from abs3");
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		abs2 a1=new abs2();
		abs3 a2=new abs3();
		a1.meth1();
		a1.meth2();
		
		a2.meth1();
		a2.meth2();
	}
}
