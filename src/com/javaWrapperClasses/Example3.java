package com.javaWrapperClasses;

public class Example3 {

	public static void main(String[] args) 
	{	
		//object type to primitive value: unboxing
		
		
		//Wrapper class object type
		Integer integerObject = new Integer(45);
		System.out.println(integerObject);
		
		System.out.println("-------------------------");
		//primitive value type
		//int myAge = integerObject;
		
		int myAge = integerObject.intValue();
		System.out.println(myAge);
	}

}
