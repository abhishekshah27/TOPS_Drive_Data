package com.fundamental;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student1 implements Serializable
{
	int rno;
	String fname,lname,email;
	public Student1(int rno,String fname,String lname,String email) {
		this.rno=rno;
		this.fname=fname;
		this.lname=lname;
		this.email=email;
	}
}
public class SerializationDemo {

	public static void main(String[] args) throws Exception {
		
		Student1 s=new Student1(1, "ABC", "XYZ", "abc@gmail.com");
		FileOutputStream fos=new FileOutputStream("tops3");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.flush();
		oos.close();
		
		FileInputStream fis=new FileInputStream("tops3");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student1 s1=(Student1)ois.readObject();
		System.out.println("Rno : "+s1.rno);
		System.out.println("FNAME : "+s1.fname);
		System.out.println("LNAME : "+s1.lname);
		System.out.println("EMAIL : "+s1.email);
		ois.close();
	}
}











