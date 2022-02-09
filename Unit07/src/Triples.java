import java.util.*;

public class Triples {
	public boolean Triple(int a, int b, int c) {
		if (a * a + b * b == c * c)
			return true;
		else
			return false;
	}

	boolean OddEven(int a, int b, int c) {
		if (a % 2 == 0 && b % 2 != 0)
			return true;
		else if (a % 2 != 0 && b % 2 == 0)
			return true;
		else
			return false;
	}

	boolean GreatestCommonDenominator(int a, int b, int c) {
		int div = 1;
		for (int i = 1; i < c; i++)
			if (a % i == 0 && b % i == 0 && c % i == 0)
				div = i;
		if (div == 1)
			return true;
		else
			return false;
	}
}