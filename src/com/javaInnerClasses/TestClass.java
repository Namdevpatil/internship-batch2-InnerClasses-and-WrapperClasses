package com.javaInnerClasses;

import com.javaInnerClasses.Address.Employee;

public class TestClass 
{

	public static void main(String[] args) 
	{		
		Address address = new Address("123-34/25A", "Vivekananda colony", 500045, "Hyderabad");
		System.out.println(address);

		System.out.println("===================================================================");
		
		Employee employee = address.new Employee(1990, "Ajay Kumar", "Software Developer");
		
		System.out.println(employee.toString());
				
	}

}
