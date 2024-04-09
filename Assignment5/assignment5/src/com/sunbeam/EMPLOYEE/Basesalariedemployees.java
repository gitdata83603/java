package com.sunbeam.EMPLOYEE;

import java.util.Scanner;

public class Basesalariedemployees extends Commissionemployee 
{
  private double base_salary;
  
  @Override
	public void acceptData(Scanner sc)
  {
		// TODO Auto-generated method stub
		super.acceptData(sc);
		System.out.print("enter base salary : ");
		base_salary=sc.nextDouble();
	}
  @Override
	public void displayData() 
  {
		
		super.displayData();
		System.out.println("Base salary : RS."+base_salary);
		this.calTotalSal();
		
	}
  @Override
	public void calTotalSal() 
    {
	    super.calTotalSal();
		this.setTotalsal(this.getTotalsal()+base_salary);
		System.out.println("total salary is : RS."+this.getTotalsal());
	}
  	public void reward() 
  	{
  		base_salary=base_salary*0.10+base_salary;
  	}
  
}
