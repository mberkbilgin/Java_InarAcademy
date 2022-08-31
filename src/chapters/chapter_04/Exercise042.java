package chapters.chapter_04;

import java.util.Scanner;

public class Exercise042 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter point 1 (latitude and longitude) in degrees:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter point 1 (latitude and longitude) in degrees:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double x11 = Math.toRadians(x1);
		double y11 = Math.toRadians(y1);
		double x22 = Math.toRadians(x2);
		double y22 = Math.toRadians(y2);

		double d = 6371.01 * Math.acos(Math.sin(x11) * Math.sin(x22)
				+ Math.cos(x11) * Math.cos(x22) * Math.cos(y11 - y22));

		System.out.println("The distance between the two points is " + d + " km.");

	}

}
