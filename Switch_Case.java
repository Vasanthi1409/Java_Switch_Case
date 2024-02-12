package Switch_Case;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the vafue of a: ");
		int a = SC.nextInt();
		System.out.println("Enter the value ol b: ");
		int b = SC.nextInt();
		System.out.println("Enter the Operator '+', '-', '*', '/', '%': ");
		char operator;
		operator = SC.next().charAt(0);

		switch (operator) {
		case '+':
			System.out.println(a + "+" + b + "=" + (a + b));
			break;

		case '-':
			System.out.println(a + "-" + b + "=" + (a - b));
			break;

		case '*':
			System.out.println(a + "*" + b + "=" + (a * b));
			break;

		case '/':
			System.out.println(a + "/" + b + "=" + (a / b));
			break;

		case '%':
			System.out.println(a + "%" + b + "=" + (a % b));
			break;

		default:
			System.out.println("You have entered the incorrect operator");
			break;
		}
	}

}
