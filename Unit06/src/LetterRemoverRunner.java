//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner {
	public static void main(String args[]) {
		// add test cases
		LetterRemover test = new LetterRemover("I am Sam I am", 'a');
		System.out.println(test.toString());
		System.out.println(test.removeLetters());
		System.out.println("");

		test = new LetterRemover("ssssssssxssssesssssesss", 's');
		System.out.println(test.toString());
		System.out.println(test.removeLetters());
		System.out.println("");

		test = new LetterRemover("qwertyqwertyqwerty", 'a');
		System.out.println(test.toString());
		System.out.println(test.removeLetters());
		System.out.println("");

		test = new LetterRemover("abababababa", 'b');
		System.out.println(test.toString());
		System.out.println(test.removeLetters());
		System.out.println("");

		test = new LetterRemover("abaababababa", 'x');
		System.out.println(test.toString());
		System.out.println(test.removeLetters());
		System.out.println("");

	}
}