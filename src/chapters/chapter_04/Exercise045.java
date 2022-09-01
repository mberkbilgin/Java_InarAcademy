package chapters.chapter_04;

import java.util.Scanner;

public class Exercise045 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of sides:");
		double n = input.nextDouble();
		System.out.println("Enter the side :");
		double s = input.nextDouble();
		double area = (int)(n*s*s/(4*Math.tan(Math.PI/n))*100)/100.0;
		System.out.println("The area of the polygon is "+area);
		
	}

}
