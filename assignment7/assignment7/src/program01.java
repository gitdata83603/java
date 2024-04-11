//reveresing a string
public class program01
{

	public static void main(String[] args) 
	{
		String s1="Avdhut";
		
		
		char s[]=new char[s1.length()];
		
		int j=0;
		
		for(int i=(s1.length()-1);i>=0;i--)
		{
			s[j]=s1.charAt(i);
			j++;
		}
		
		
		System.out.println("reverese of the string is : ");
		
		for(char c:s)
		{
			System.out.print(c);
		}
		

	}

}
