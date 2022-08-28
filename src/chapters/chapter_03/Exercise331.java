package chapters.chapter_03;

import java.util.Scanner;

public class Exercise331 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What currency do you choose? 0 for U.S dollars, 1 for Chinese RMB");
		int answer = input.nextInt();
		if (answer == 0) {
			System.out.println("Enter the exchange rate from RMB to dollars:");
			double rate = input.nextDouble();
			System.out.println("Enter the dollar amount:");
			double amount = input.nextDouble();
			double a = rate * amount;
			System.out.println("$" + amount + " is " + a + " yuan");
		}
		if (answer == 1) {
			System.out.println("Enter the exchange rate from dollars to RMB:");
			double rate = input.nextDouble();
			System.out.println("Enter the RMB amount:");
			double amount = input.nextDouble();
			double a = rate * amount;
			System.out.println(amount + " yuan is " + " $" + a);
		}else {
			System.out.println("Incorrect input");
		}
	}

}
