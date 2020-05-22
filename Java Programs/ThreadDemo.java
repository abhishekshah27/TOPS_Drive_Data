package com.fundamental;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("Current Thread : "+t);
		t.setName("My Thread");
		System.out.println("After Name Change : "+t);
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(t+" : "+i);
				Thread.sleep(3000);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
