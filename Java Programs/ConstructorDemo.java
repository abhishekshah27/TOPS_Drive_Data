package com.fundamental;

class box
{
	double width,height,depth;
	
	box()
	{
		System.out.println("Default Constructor");
		width=5;
		height=6;
		depth=7;
	}
	box(double w,double h,double d)
	{
		System.out.println("Parameterized Constructor");
		width=w;
		height=h;
		depth=d;
	}
	box(box b)
	{
		System.out.println("Copy Constructor");
		width=b.width;
		height=b.height;
		depth=b.depth;
	}
	void volume()
	{
		System.out.println("Volume : "+(width*height*depth));
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		box b1=new box();
		b1.volume();
		
		box b2=new box(7,8,9);
		b2.volume();
		
		box b3=new box(b2);
		b3.volume();
	}
}













