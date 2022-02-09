//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive {
	private char letter;

	private int amount;

	public TriangleFive() {

	}

	public TriangleFive(char c, int amt) {

		letter = c;

		amount = amt;

	}

	public void setLetter(char c) {

		letter = c;

	}

	public void setAmount(int amt) {

		amount = amt;

	}

	public String toString() {

		String output = "";

		for (int i = 0; i < amount; i++) {

			for (int j = 0; j < (amount - i); j++) {

				for (int k = 0; k < amount - j; k++) {

					if ((j + letter) > 'Z')

						output += (char) ('A' + ((j + letter) - 'Z') - 1);

					else if ((j + letter) > 'z')

						output += (char) ('a' + ((j + letter) - 'z') - 1);

					else

						output += (char) (j + letter);

				}

				output += " ";

			}

			output += "\n";

		}

		return output;

	}
}