import java.util.Scanner;

public class CountCharacters
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String = ");
		String s=sc.nextLine().toLowerCase();
		String consonants="bcdfghjklmnpqrstvwxyz",vowels="aeiou",specials="~!@#$%^&*()_-+{}[];',.:\"<>?|/\\";
		int consonantsCount=0,vowelsCount=0,specialsCount=0;
		for(int i=0;i<s.length();i++)
		{
			if(consonants.contains(String.valueOf(s.charAt(i))))
				consonantsCount++;
			else if(vowels.contains(String.valueOf(s.charAt(i))))
				vowelsCount++;
			else if(specials.contains(String.valueOf(s.charAt(i))))
				specialsCount++;
		}
		System.out.println("consonantsCount is "+consonantsCount);
		System.out.println("vowelsCount is "+vowelsCount);
		System.out.println("specialsCount is "+specialsCount);
	}
}