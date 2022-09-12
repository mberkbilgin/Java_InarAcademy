package chapters.chapter_05.Exercise;

import java.security.interfaces.DSAKeyPairGenerator;

public class Exercise053 {

	public static void main(String[] args) {
		
		System.out.println("Kilograms      Pounds");
		for (int kilograms= 1 ;  kilograms < 200 ; kilograms += 2) {
			double pounds = (int)(kilograms * 2.2*100)/100.0 ;
			
			System.out.printf("%-15d%6.1f\n",kilograms,pounds);
		}
	
	}
	

}
