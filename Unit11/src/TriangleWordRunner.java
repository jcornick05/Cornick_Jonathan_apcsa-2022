//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class TriangleWordRunner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word;
        char choice;
        while (true) {
            System.out.print("Enter a word :: ");
            word = in.next();
            TriangleWord.printTriangle(word);
            System.out.print("\nDo you want to enter more sample input? ");
            choice = in.next().charAt(0);
            if (choice == 'n') break;
            System.out.println();
        }
    }
}