//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*;

public class MatrixCount1 {
	public void countOccurence(int[][] mat, int val) {
		int cnt = 0;
		for (int i = 0; i < mat.length; ++i) {
			for (int j = 0; j < mat[0].length; ++j)
				if (mat[i][j] == val)
					cnt++;
		}
		System.out.println("The " + val + " count is :: " + cnt);
	}
	
	public void printMatrix(int[][] mat) {
		System.out.println("Matrix values");
		for (int i = 0; i < mat.length; ++i) {
			for (int j = 0; j < mat[0].length; ++j)
				System.out.printf("%-3d", mat[i][j]);
			System.out.println();
		}
		System.out.println();
	}
}
