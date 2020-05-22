package com.fundamental;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortEmpSal implements Comparator<Emp>{

	public int compare(Emp o1, Emp o2) {
		int value=0;
		if(o1.getSal()>o2.getSal())
		{
			value=1;
		}
		else if(o1.getSal()<o2.getSal())
		{
			value=-1;
		}
		else if(o1.getSal()==o2.getSal())
		{
			value=0;
		}
		return value;
	}
	
	public static void main(String[] args) {
		ArrayList<Emp> list=new ArrayList<>();
		
		Emp e1=new Emp();
		e1.setId(1);
		e1.setEname("Ajay");
		e1.setSal(15000);
		
		Emp e2=new Emp();
		e2.setId(2);
		e2.setEname("Vijay");
		e2.setSal(12000);
		
		Emp e3=new Emp();
		e3.setId(3);
		e3.setEname("Jay");
		e3.setSal(13000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);

		Collections.sort(list, new SortEmpSal());
		
		for(Emp e:list)
		{
			System.out.println("ID : "+e.getId()+" ENAME : "+e.getEname()+" Salary : "+e.getSal());
		}
	}	
	
}
