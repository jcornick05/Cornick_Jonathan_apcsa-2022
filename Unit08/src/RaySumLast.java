//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast {
	public static int go(int[] ray) {
		int count = 0, sum = 0;
		for (int i = 0; i < ray.length; i++) {
			if (ray[i] > ray[ray.length - 1]) {
				count++;
				sum += ray[i];
			}
		}
		if (count == 0) {
			return -1;
		} else {
			return sum;
		}
	}
}