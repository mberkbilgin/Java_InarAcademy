package chapters.chapter_02;

import java.util.Scanner;

public class Exercise214 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in) ;
	System.out.println("Enter weight in pounds : ");
	double weight = input.nextDouble() * 0.45359237;//in kilograms
	System.out.println("Enter height in inches : ");
	double height = input.nextDouble() * 0.0254 ;//in meters
	double bmi = (int)(weight / (height * height)*100)/100.0 ;
	
	System.out.println("BMI is :"+ bmi);
}
}
