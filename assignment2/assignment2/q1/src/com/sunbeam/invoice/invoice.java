package com.sunbeam.invoice;

public class invoice
{
	private String partno;
	private String desc;
	private int qty;
	private double price;
	
	
	
	public invoice() 
	{
	
		this.partno = "";
		this.desc = "";
		this.qty = 0;
		this.price = 0.0;
	}
	public invoice(String partno, String desc, int qty, double price) 
	{
	
		this.partno = partno;
		this.desc = desc;
		
		if(qty<0)
			qty=0;
		this.qty = qty;
		
		
		if(price<0.0)
			price=0.0;
		this.price = price;
		
	}
	
	public double invoiceamt() 
	{
		return qty*price;
	}
	
	public String getPartno() {
		return partno;
	}
	public void setPartno(String partno) {
		this.partno = partno;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		if(qty<0)
			qty=0;
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price<0.0)
			price=0.0;
		this.price = price;
	}



}
