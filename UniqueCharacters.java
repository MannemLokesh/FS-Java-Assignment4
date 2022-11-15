import java.util.Scanner;

public class UniqueCharacters 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s=sc.nextLine().toLowerCase();
		boolean flag=true;
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
				if(s.charAt(i)==s.charAt(j))
					count++;
			
			if(count>1)
			{
				System.out.println(s+" not contains unique characters");
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(s+" contains unique characters");
	}
}
