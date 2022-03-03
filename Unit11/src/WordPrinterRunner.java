//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class WordPrinterRunner {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String word;
		int count;
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter the word to display :: ");
			word = in.next();
			System.out.print("Enter the times to display :: ");
			count = in.nextInt();

			WordPrinter.printWord(word, count);
			System.out.println();
		}
	}
}
