package chapters.chapter_04;

import java.util.Scanner;

public class Exercise041 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length from the center to a vertex: ");
		double r = input.nextDouble();
		
		double s = 2*r*Math.sin(Math.PI/5);
		double area = (int)((5*s*s)/(4*Math.tan(Math.PI/5))*100)/100.0;
		System.out.println("The area of the pentagon is " + area);
	}

}
