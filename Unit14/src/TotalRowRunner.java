//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		int[][] arr1 = {{1, 2, 3}, {5, 5, 5, 5}};
        int[][] arr2 = {{1, 2, 3}, {5}, {1}, {2, 2}};
        int[][] arr3 = {{1, 2}, {5, 5}, {5, 5}, {4, 5, 6, 7}, {123124, 12312}};

        System.out.println("Row totals are :: " + TotalRow.getRowTotals(arr1));
        System.out.println("Row totals are :: " + TotalRow.getRowTotals(arr2));
        System.out.println("Row totals are :: " + TotalRow.getRowTotals(arr3));		
	}
}



