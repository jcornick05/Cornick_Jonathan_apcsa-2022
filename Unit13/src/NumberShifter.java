//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import static java.lang.System.*;

public class NumberShifter {
	public static int[] makeLucky7Array(int size) {
		Random rand = new Random();
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			int n = rand.nextInt(10) + 1;
			arr[i] = n;
		}
		System.out.println("input array: " + arr + "");
		return arr;
	}

	public static void shiftEm(int[] array) {
		int i = 0;
		for (int j = 0; j < array.length; j++) {
		if (array[j] == 7) {

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		i++;
		}
		}
		System.out.print(" output array : ");
		for ( i = 0; i < array.length; i++) {

		System.out.print(" ");
		System.out.print(array[i]);
		}
	}
}