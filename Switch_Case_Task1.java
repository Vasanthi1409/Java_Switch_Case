package Switch_Case;

import java.util.Scanner;

public class Switch_Case_Task1 {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("Entey the Key value: ");
		int key = SC.nextInt();

		switch (key) {
		case 1:
			System.out.println("Print the day of week: Sunday");
			break;
		case 2:
			System.out.println("Print the day of week: Monday");
			break;
		case 3:
			System.out.println("Print the day of week: Tuesday");
			break;
		case 4:
			System.out.println("Print the day of week: Wednesday");
			break;
		case 5:
			System.out.println("Print the day of week: Thursday");
			break;
		case 6:
			System.out.println("Print the day of week: Friday");
			break;
		case 7:
			System.out.println("Print the day of week: Saturday");
			break;

		default:
			System.out.println("Incorrect Key value");
		}

	}

}
