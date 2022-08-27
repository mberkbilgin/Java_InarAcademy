package chapters.chapter_03;

import java.util.Scanner;

public class Exercise315 {

	public static void main(String[] args) {
		int lottery = (int)(Math.random()*1000);
		
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter a three digit number : ");
		int number = input.nextInt();
		int d1 = number /100 ;
		int d2 = number / 10 % 10 ;
		int d3 = number % 10 ;
		int lotteryD1 = lottery /100 ;
		int lotteryD2 = lottery /10 % 10;
		int lotteryD3 = lottery % 10 ;
		
		System.out.println("The lottery number is " + lottery);
		
		if (number == lottery ) {
			System.out.println("Congratulations! Exact match. The award is $10000");
		} else if ((d1 == lotteryD2 && d2 == lotteryD1 && d3 == lotteryD3)
			|| (d1 == lotteryD2 && d2 == lotteryD3 && d3 ==lotteryD1)
			 || (d1 == lotteryD3 && d2 == lotteryD1 && d3 == lotteryD2)
			    || (d1 == lotteryD3 && d2 == lotteryD2 && d3 == lotteryD1)
			    || (d1 == lotteryD1 && d2 == lotteryD3 && d3 == lotteryD2))
			System.out.println("Match all digits. The award is $3000");
		else if (d1 == lotteryD1 || d1 == lotteryD2 || d1 == lotteryD3 ||
				d2 == lotteryD1 || d2 == lotteryD2 || d2 == lotteryD3 ||
				d3 == lotteryD1 || d3 == lotteryD2 || d3 == lotteryD3 )
			System.out.println("Match only one digit. The award is $1000.");
		else System.out.println("Sorry :( No match.");
		
		
		
		
	}

}
