package chapters.chapter_04;

import java.util.Scanner;

public class Exercise426 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount, for example 11.56:");
		String amount = input.nextLine();
		
		String numberofOneDollars = amount.substring(0, amount.indexOf('.'));
		
		int cents = Integer.parseInt(amount.substring(amount.indexOf('.')+1) );
		
		int numberofQuarters = cents /25 ;
		cents %= 25 ;
		
		int numberofDimes = cents / 10 ;
		cents %= 10 ;
		
		int numberofNickels = cents / 5 ;
		cents %= 5;
		
		System.out.println("Your amount "+ amount + " consist of\n"+numberofOneDollars
				+" dollars "+numberofQuarters+" quarters "+numberofDimes+" dimes "+numberofNickels+" nickels "+cents+" pennies.");
	}

}
