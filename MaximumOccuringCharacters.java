import java.util.Scanner;

public class MaximumOccuringCharacters 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s=sc.nextLine().toLowerCase().replace(" ", "");
		int iter=0;
		int count1=0;
		for(int i=0; i<s.length();i++)
		{
			int count2=0;
			for(int j=0;j<s.length();j++)
				if(s.charAt(i)==s.charAt(j))
					count2++;
			
			if(count2>count1)
			{
				count1=count2;
				iter=i;
			}
		}
		System.out.println("most occuring character is "+s.charAt(iter));
	}

}
