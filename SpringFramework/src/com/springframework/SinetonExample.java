package com.springframework;

public class SinetonExample {
	
public static void main(String[] args) {
	
	// static method by using classname.methodname
	
	System.out.println(StudentService.getInstance());
	System.out.println(StudentService.getInstance());
	
	// static method by using classname.variablename
	
	System.out.println(StudentService.ss);
	System.out.println(StudentService.ss);
	
}
}
class StudentService{
	
	public static StudentService ss;
	public static StudentService getInstance() {
		
		System.out.println(ss);
		if(ss == null)
			
			ss = new StudentService();
		return ss;
	}
}
