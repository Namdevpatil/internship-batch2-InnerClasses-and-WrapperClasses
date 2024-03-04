package com.javaWrapperClasses;

public class Example2 {

	public static void main(String[] args) 
	{	
		//primitive value to object type: auto boxing
		
		//primitive value 
		int age = 30;		
		System.out.println(age);
		
		//Wrapper class object type
		
		//Integer integerObject = age;		
		Integer integerObject = Integer.valueOf(age);
		System.out.println(integerObject);
		
		
	}

}
