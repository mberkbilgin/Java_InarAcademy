package chapters.chapter_02;

import java.util.Scanner;

public class Checkpoint217 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
		System.out.println("Firstly enter a number for m "
				+ "secondly enter a number for r");
		
		float m = input.nextFloat() ;
		
		float r = input.nextFloat() ;
		 
		float result = m * r * r  ;
		
		System.out.println("resut is " + result);
	}
}
