package q1;

import java.util.Scanner;

public class conversion 
{

	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	  
	  double a=0.0,b=0.0;
	  
	  boolean flag1=false;
	  boolean flag2=false;
	  
	  System.out.print("enter the first value :");
	  
	  if(sc.hasNextDouble())
	   {
		  a=sc.nextDouble();
		  
		  System.out.println("value is "+a);
		  flag1=true;
	   }
	  else
	  {
		  System.out.println("enter a valid value");
		  
	  }
	  
	  
	  
	  
	  System.out.print("enter second value:");
	  
	  if(sc.hasNextDouble())
	   {
		  b=sc.nextDouble();
		  System.out.println("second value is "+b);
		  flag2=true;
	   }
	  else
	  {
		  System.out.println("enter a valid value");
	  }
	  
	  
	  
	  if(flag1==true && flag2==true)
	  {
		  double avg;
		  avg=(a+b)/2;
		  System.out.println("average is : "+avg);
	  }
	  else
	  {
		 System.out.println("average is not possible");
	  }

}
}
