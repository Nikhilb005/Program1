package com.Handlilng.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopying {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("c.txt");
		FileOutputStream fo = new FileOutputStream("d.txt");
		int i = 0;
		while((i=fi.read())!= -1) {
			fo.write(i);
		}
	}

}
