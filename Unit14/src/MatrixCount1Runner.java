//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MatrixCount1Runner
{
	public static void main( String args[] ) throws Exception
	{
        MatrixCount1 mat1 = new MatrixCount1();
        int[][] data1 = {{1,2,3,4,5}, {6,7,8,9,0}, {6,7,1,2,5}, {6,7,8,9,0}, {5,4,3,2,1}};
        
        mat1.printMatrix(data1);
        mat1.countOccurence(data1,7);
        mat1.countOccurence(data1,8);
        mat1.countOccurence(data1,6);
        mat1.countOccurence(data1,21);
        
        System.out.println("");
        int[][] data2 = {{1,3,3},{5,7,7},{9,0,1}};
        mat1.printMatrix(data2);
        mat1.countOccurence(data2,4);
        mat1.countOccurence(data2,3);
        mat1.countOccurence(data2,0);
        mat1.countOccurence(data2,5);
	}
}



