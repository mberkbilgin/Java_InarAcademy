package weeks.week_03;

import java.util.Scanner;

public class Assignment03_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your year of service :");

		int yearOfService = input.nextInt();

		if (yearOfService > 5) {
			System.out.println("Enter your salary : ");
			double salary = input.nextDouble();
			double bonus = salary * 0.05;
			System.out.println("Your net bonus is $ " + bonus);

		} else
			System.out.println("You don't have a bonus salary.");
	}

}
