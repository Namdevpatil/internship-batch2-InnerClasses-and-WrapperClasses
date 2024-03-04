package com.javaInnerClasses;


//outer classes
public class Address 
{
	
	//fields
	private String doorNo;
	private String streetName;
	private long pincode;
	private String cityName;
	
	//constructors
	public Address() 
	{
		// TODO Auto-generated constructor stub
	}

	public Address(String doorNo, String streetName, long pincode, String cityName) 
	{
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.pincode = pincode;
		this.cityName = cityName;
	}

	//method
	@Override
	public String toString() 
	{
		return "Address [doorNo=" + doorNo + ", streetName=" + streetName + ", pincode=" + pincode + ", cityName="
				+ cityName + "]";
	}
	
	//inner/nested class
	class Employee//non-static
	{
		//fields
		private int employeeId;
		private String employeeName;
		private String employeeRole;
		
		//constructors
		public Employee() 
		{
			
		}

		public Employee(int employeeId, String employeeName, String employeeRole) {
			this.employeeId = employeeId;
			this.employeeName = employeeName;
			this.employeeRole = employeeRole;
		}	
		
		//methods
		@Override
		public String toString() 
		{
			return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeRole="
					+ employeeRole +", doorNo "+doorNo+", streetName "+streetName+", pincode "+pincode+", cityName="
							+ cityName+ "]";
		}
		
		public void getDetails()
		{
			System.out.println(employeeId);
			System.out.println(employeeName);
			System.out.println(employeeRole);
			System.out.println(doorNo);
			System.out.println(streetName);
			System.out.println(pincode);
			System.out.println(cityName);
		}
			
		
	}

}
