package chapters.chapter_03;

import java.util.Scanner;

public class Exercise325 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter for x1 and y1 :");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter for x2 and y2 :");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		System.out.println("Enter for x3 and y3 :");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		System.out.println("Enter for x4 and y4 :");
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		double a = y1 - y2;
		double b = -(x1 - x2);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double c = (y3 - y4);
		double d = -(x3 - x4);
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;

		if (a * d - b * c == 0) {
			System.out.println("The two lines are parallel.");

		} else {
			double x = (int) ((e * d - b * f) / (a * d - b * c) * 10000) / 10000.0;
			double y = (int) ((a * f - e * c) / (a * d - b * c) * 10000) / 10000.0;

			System.out.print("The intersecting point is at (" + x + ", " + y + ")");
		}
	}

}
