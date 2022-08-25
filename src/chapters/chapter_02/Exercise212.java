package chapters.chapter_02;

import java.util.Scanner;

public class Exercise212 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter speed : ");
		double speed = input.nextDouble();
		System.out.println("Enter acceleration : ");
		double acceleration = input.nextDouble();
		double length = (int)((speed * speed) / ( 2 * acceleration)*100) / 100.0 ;
		
		System.out.println("The minimum length for this airplane is " + length);
		


	}

}
