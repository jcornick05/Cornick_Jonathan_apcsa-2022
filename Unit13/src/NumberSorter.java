//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;


public class NumberSorter {

	private static int NumOfDigits(int num) {
		int cnt = 0;

		while (num > 0) {
			cnt++;
			num = num / 10;

		}
		return cnt;

	}

	public static int[] ArraySortByDigits(int num) {
		int length = NumOfDigits(num);
		int[] arr = new int[length];
		int i = 0;

		while (num > 0) {
			arr[i] = num % 10;
			num = num / 10;
			i++;
		}

		Arrays.sort(arr);
		return arr;

	}

}