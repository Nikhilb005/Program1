package com.Handlilng.File;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) throws IOException {

		String s = " good night";
		FileWriter fw = new FileWriter("c.txt");
		fw.write(s);
		System.out.println(" update successfully");
		fw.close();
	}

}
