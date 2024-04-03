package q3;

import java.util.Scanner;

public class menu
{

	public static void main(String[] args) 
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("welocome to the hotel");
		int a,total=0;
		
		
	    do 
	    {
	    	System.out.println("Menu :   1.IDLI  PRICE:20   2. DOSA  PRICE:30   3. UTTAPA  PRICE:40  4. GENERATE BILL ");
	    	System.out.print("Enter choice : ");
			choice=sc.nextInt();
			
			  switch (choice) 
			  {
			     
			    	
			     case 1:
			     {
			    	 System.out.println("IDLI  PRICE: RS.20 FOR 1");
			    	 System.out.print("Enter quantity of IDLIS : ");
			    	 a=sc.nextInt();
			    	 total=total+a*20;
			     }	
			    	break;
			    	
			    	
			    	
			     case 2:
			     {
			    	 System.out.println(" DOSA  PRICE:RS.30 FOR 1 ");
			    	 System.out.print("Enter quantity of DOSAS : ");
			    	 a=sc.nextInt();
			    	 total=total+a*30;
			     }	
			    	break;
			    	
			    	
			    	
			     case 3:
			     {
			    	 System.out.println(" UTTAPA  PRICE: RS.40 FOR 1");
			    	 System.out.print("Enter quantity of UTTAPAS : ");
			    	 a=sc.nextInt();
			    	 total=total+a*40;
			     }	
			    	break;
			    
			    	
			    	
			     case 4:
			    	 System.out.println("Thanks");
			    	 System.out.println("Total BILL IS : RS."+total);
			    	break;
	
			    	
			    	
		     	default:
		     		System.out.println("Enter a valid choice");
			    	break;
			
			  }	
		} while (choice!=4);
		
	}

}
