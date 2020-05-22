package com.fundamental;

class Student
{
	int rno;
	String sname;
	public Student() {

	}
	public Student(int rno,String sname)
	{
		this();
		this.rno=rno;
		this.sname=sname;
	}
	void test()
	{
		System.out.println("Rno : "+rno);
		System.out.println("Sname : "+sname);
	}
	void display(Student s)
	{
		System.out.println("Rno : "+s.rno);
		System.out.println("Sname : "+s.sname);
	}
	void show()
	{
		this.test();
		display(this);
	}
}

public class thisDEmo {

}
