package chapters.chapter_02;

import java.util.Scanner;

public class Exercise022 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the radius and length of a cylinder.");
		float radius = input.nextFloat();
		float length = input.nextFloat();
		float area = radius * radius * 3.14159F ;
		float volume = area * length ;

		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);

	}

}
