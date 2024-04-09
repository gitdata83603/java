package com.sunbeam.EMPLOYEE;

import java.util.Scanner;

public class Hourlyemployee extends Employee
{
	private int wage;
	private int hours;
	private double totalsal;
	
	@Override
	public void acceptData(Scanner sc)
	{
		// TODO Auto-generated method stub
		super.acceptData(sc);
		System.out.print("enter the wage per hour : ");
		wage=sc.nextInt();
		System.out.print("enter number of hours employee worked for : ");
		hours=sc.nextInt();
	}
	@Override
	public void calTotalSal() 
	{
		if(hours<=40)
		{
			totalsal=wage*hours;
		}
		else
		{
			totalsal=(40*wage)+(hours-40)*wage*1.5;
		}
     System.out.println("TOTAL SALARY IS : "+totalsal);
	}
	@Override
	public void displayData() 
	{
		
		super.displayData();
		System.out.println("number of hours worked : "+hours+"   wage per hour : "+wage);
		this.calTotalSal();
	}

}
