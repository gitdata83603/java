package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class test
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int x,y;
		
		System.out.println("enter first point : ");
		
		System.out.print("xaxis : ");
		x=sc.nextInt();
		
		System.out.print("yaxis : ");
		y=sc.nextInt();
		
		Point2D p1=new Point2D(x,y);
		
		System.out.println("************************************************************************************");
		
		System.out.println("enter Second point : ");
		
		System.out.print("xaxis : ");
		x=sc.nextInt();
		
		System.out.print("yaxis : ");
		y=sc.nextInt();
		
		Point2D p2=new Point2D(x,y);
		
		
		System.out.println("************************************************************************************");
		
		System.out.println("First point is : "+p1.getDetails());
		
		System.out.println("Second point is : "+p2.getDetails());
		
		System.out.println("************************************************************************************");
		
		if(p1.isEqual(p2))
		{
			System.out.println("Points are same ");
		}
		else
		{
			System.out.println("Points are not same");
			p1.calculateDistance(p2);
		}
		System.out.println("************************************************************************************");
		
		

	}

}
