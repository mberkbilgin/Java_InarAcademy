package chapters.chapter_04;

import java.util.Scanner;

public class Exercise412 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hex digit: ");
		String hex = input.nextLine();
		hex = hex.toUpperCase();
		
		char ch = hex.charAt(0) ;
		if ((ch >= 'A' && ch <= 'F') || (ch >='0' && ch <='9')) {
			
			switch (ch) {
			case '0' : System.out.println("The binary value is 0" ); break ;
			case '1' : System.out.println("The binary value is 1" ); break ;
			case '2' : System.out.println("The binary value is 10" ); break ;
			case '3' : System.out.println("The binary value is 11" ); break ;
			case '4' : System.out.println("The binary value is 100" ); break ;
			case '5' : System.out.println("The binary value is 101" ); break ;
			case '6' : System.out.println("The binary value is 110" ); break ;
			case '7' : System.out.println("The binary value is 111" ); break ;
			case '8' : System.out.println("The binary value is 1000" ); break ;
			case '9' : System.out.println("The binary value is 1001" ); break ;
			case 'A' : System.out.println("The binary value is 1010" ); break ;
			case 'B' : System.out.println("The binary value is 1011" ); break ;
			case 'C' : System.out.println("The binary value is 1100" ); break ;
			case 'D' : System.out.println("The binary value is 1101" ); break ;
			case 'E' : System.out.println("The binary value is 1110" ); break ;
			case 'F': System.out.println("The binary value is 1111" ); break;
			
			}
			
		}else System.out.println("Invalid value!");
		
		

	}
}
