//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jonathan Cornick
//Date - 1/20/21
//Lab  - Line

public class Line
{

	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double top;
		double bottom;
		top = y2-y1;
		bottom = x2-x1;
		return top/bottom;
	}

}