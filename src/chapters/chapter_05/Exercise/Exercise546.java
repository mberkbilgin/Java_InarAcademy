package chapters.chapter_05.Exercise;

import java.util.Scanner;

public class Exercise546 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str1 = input.nextLine();
		String str2 ="";
		for(int i = (str1.length()-1); i>=0; i--) {
			str2 += str1.charAt(i) ;
			
		}
		System.out.println(str2);
	}

}
