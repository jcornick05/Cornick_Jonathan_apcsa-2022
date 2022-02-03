//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect {
	private int number;

	// add constructors
	public Perfect() {
		setNumber(0);
	}

	public Perfect(int x) {
		setNumber(x);
	}

	// add a set method
	public void setNumber(int x) {
		number = x;
	}

	public boolean isPerfect() {
		int i = 0;
		int sum = 0;
		for (i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == number) {
			return true;
		} else {
			return false;
		}
	}

	// add a toString
	public String toString() {
		if(isPerfect() == true) {
			return number + " is perfect";
		} else {
			return number + " isn't perfect";
		}
	}
}