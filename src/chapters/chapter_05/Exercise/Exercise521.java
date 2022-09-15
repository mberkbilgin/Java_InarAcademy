package chapters.chapter_05.Exercise;

import java.util.Scanner;

public class Exercise521 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Loan Amount:");
		int loan = input.nextInt();
		System.out.println("Enter Loan Amount:");
		int years = input.nextInt();
		System.out.println("Interest Rate    Monthly Payment     Total Payment");
	
		for (double rate = 5.000 ; rate <=8.000 ; rate += 0.125) {
			System.out.printf("%-5.3f",rate);
			System.out.print("%      ");
			double monthly = rate/1200 ;
			double monthlyPayment =(int)( loan * monthly / (1 - 1/Math.pow(1+monthly, years*12))*100)/100.0;
			double totalPayment = (int)(monthlyPayment * years * 12*100)/100.0 ;
			System.out.printf("%12.2f",monthlyPayment);
			System.out.printf("%22.2f\n",totalPayment);
		}
	}

}
