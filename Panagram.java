import java.util.Scanner;

public class Panagram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1="abcdefghijklmnopqrstuvwxyz";
		int len=0;
		if(s.length()>=26)
		{
			for(int i=0; i<s1.length();i++)
				if(s.contains(String.valueOf(s1.charAt(i))))
					len++;
			
			if(len==26)
				System.out.println("Panagram");
			else
				System.out.println("Not panagram");
		}
		else
			System.out.println("Not panagram");
	}
}
