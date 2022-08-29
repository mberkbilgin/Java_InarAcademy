package weeks.week_03;

import java.util.Scanner;

public class Assignment03_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter 4 digit number : (e.g., 1234) ");
		int  number = input.nextInt();
				
		int d1 = number / 1000 ;
		int d2 = number / 100 % 10 ;
		int d3 = number / 10 % 10 ;
		int d4 = number % 10 ;
		
		System.out.println(d4+""+d3+""+d2+""+d1);
				
	}

}
