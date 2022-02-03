//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Perfect test = new Perfect(496);
		System.out.println(test.toString());
		
		test = new Perfect(45);
		System.out.println(test.toString());
		
		test = new Perfect(6);
		System.out.println(test.toString());
		
		test = new Perfect(14);
		System.out.println(test.toString());
		
		test = new Perfect(8128);
		System.out.println(test.toString());
		
		test = new Perfect(1245);
		System.out.println(test.toString());
		
		test = new Perfect(33);
		System.out.println(test.toString());
		
		
		test = new Perfect(28);
		System.out.println(test.toString());
		
		test = new Perfect(27);
		System.out.println(test.toString());
		
		test = new Perfect(33550336);
		System.out.println(test.toString());
	}
}