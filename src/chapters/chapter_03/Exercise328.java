package chapters.chapter_03;

import java.util.Scanner;

public class Exercise328 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("Enter r1's center x-, y-coordinates, width, and height:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		
		System.out.println("Enter r2's center x-, y-coordinates, width, and height:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();
		
		double x1max = x1 + width1 /2 ;
		double x1min = x1 - width1 /2 ;
		double y1max = y1 + height1 /2 ;
		double y1min = y1 - height1 / 2 ;
		
		double x2max = x2 + width2 /2 ;
		double x2min = x2 - width2 /2 ;
		double y2max = y2 + height2 /2 ;
		double y2min = y2 - height2 / 2 ;
		
		if (x2max <= x1max && x1min <= x2min && y2max <= y1max && y1min <= y2min) {
			System.out.println("r2 is inside r1.");
		}else if (x1max < x2max && x2min < x1max || x2min < x1min && x1min < x2max || y1max < y2max && y2min < y1max || y2min < y1min && y1min < y2max) {
			System.out.println("r2 overlaps r1");
		}else System.out.println("r2 does not overlap r1");
	}

}
