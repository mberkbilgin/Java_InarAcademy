package chapters.chapter_03;

import java.util.Scanner;

public class Exercise322 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter coordinates for x and y");
		double x = input.nextDouble();
		double y = input.nextDouble();
		System.out.println(((Math.pow(x*x + y*y, 0.5) <= 10) ? "Point (" + x + ", " + y + ") is in the circle."
				: "Point (" + x + ", " + y + ") is not in the circle."));
	}

}
