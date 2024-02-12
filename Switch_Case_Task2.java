package Switch_Case;

import java.util.Scanner;

public class Switch_Case_Task2 {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter an alphabet: ");
		char alphabet = SC.next().charAt(0);

		switch (alphabet) {
		case 'a':
			System.out.println("Entered alphabet is vowel");
			break;
		case 'e':
			System.out.println("Entered alphabet is vowel");
			break;
		case 'i':
			System.out.println("Entered alphabet is vowel");
			break;
		case 'o':
			System.out.println("Entered alphabet is vowel");
			break;
		case 'u':
			System.out.println("Entered alphabet is vowel");
			break;

		default:
			System.out.println("Entered alphabet is consonant");
		}

	}

}
