package chapters.chapter_02;

import java.util.Scanner;

public class Exercise216 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter the side :");
		double s = input.nextDouble() ;
		double area = (int)(((3 * Math.pow(3, 0.5)) / 2) * Math.pow(s, 2) * 100 )  / 100.0 ;
		System.out.println("The area of hexagon is " + area);
	}

}
