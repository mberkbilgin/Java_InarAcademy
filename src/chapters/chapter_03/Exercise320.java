package chapters.chapter_03;

import java.util.Scanner;

public class Exercise320 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit between -58F and 41F : ");
		double tempt = input.nextDouble();
		if (-58 < tempt && tempt <= 41) {
			System.out.println("Enter the wind speed (>=2) in miles per hour :");
			double speed = input.nextDouble();
			if (speed < 2 ) {
				System.out.println("The value is invalid.");
			}else {
				double windChill = 35.74 + 0.6212 * tempt - 35.75 * Math.pow(speed, 0.16)
				+ 0.4275 * tempt * Math.pow(speed, 0.16);

		System.out.println("The wind chill index is " + windChill);
			}
		} else
			System.out.println("The value is invalid.");
		
		

	}

}
