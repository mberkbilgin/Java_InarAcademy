package chapters.chapter_05.Exercise;

import java.util.Scanner;

public class Exercise548 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		String str1 = "";
		
		for (int i = 0; i < str.length(); i +=2  ) {
			str1 += str.charAt(i);
		}
		System.out.println(str1);
	}

}
