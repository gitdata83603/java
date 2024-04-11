import java.util.Scanner;

public class program02 
{

	public static void main(String[] args) 
	{
		
		String s1;
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter the string");
		s1=sc.nextLine();
		System.out.println("entered string is : "+s1);
		
		char a[]=s1.toCharArray();
	
		
		int j=0;
		int count=0;
		for(int i=(s1.length()-1);i>=0;i--)
		{
			
			if(a[j]==a[i])
			{
				count++;
			}
			else
			{
				System.out.println("NOT A PALIDROME");
				break;
			}
			j++;
		}
		
		if(count==s1.length())
		{
			System.out.println("IT IS A PALIDROME");
		}
		

	}

}
