package com.fundamental;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWritter {

	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("tops2.txt");
		String s="This is file reader/writter demo";
		fw.write(s);
		fw.flush();
		fw.close();
		System.out.println("Data Written Successfully");
		
		FileReader fr=new FileReader("tops2.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}
}
