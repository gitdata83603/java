package com.sunbeam.Tester;

import java.util.Scanner;

import com.sunbeam.EMPLOYEE.Basesalariedemployees;
import com.sunbeam.EMPLOYEE.Commissionemployee;
import com.sunbeam.EMPLOYEE.Employee;
import com.sunbeam.EMPLOYEE.Hourlyemployee;
import com.sunbeam.EMPLOYEE.Salariedemployee;

public class Test
{

	public static void main(String[] args) 
	{
		int choice;
		
		Scanner sc=new Scanner(System.in);
		Employee e=null;
		System.out.println(" 0.EXIT ");
		System.out.println(" 1.CHECK SALARY OF SALARIED_EMPLOYEES ");
		System.out.println(" 2.CHECK SALARY OF HOURLY_EMPLOYEES");
		System.out.println(" 3.CHECK SALARY OF COMMISION_EMPLOYEES");
		System.out.println(" 4.CHECK SALARY OF BASE_SALARIED_EMPLOYEES");
		System.out.print("enter choice : ");
		choice=sc.nextInt();
		
		switch (choice) 
		{
		case 0:
			System.out.println("Thanks");
			break;
			
		case 1:
		{
			e=new Salariedemployee();
			e.acceptData(sc);
			e.displayData();
		}				
				break;
			
		case 2:
		{
			e=new Hourlyemployee();
			e.acceptData(sc);
			e.displayData();
		}
			break;
		
		case 3:
		{
			e=new Commissionemployee();
			e.acceptData(sc);
			e.displayData();
		}
			break;
			
		
		case 4:
		{
			e=new Basesalariedemployees();
			e.acceptData(sc);
			e.displayData();
			System.out.println("Press 1 for giving 10% on base salary");
			choice=sc.nextInt();
			if(choice==1)
			{	
				if(e instanceof Basesalariedemployees)
				{
					Basesalariedemployees l=(Basesalariedemployees)e;
					l.reward();
					System.out.println("salary after giving reward");
					l.calTotalSal();
				}
			}
		}
			break;
			
		default:
			System.out.println("Enter a valid choice");
			break;
		}

	}

}
