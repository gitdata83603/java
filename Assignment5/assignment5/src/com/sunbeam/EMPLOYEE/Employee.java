package com.sunbeam.EMPLOYEE;

import java.util.Scanner;

public abstract class Employee implements Acceptable		//abstract class
{
    private String name;
    private String SSN;
    
	@Override
	public void acceptData(Scanner sc) 
	{
		System.out.println("enter name");
		name=sc.next();
		sc.nextLine();
		System.out.println("enter SSN");
		SSN=sc.nextLine();
		
	}

	@Override
	public void displayData()
	{
		System.out.println("name : "+name+"  SSN : "+SSN);
	}
	
	public abstract void calTotalSal();			//abstract method
}
