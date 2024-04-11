import java.util.Scanner;

public class program03 
{

	public static void main(String[] args) 
	{
		
		String s1;
		int i;
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter the string");
		s1=sc.nextLine();
		System.out.println("entered string is : "+s1);
        
		String s2[]=s1.split(" ");
		
		for( i=0;i<s2.length;i++)
		{
			System.out.println(s2[i]);
		}
		System.out.println("noumber of words in the given string are "+i);
		
	}

}
