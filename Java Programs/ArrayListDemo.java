package com.fundamental;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(10.10);
		al.add("Tops");
		al.add('T');
		al.add(null);
		al.add(true);
		al.add(10);
		
		System.out.println(al);
		System.out.println("Size Of List : "+al.size());
		al.remove(4);
		System.out.println(al);
		System.out.println("Size Of List : "+al.size());
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println("Ele : "+obj);
			
		}
	}
}
