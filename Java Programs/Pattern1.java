package com.fundamental;

public class Pattern1 {

	public static void main(String[] args) {
		int i,j,k;
		for(i=0;i<10;i++)
		{
			for(k=9;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
