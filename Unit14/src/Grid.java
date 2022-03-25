//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid {
	private String[][] grid;

	public Grid(int rows, int cols, String[] vals) {
		grid = new String[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int index = (int) (Math.random() * 7);
				grid[i][j] = vals[index];
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(" " + grid[i][j]);
			}
			System.out.println();
		}

	} 

	public String findMax(String[] vals) {
		int ind = 0, max;
		int[] count = new int[7];
		count[0] = countVals(vals[0]);
		count[1] = countVals(vals[1]);
		count[2] = countVals(vals[2]);
		count[3] = countVals(vals[3]);
		count[4] = countVals(vals[4]);
		count[5] = countVals(vals[5]);
		count[6] = countVals(vals[6]);
		System.out.println("\n a count is " + count[0]);
		System.out.println(" b count is " + count[1]);
		System.out.println(" c count is " + count[2]);
		System.out.println(" x count is " + count[3]);
		System.out.println(" 2 count is " + count[4]);
		System.out.println(" 7 count is " + count[5]);
		System.out.println(" 9 count is " + count[6]);

		max = 0;
		for (int i = 0; i < 7; i++) {
			if (count[i] >= max) {
				max = count[i];
				ind = i;
			}
		}
		return vals[ind];

	}

	private int countVals(String val) {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == val)
					count++;
			}
		} 
		return count;
	} 

	public String toString() {
		String output = " occurs the most";
		return output;
	}
}