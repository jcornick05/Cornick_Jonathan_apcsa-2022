public class CardTester {

	public static void main(String[] args) {

		Card c1 = new Card("King", "Clubs", 10);

		Card c2 = new Card("7", "Diamonds", 7);

		Card c3 = new Card("10", "Spades", 10);
		
		System.out.println(c1.toString());
		
		System.out.println(c2.toString());

		System.out.println(c3.toString());
		
		System.out.println("");
		
		System.out.println("Card One: ");

		System.out.println(c1.rank());

		System.out.println(c1.suit());

		System.out.println(c1.pointValue());
		
		System.out.println("");
		
		System.out.println("Card Two: ");

		System.out.println(c2.rank());

		System.out.println(c2.suit());

		System.out.println(c2.pointValue());
		
		System.out.println("");
		
		System.out.println("Card Three: ");

		System.out.println(c1.rank());

		System.out.println(c1.suit());

		System.out.println(c1.pointValue());
		
		System.out.println("");

		
		System.out.println("Card one matches card two: ");
		System.out.println(c1.matches(c2));
		
		System.out.println("Card two matches card three: ");
		System.out.println(c2.matches(c3));


	}

}