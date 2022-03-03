class Rational implements Comparable<Rational> {

	// represent numerator and denominator

	private int num;

	private int den;

	// constructor having 2 parameter numerator & denominator

	public Rational(int num, int den) {

		// calling setRational() to validate and set the number

		setRational(num, den);

	}

	// default constructor

	public Rational() {

		// default initializing a rational number by 1/1

		this(1, 1);

	}

	public int compareTo(Rational other) {

		double absoluteValue1 = (double) this.num / this.den;

		double absoluteValue2 = (double) other.num / other.den;

		// comparing absolute numbers

		if (absoluteValue1 < absoluteValue2) {

			return -1;

		} else if (absoluteValue1 > absoluteValue2) {

			return 1;

		}

		return 0;

	}

	// set the Rational number with given numerator & denominator

	public void setRational(int num, int den) {

		if (den == 0) // denominator can't be 0

			den = 1; // for invalid input, setting denominator to 1

		// set values

		this.num = num;

		this.den = den;

		// reducing to lowest terms

		reduce();

	}

	// addition method

	public void add(Rational other) {

		int N = (this.num * other.den)

				+ (this.den * other.num);

		int D = this.den * other.den;

		num = N;

		den = D;

		reduce();

	}

	private void reduce() {

		int gcd = gcd(num, den);

		num = num / gcd;

		den = den / gcd;

		if (den < 0) {

			num *= -1;

			den *= -1;

		}

	}

	private int gcd(int num1, int num2) {

		if (num2 == 0)

			return num1;

		return gcd(num2, num1 % num2);

	}

	protected Object clone() {

		return new Rational(num, den);

	}

	@Override

	public boolean equals(Object other) {
		if (other instanceof Rational) {
			Rational r = (Rational) other;
			return this.num == r.num && this.den == r.den;

		}

		return false;

	}

	@Override

	public String toString() {

		return num + "/" + den;

	}

}