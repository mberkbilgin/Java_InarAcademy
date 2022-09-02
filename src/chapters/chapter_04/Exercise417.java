package chapters.chapter_04;

import java.util.Scanner;

public class Exercise417 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year :");
		int year = input.nextInt();
		System.out.println("Enter a month :");
		String month = input.next();
		month = month.toLowerCase();
		month = month.substring(0, 3);

		switch (month) {
		case "jan":
			System.out.println("Jan " + year + " has 31 days");
			break;
		case "feb":
			System.out.println((year % 4 != 0) ? "Feb " + year + " has 28 days" : "Feb " + year + " has 29 days");
			break;
		case "mar":
			System.out.println("March " + year + " has 31 days");
			break;
		case "apr":
			System.out.println("April " + year + " has 30 days");
			break;
		case "may":
			System.out.println("May " + year + " has 31 days");
			break;
		case "jun":
			System.out.println("June " + year + " has 30 days");
			break;
		case "jul":
			System.out.println("July " + year + " has 31 days");
			break;
		case "aug":
			System.out.println("August " + year + " has 31 days");
			break;
		case "seb":
			System.out.println("Sebtember " + year + " has 30 days");
			break;
		case "oct":
			System.out.println("Oct " + year + " has 31 days");
			break;
		case "nov":
			System.out.println("Nov " + year + " has 30 days");
			break;
		case "dec":
			System.out.println("Dec " + year + " has 31 days");

		}

	}

}
