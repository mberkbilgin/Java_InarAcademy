package chapters.chapter_02;

import java.util.Scanner;

public class Exercise219 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter three points for triangle : ");
		System.out.println("x1 , y1 :");
		double x1 = input.nextDouble() ;
		double y1 = input.nextDouble() ;
		System.out.println("x2 , y2 :");
		double x2 = input.nextDouble() ;
		double y2 = input.nextDouble() ;
		System.out.println("x3 , y3 :");
		double x3 = input.nextDouble() ;
		double y3 = input.nextDouble() ;
		double side1 = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5) ;
		double side2 = Math.pow((Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)), 0.5) ;
		double side3 = Math.pow((Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)), 0.5) ;
		double s = (side1 + side2 + side3) / 2 ;
		double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5) ;
		
		System.out.println("The area of the triangle is : " + area);
		
	}
	

}
