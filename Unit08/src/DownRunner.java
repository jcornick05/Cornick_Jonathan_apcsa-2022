//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner {
	public static void main(String args[]) {
		RayDown test = new RayDown();

		int[] arrayNumbers = { -99, 1, 2, 4, 5, 6, 7, 10 };
		System.out.println(test.go(arrayNumbers));

		int[] arrayNumbers2 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -99 };
		System.out.println(test.go(arrayNumbers2));

		int[] arrayNumbers3 = { 10, 20, 30, 40, 50, -11818, 40, 30, 20, 10 };
		System.out.println(test.go(arrayNumbers3));

		int[] arrayNumbers4 = { 32767 };
		System.out.println(test.go(arrayNumbers4));

		int[] arrayNumbers5 = { 255, 255 };
		System.out.println(test.go(arrayNumbers5));

		int[] arrayNumbers6 = { 9, 10, -88, 100, -555, 1000 };
		System.out.println(test.go(arrayNumbers6));

		int[] arrayNumbers7 = { 10, 10, 10, 11, 456 };
		System.out.println(test.go(arrayNumbers7));

		int[] arrayNumbers8 = { -111, 1, 2, 3, 9, 11, 20, 30 };
		System.out.println(test.go(arrayNumbers8));

		int[] arrayNumbers9 = { 9, 8, 7, 6, 5, 4, 3, 2, 0, -2, -989 };
		System.out.println(test.go(arrayNumbers9));

		int[] arrayNumbers10 = { 12, 15, 18, 21, 23, 1000 };
		System.out.println(test.go(arrayNumbers10));

		int[] arrayNumbers11 = { 250, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, -455 };
		System.out.println(test.go(arrayNumbers11));

		int[] arrayNumbers12 = { 9, 10, -8, 10000, -5000, 1000 };
		System.out.println(test.go(arrayNumbers12));

	}
}