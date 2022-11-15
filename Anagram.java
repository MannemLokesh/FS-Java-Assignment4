import java.util.Scanner;

public class Anagram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine().toLowerCase().replace(" ", "");
		String s2=sc.nextLine().toLowerCase().replace(" ", "");
		int len=0;
		if(s1.length()==s2.length())
		{
			for(int i=0; i<s1.length();i++)
				if(s2.contains(String.valueOf(s1.charAt(i))))
					len++;
			
			if(len==s1.length())
				System.out.println("Anagram");
			else
				System.out.println("Not Anagram");
		}
		else
			System.out.println("Not anagram");
	}
}
