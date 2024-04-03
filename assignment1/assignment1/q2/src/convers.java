import java.util.Scanner;

public class convers {

	public static void main(String[] args) 
	{
		int a;
		System.out.print("enter integer value:");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("The binary representation of "+a+" : "+Integer.toBinaryString(a));
		System.out.println("The octal representation of "+a+" : "+Integer.toOctalString(a));
		System.out.println("The hex representation of "+a+" : "+Integer.toHexString(a));
	}

}
