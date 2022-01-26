//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		//System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		//System.out.println("5 is even :: " + NumberVerify.isEven(5));
		
		//add in more test cases
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a whole number :: ");
		int amt = keyboard.nextInt();
		System.out.println(amt + " is a even number: " + NumberVerify.isEven(amt));
		System.out.println(amt + " is a odd number: " + NumberVerify.isOdd(amt));
		System.out.println("");
		
		out.print("Enter a whole number :: ");
		int amc = keyboard.nextInt();
		System.out.println(amc + " is a even number: " + NumberVerify.isEven(amc));
		System.out.println(amc + " is a odd number: " + NumberVerify.isOdd(amc));
		System.out.println("");
		
		out.print("Enter a whole number :: ");
		int amx = keyboard.nextInt();
		System.out.println(amx + " is a even number: " + NumberVerify.isEven(amx));
		System.out.println(amx + " is a odd number: " + NumberVerify.isOdd(amx));
		System.out.println("");

		//all numbers were tested
	}
}