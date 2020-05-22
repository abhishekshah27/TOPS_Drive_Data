package com.fundamental;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Dimensional Array A");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("Enter "+i+" Row "+j+" Column : ");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Two DImensional Array A Is");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}




