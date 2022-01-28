//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a string :: ");
		String word = kb.next();
		StringOddOrEven s = new StringOddOrEven(word);
		System.out.println(s.toString());
		System.out.println();
		
		System.out.println("Enter a string :: ");
		word = kb.next();
		s = new StringOddOrEven(word);
		System.out.println(s.toString());
		System.out.println();
		
		System.out.println("Enter a string :: ");
		word = kb.next();
		s = new StringOddOrEven(word);
		System.out.println(s.toString());
		System.out.println();
		
		System.out.println("Enter a string :: ");
		word = kb.next();
		s = new StringOddOrEven(word);
		System.out.println(s.toString());
		System.out.println();
		
		System.out.println("Enter a string :: ");
		word = kb.next();
		s = new StringOddOrEven(word);
		System.out.println(s.toString());
		System.out.println();

	}
}