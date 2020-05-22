package com.fundamental;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(1,"Ajay");
		map.put(2,"Vijay");
		map.put(3,"Jay");
		map.put(4,"Kamal");
		map.put(5,"Vinay");
		System.out.println(map);
		System.out.println(map.get(3));
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Entry) itr.next();
			System.out.print("Key : "+entry.getKey());
			System.out.println(" Value : "+entry.getValue());
		}
	}
}
