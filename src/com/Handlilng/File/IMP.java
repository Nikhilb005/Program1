package com.Handlilng.File;

import java.io.FileWriter;
import java.io.IOException;

public class IMP {

	public static void main(String[] args) throws IOException {
		 String input="hi how are you";
	   	 //FileOutputStream fo=new FileOutputStream("a.txt");
	   	 FileWriter fw=new FileWriter("a.txt",true);//if the data should be binded with the previous info in the file we take the arg as true
	   	 //input-->stream of charcters
	   	 //FoS->bytes
	    //    byte b[]=input.getBytes();//charcters --> bytes  
	    //    fo.write(b);
	   	 
	   	 //for File Writer
	   	 
	   	 fw.write(input);
	   	 System.out.println("data has been put into the file ");
	    //    fo.close();
	   	 
	   	 fw.close();


	}

}
