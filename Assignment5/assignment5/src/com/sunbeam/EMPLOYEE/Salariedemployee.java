package com.sunbeam.EMPLOYEE;

import java.util.Scanner;

public class Salariedemployee extends Employee 
{
	private int weeklysal=20000;

	@Override
	public void calTotalSal() 
	{
		System.out.println("weekly salary is : "+weeklysal);
	}
	@Override
	public void acceptData(Scanner sc) 
	{
		super.acceptData(sc);
		System.out.println("enter weekly salary");
		weeklysal=sc.nextInt();
	}
	@Override
	public void displayData() 
	{
		// TODO Auto-generated method stub
		
		super.displayData();
		calTotalSal();
	}

}
