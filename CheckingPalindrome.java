import java.util.Scanner;

public class CheckingPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number or String : ");
		String s=sc.nextLine(),s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		if(s1.equals(s))
		{
			System.out.println(s+" is palindrome");
		}
		else
		{
			System.out.println(s+" is not palindrome");
		}
	}
}
