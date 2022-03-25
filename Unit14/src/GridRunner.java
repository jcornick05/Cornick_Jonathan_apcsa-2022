//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner {
	public static void main( String args[] ) throws IOException
	{
	       String[] vals = {"a", "b", "c", "x", "2", "7", "9"};
	       Grid g = new Grid(10, 10, vals);
	       String str = g.findMax(vals);
	       System.out.println("\n\n " + str + g);
	}
}