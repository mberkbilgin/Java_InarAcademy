package chapters.chapter_04;

import java.util.Scanner;

public class Exercise423 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter employee' name :");
		String name = input.next();
		System.out.println("Enter number of hours worked in a week:");
		double hour = input.nextDouble();
		System.out.println("Enter hourly pay rate:");
		double rate = input.nextDouble();
		System.out.println("Enter federal tax withholding rate:");
		double fedTax = input.nextDouble();
		System.out.println("Enter state tax withholding rate:");
		double stateTax = input.nextDouble();
		
		System.out.println("Employee Name: "+name);
		System.out.println("Hours Worked: "+hour);
		System.out.println("Pay rate: $"+rate);
		System.out.println("Gross Pay: $"+(hour*rate));
		System.out.println("Deductions:");
		System.out.println("     Federal Witholding ("+fedTax*100+"%): $"+(rate*hour*fedTax));
		System.out.println("     State Witholding ("+stateTax*100+"%): $"+(rate*hour*stateTax));
		System.out.println("     Total Deduction: $"+((rate*hour*fedTax)+(rate*hour*stateTax)));
		System.out.println("Net Pay: $"+((rate*hour)-((rate*hour*fedTax)+(rate*hour*stateTax))));
		
		
	}

}
