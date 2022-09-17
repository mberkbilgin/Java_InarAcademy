package chapters.chapter_05.Listing;

import java.util.Scanner;

public class Exercise551 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str1 = input.nextLine();
		System.out.println("Enter the second string: ");
		String str2 = input.nextLine();
		String str = "";
		
		int i = 0;
		
		while(str1.charAt(i) == str2.charAt(i)) {
			str += str1.charAt(i);
			i++;

		}
		if(str.length()>0) {
			System.out.println("The common prefix is "+str);
		}else
			System.out.println(str+" and "+str2+" have no common prefix");


	}

}
