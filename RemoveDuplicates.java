import java.util.Scanner;

public class RemoveDuplicates
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s=sc.nextLine();
		String s1="";
		for(int i=0; i<s.length();i++)
			if(!s1.contains(String.valueOf(s.charAt(i))))
				s1=s1+s.charAt(i);
		System.out.println(s1);
	}
}