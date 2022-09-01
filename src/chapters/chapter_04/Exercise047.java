package chapters.chapter_04;

import java.util.Scanner;

public class Exercise047 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the bounding circle: ");
		double r = input.nextDouble();
		double x1 = (int)(r*Math.cos(Math.PI/2-2*Math.PI/5)*10000)/10000.0;
		double y1 = (int)(r*Math.sin(Math.PI/2-2*Math.PI/5)*10000)/10000.0;
		double x2 = (int)(r*Math.cos(Math.PI/2)*10000)/10000.0;
		double y2 =(int)( r*Math.sin(Math.PI/2)*10000)/10000.0;
		double x3 = (int)(r*Math.cos(Math.PI/2+2*Math.PI/5)*10000)/10000.0;
		double y3 = (int)(r*Math.sin(Math.PI/2+2*Math.PI/5)*10000)/10000.0;
		double x4 = (int)(r*Math.cos(Math.PI/2+2*Math.PI/5+2*Math.PI/5)*10000)/10000.0;
		double y4 = (int)(r*Math.sin(Math.PI/2+2*Math.PI/5+2*Math.PI/5)*10000)/10000.0;
		double x5 = (int)(r*Math.cos(Math.PI/2+2*Math.PI/5+2*Math.PI/5+2*Math.PI/5)*10000)/10000.0;
		double y5 = (int)(r*Math.sin(Math.PI/2+2*Math.PI/5+2*Math.PI/5+2*Math.PI/5)*10000)/10000.0;
		System.out.println("The coordinates of five points on the pentagon are ");
		System.out.println("("+x1+", "+y1+")");
		System.out.println("("+x2+", "+y2+")");
		System.out.println("("+x3+", "+y3+")");
		System.out.println("("+x4+", "+y4+")");
		System.out.println("("+x5+", "+y5+")");
		
		
		
				
	}

}
