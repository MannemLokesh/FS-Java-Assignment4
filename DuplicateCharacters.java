import java.util.Scanner;

public class DuplicateCharacters 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String=");
		String s=sc.nextLine();
		String s1="";
		//to store duplicate characters in String s1
		for(int i=0;i<s.length();i++)
		{
			int count =0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count>1)
			{
				s1=s1+s.charAt(i);
			}
		}
		
		//to remove the repeated characters from the string s1
		//so that we can able to print only duplicate characters and the characters or not repeated
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			if(!s2.contains(String.valueOf(s1.charAt(i))))
			{
				s2=s2+s1.charAt(i);
			}
		}
		
		//to print duplicate characters as a string
		System.out.println(s2);
	}
}