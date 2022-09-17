package chapters.chapter_05.Listing;

import java.util.Scanner;

public class Exercise545 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		double j = 0;
		double m = 0;
		for(int i = 1; i <= 10; i++) {
			double k = input.nextDouble();
			j += k;
			m += k*k;
		}
		double mean = j /10;
		double deviation = (m - (j*j)/10)/9; 
		double dfinal = Math.pow(deviation, 0.5);
		
		System.out.println("The mean is "+mean);
		System.out.println("The deviation is "+dfinal);
}
}