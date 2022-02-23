//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven {
	public static int go(List<Integer> ray) {
		int firstOdd = -1;
		for (int i = 0; i < ray.size(); i++) {
			if (ray.get(i) % 2 == 1) {
				firstOdd = i;
				break;
			}
		}
		if (firstOdd != -1) {
			int firstEven = -1;
			for (int i = ray.size() - 1; i > firstOdd; i--) {
				if (ray.get(i) % 2 == 0) {
					firstEven = i;
					break;
				}
			}
			if (firstEven != -1) {
				return firstEven - firstOdd;
			}
		}
		return -1;
	}
}