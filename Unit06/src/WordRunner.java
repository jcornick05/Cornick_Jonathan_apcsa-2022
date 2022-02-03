//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases		
		Word test = new Word("Hello");
		System.out.println(test.toString());
		System.out.println("");
		
		test = new Word("World");
		System.out.println(test.toString());
		System.out.println("");

		test = new Word("Jukebox");
		System.out.println(test.toString());
		System.out.println("");
		
		test = new Word("TCEA");
		System.out.println(test.toString());
		System.out.println("");
		
		test = new Word("UIL");
		System.out.println(test.toString());
		System.out.println("");
	}
}