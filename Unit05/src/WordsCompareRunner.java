//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class WordsCompareRunner
{
	
	
   public static void main( String args[] )
   {
	   WordsCompare test = new WordsCompare();
	   
	   
	  test = new WordsCompare("one", "two");
	  System.out.println(test.toString());
	   
	  test = new WordsCompare("giraffe", "gorilla");
	  System.out.println(test.toString());
	  
	  test = new WordsCompare("fun", "funny");
	  System.out.println(test.toString());
	  
	  test = new WordsCompare("goofy", "godfather");
	  System.out.println(test.toString());
	  
	  test = new WordsCompare("funnel", "fun");
	  System.out.println(test.toString());
	  
	  test = new WordsCompare("abe", "ape");
	  System.out.println(test.toString());
	  
	}
}