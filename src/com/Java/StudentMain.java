package com.Java;

import java.util.ArrayList;

class Student{
	int sid;
	String sname;
	int fee;
	public Student(int sid, String sname, int fee) {
		
		this.sid = sid;
		this.sname = sname;
		this.fee = fee;
	}
}
public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student(1, "pratik", 2000);
		Student s2 = new Student(2, "Nikhil", 2000);
		Student s3 = new Student(3, "pushpak", 2000);
		Student s4 = new Student(4, "saurabh", 2000);
		Student s5 = new Student(5, "rohan", 2000);
		
		ArrayList<Student> al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i).sid +" "+al.get(i).sname+" "+al.get(i).fee);
			
		}

	}

}
