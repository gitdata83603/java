package com.sunbeam.EMPLOYEE;

import java.util.Scanner;

public class Commissionemployee extends Employee 
{
	private int gross_sales;
	private double commission_rate;
	private double totalsal;
	@Override
	public void calTotalSal() 
	{
		totalsal=gross_sales*commission_rate/100;
		  System.out.println("TOTAL SALARY without BASE SALARY IS : "+totalsal);
		// TODO Auto-generated method stub

	}
	@Override
	public void acceptData(Scanner sc) {
		// TODO Auto-generated method stub
		super.acceptData(sc);
	
		System.out.print("enter the value of gross sales : ");
		gross_sales=sc.nextInt();
		System.out.print("enter commission rate: ");
	    commission_rate=sc.nextDouble();
	}
	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		super.displayData();
		System.out.println("gross sales RS."+gross_sales+" commission rate : "+commission_rate);
		this.calTotalSal();
	}
	public double getTotalsal() {
		return totalsal;
	}
	public void setTotalsal(double totalsal) {
		this.totalsal = totalsal;
	}
   
}
