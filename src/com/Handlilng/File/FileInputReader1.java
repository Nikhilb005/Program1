package com.Handlilng.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputReader1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fr = new FileInputStream("c.txt");
		int i =0;
		while((i = fr.read())!= -1) {
			System.out.print((char)i);
		}
//--------------------------------------------------------------------------------------------------------		
		
		
		
	}

}
