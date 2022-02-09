//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

import java.util.Scanner;

public class TriplesRunner
{
   public static void main(String args[])
   {
	    Scanner scanner = new Scanner(System.in);
		Triples test = new Triples();
		System.out.print("Enter limit: ");
		int num = scanner.nextInt();
		for (int a = 1; a <= num; a++) {
			for (int b = a; b <= num; b++) {
				for (int c = b; c <= num; c++) {
					if (test.Triple(a, b, c) && test.OddEven(a, b, c) && test.GreatestCommonDenominator(a, b, c))
						System.out.println(a + " " + b + " " + c);
				}
			}
		}
	}
}