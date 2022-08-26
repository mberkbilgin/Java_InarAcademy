package chapters.chapter_03;

import java.util.Scanner;

public class Exercise035 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter today's day : ");
		int today = input.nextInt();
		switch (today % 7) {
		case 0:
			System.out.println("Today is sunday.");
			break;
		case 1:
			System.out.println("Today is monday.");
			break;
		case 2:
			System.out.println("Today is tuesday.");
			break;
		case 3:
			System.out.println("Today is wednesday.");
			break;
		case 4:
			System.out.println("Today is thursday.");
			break;
		case 5:
			System.out.println("Today is friday.");
			break;
		case 6:
			System.out.println("Today is saturday."); 
			
		}

			System.out.println("Enter the number of days elapsed since today : ");
			int future = input.nextInt();

			switch ((future + today) % 7) {
			case 0:
				System.out.println("Future day is sunday.");
				break;
			case 1:
				System.out.println("Future day is monday.");
				break;
			case 2:
				System.out.println("Future day is tuesday.");
				break;
			case 3:
				System.out.println("Future day is wednesday.");
				break;
			case 4:
				System.out.println("Future day is thursday.");
				break;
			case 5:
				System.out.println("Future day is friday.");
				break;
			case 6:
				System.out.println("Future day is saturday.");
				break;
			}

		}

	}


