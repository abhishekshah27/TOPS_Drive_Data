package com.fundamental;

class NewThread implements Runnable
{
	Thread t;
	String tname;
	public NewThread(String tname)
	{
		this.tname=tname;
		t=new Thread(this,tname);
		t.start();
	}
	public void run() {
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(t+" : "+i);
				Thread.sleep(500);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Child Thread Exited");
	}
	
}

public class CreatingThread {

	public static void main(String[] args) {
		new NewThread("one");
		new NewThread("two");
		new NewThread("three");
		
		Thread t=Thread.currentThread();
		System.out.println("Current Thread : "+t);
		t.setName("My Thread");
		System.out.println("After Name Change : "+t);
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(t+" : "+i);
				Thread.sleep(1000);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main Thread Exited");
	}
}
