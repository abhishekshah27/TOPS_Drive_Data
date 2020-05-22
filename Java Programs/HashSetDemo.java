package com.fundamental;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(10.10);
		hs.add("Tops");
		hs.add('T');
		hs.add(null);
		hs.add(true);
		hs.add(10);
		System.out.println(hs);
		System.out.println("Size : "+hs.size());
		hs.remove(10);
		System.out.println(hs);
		System.out.println("Size : "+hs.size());
	}
}
