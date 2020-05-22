package com.fundamental;

class RBI
{
	void ROI(double rate)
	{
		
	}
}
class SBI extends RBI
{
	void ROI(double rate)
	{
		System.out.println("Rate : "+rate);
	}
}
class HDFC extends RBI
{
	void ROI(double rate)
	{
		System.out.println("Rate : "+rate);
	}
}
class ICICI extends RBI
{
	void ROI(double rate)
	{
		System.out.println("Rate : "+rate);
	}
}
public class DynamicMethodDispatch {

	public static void main(String[] args) {
	
		RBI r;
		SBI s=new SBI();
		HDFC h=new HDFC();
		ICICI i=new ICICI();
		
		r=s;
		r.ROI(5);

		r=h;
		r.ROI(6);
		
		r=i;
		r.ROI(7);
	}
}
