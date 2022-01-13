package com.Handlilng.File;

//Task:
//2 files a.txt and b.txt
//a.txt->this is my simplilearn session on files
//copy   b.txt

//copy file
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Imp3{
    public static void main(String[] args) throws IOException {
   	 //same code for FR
   	 FileInputStream fi=new FileInputStream("a.txt");
   	 FileOutputStream fo=new FileOutputStream("b.txt");
   	 //fi.read()--->integer values -1
   	 //a single byte info a-only ascii value
   	 int i=0;
   	 //need to read all the charcters ascii value untill i get the EOF
    while((i=fi.read())!=-1) {
   	 fo.write(i);
   	 
    }
   	 
   	 
    }
}
