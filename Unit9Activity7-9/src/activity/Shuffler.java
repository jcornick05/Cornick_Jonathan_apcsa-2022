package activity;
public class Shuffler {

	private static final int SHUFFLE_COUNT = 5;

	private static final int VALUE_COUNT = 10;

	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT + " consecutive perfect shuffles:");
		int[] values1 = new int[VALUE_COUNT];
		for (int i = 0; i < values1.length; i++) {
			values1[i] = i;
		}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			values1 = perfectShuffle(values1);
			System.out.print(" " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT + " consecutive efficient selection shuffles:");
		int[] values2 = new int[VALUE_COUNT];
		for (int i = 0; i < values2.length; i++) {
			values2[i] = i;
		}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			values2 = selectionShuffle(values2);
			System.out.print(" " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static int[] perfectShuffle(int[] values) {
		int[] tVal = new int[values.length];
		int c = 0;
		for (int i = 0; i < (values.length + 1) / 2; i++) {
			tVal[c] = values[i];
			c += 2;
		}
		c = 1;
		for (int i = (values.length + 1) / 2; i < values.length; i++) {
			tVal[c] = values[i];
			c += 2;
		}
		return tVal;
	}

	public static int[] selectionShuffle(int[] values) {
		for (int i = values.length - 1; i > 0; i--) {
			int t = (int) Math.round(Math.random() * i);
			int tmp = values[i];
			values[i] = values[t];
			values[t] = tmp;
		}
		return values;
	}
}