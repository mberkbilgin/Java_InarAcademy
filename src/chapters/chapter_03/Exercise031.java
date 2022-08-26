package chapters.chapter_03;

import java.util.Scanner;

public class Exercise031 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ax2 + bx + c = 0 ");
		System.out.println("Enter values for a, b, c");
		double a = input.nextDouble();
		double b= input.nextDouble();
		double c = input.nextDouble();
		double r1 = (-b + Math.pow(b*b-4*(a*c), 0.5)) / (2*a) ;
		double r2 =  (-b - Math.pow(b*b - 4*(a*c), 0.5)) / (2*a) ;
		System.out.println("The root(s) of the equation is "+ r1 + " " + r2 );
		

	}

}
