package com.fundamental;

public class CmdArgu {

	public static void main(String[] args) {
		System.out.println("args[0] : "+args[0]);
		System.out.println("args[1] : "+args[1]);
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println(a+b);
	}
}
