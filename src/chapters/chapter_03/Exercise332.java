package chapters.chapter_03;

import java.util.Scanner;

public class Exercise332 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three points for p0 :");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		System.out.println("Enter three points for p1 :");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.println("Enter three points for p2 :");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double a = (x1 - x) * (y2 - y) - (x2 - x) * (y1 - y);
		if (a > 0) {
			System.out.println("("+x2+", "+y2+") is on the left side of the line from "+"("+x+", "+y+") to ("+x1+", "+y1+")");
		} else if (a == 0) {
			System.out.println("("+x2+", "+y2+") is on the line from "+"("+x+", "+y+") to ("+x1+", "+y1+")");
			
		}else if (a < 0) {
			System.out.println("("+x2+", "+y2+") is on the right side of the line from "+"("+x+", "+y+") to ("+x1+", "+y1+")");
		}

	}

}
