//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive test = new TriangleFive('C', 4);
	   System.out.println(test.toString());
	   
	   test = new TriangleFive('A', 5);
	   System.out.println(test.toString());
	   
	   test = new TriangleFive('B', 7);
	   System.out.println(test.toString());
	   
	   test = new TriangleFive('X', 6);
	   System.out.println(test.toString());
	   
	   test = new TriangleFive('Z', 8);
	   System.out.println(test.toString());
	}
}