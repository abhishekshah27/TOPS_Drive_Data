package com.fundamental;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Enumeration days;
		Vector v=new Vector();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("E");
		v.add("F");
		
		days=v.elements();
		for(Object obj:v)
		{
			System.out.println(obj);
		}
		while(days.hasMoreElements())
		{
			System.out.println(days.nextElement());
		}
	}
}
