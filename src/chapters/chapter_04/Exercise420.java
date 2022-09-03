package chapters.chapter_04;

import java.util.Scanner;

public class Exercise420 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line :");
		String st1 = input.nextLine();
		int x = st1.length();
		char ch = st1.charAt(0);
		System.out.println(st1+"'s length is "+x+" and its first character is "+ch);
	}

}
