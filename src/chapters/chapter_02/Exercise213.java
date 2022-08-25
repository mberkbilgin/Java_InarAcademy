package chapters.chapter_02;

import java.util.Scanner;

public class Exercise213 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the montly saving amount : ");
		double money = input.nextDouble() ;
		double money1 = money * (1 + 0.00417) ; //First month
		double money2 = (money + money1) * (1 + 0.00417) ; //Second month
		double money3 = (money + money2) * (1 + 0.00417) ; //Third month
		double money4 = (money + money3) * (1 + 0.00417) ; //Fourth month
		double money5 = (money + money4) * (1 + 0.00417) ;//Fifth month
		double money6 = (int)((money + money5) * (1 + 0.00417)*100)/100.0 ;//Sixth month

		System.out.println("After the six month, the account value is : $" + money6);
		
		
	}

}
