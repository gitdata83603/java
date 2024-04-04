import java.util.Scanner;

class driving
{
	private int totalmiles;
	private int pricepergallon;
	private int avgmilespergallon;
	private int parkingfeeperday;
	private int tollsperday;
	
    public void accept()
    {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter total miles per day");
		this.totalmiles=sc.nextInt();
		
		System.out.println("enter price per gallon");
		this.pricepergallon=sc.nextInt();
		
		System.out.println("enter average miles per gallon");
		this.avgmilespergallon=sc.nextInt();
		
		System.out.println("enter parking fees per day");
		this.parkingfeeperday=sc.nextInt();
		
		System.out.println("enter total tolls per day");
		this.tollsperday=sc.nextInt();
	}
    public void calculatetotalcostperday()
    {
	  double totalbill=this.parkingfeeperday+this.tollsperday+(this.totalmiles/this.avgmilespergallon)*this.pricepergallon;
	  System.out.println("Total bill per day is : RS."+totalbill);
	}
}
public class drivingcost
{

	public static void main(String[] args)
	{
		driving d=new driving();
		d.accept();
		d.calculatetotalcostperday();

	}

}
