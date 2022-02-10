//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven {
	public static int go(int[] ray) {
		int oddIndex = -1;
		for (int i = 0; i < ray.length; i++) {
			if (ray[i] % 2 == 1) {
				oddIndex = i;
				break;
			}
		}
		int evenIndex = -1;
		for (int i = oddIndex + 1; i < ray.length; i++) {
			if (ray[i] % 2 == 0) {
				evenIndex = i;
				break;
			}
		}
		if (oddIndex >= 0 && evenIndex >= 0) {
			return evenIndex - oddIndex;
		} else {
			return -1;
		}
	}
}