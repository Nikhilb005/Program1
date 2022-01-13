package com.Handlilng.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {

	public static void main(String[] args) throws IOException {

		String s = "Hello World";
		FileOutputStream fo = new FileOutputStream("c.txt");
		byte b[] = s.getBytes();
		fo.write(b);
		System.out.println("file has been updated succesfully");
		fo.close();
	}

}
