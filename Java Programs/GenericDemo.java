package com.fundamental;

public class GenericDemo {

	public static <E> void printArray(E[] inputArray)
	{
		for(E ele:inputArray)
		{
			System.out.print(" "+ele);
		}
	}
	public static void main(String[] args) {
		Integer []intArray= {1,2,3,4,5};
		Double []doubleArray= {1.1,2.2,3.3,4.4,5.5};
		Character []charArray= {'T','O','P','S'};
		
		System.out.println("printArray Method Called With Integer");
		printArray(intArray);
		System.out.println();
		
		System.out.println("printArray Method Called With Double");
		printArray(doubleArray);
		System.out.println();
		
		System.out.println("printArray Method Called With Character");
		printArray(charArray);
	}
}
