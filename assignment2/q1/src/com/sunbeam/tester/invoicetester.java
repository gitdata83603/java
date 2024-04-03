package com.sunbeam.tester;

import com.sunbeam.invoice.invoice;

public class invoicetester 
{
  public static void main(String[] args) 
  {
	invoice in=new invoice("1","Gear",2,80.5);
	
	System.out.println("earlier price : "+in.getPrice());
	in.setPrice(0.0);
	System.out.println("new price : "+in.getPrice());
	
	System.out.println("****************************************");
	
	System.out.println("earlier price : "+in.getPrice());
	in.setPrice(80.0);
	System.out.println("new price : "+in.getPrice());
	
	System.out.println("****************************************");
	
	System.out.println("earlier qty : "+in.getQty());
	in.setQty(3);
	System.out.println("new qty: "+in.getQty());
	
	System.out.println("****************************************");
	System.out.println("Total bill : "+in.invoiceamt());
	
	
	
	
	
  }
	

}
