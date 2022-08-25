package chapters.chapter_02;

import java.util.Scanner;

public class Exercise217 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter the temperature in Fahrenheit between -58F and 41F : ");
		double tempt = input.nextDouble() ;
		System.out.println("Enter the wind speed (>=2) in miles per hour :");
		double speed = input.nextDouble() ;
		double windChill = 35.74 + 0.6212 * tempt - 35.75 * Math.pow(speed, 0.16) + 0.4275 * tempt * Math.pow(speed, 0.16);
		
		System.out.println("The wind chill index is " + windChill);
		
	}

}
