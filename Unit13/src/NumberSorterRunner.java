//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import static java.lang.System.*;

public class NumberSorterRunner {

	public static void main(String[] args) {
		int[] arr = { 567891, 901912468, 864213507, 898777, 234422 };
		for (int i = 0; i < arr.length; i++) {
			int[] sorter = NumberSorter.ArraySortByDigits(arr[i]);
			for (int j = 0; j < sorter.length; j++) {
				System.out.print(sorter[j] + " ");
			}
			System.out.println();
		}

	}

}