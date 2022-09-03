package chapters.chapter_04;

import java.util.Scanner;

public class Exercise424 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first city:");
		String city1 = input.next();
		System.out.println("Enter the second city:");
		String city2 = input.next();
		System.out.println("Enter the third city:");
		String city3 = input.next();
		String str = " ";
		
		if(city2.compareToIgnoreCase(city1)<0 && city2.compareTo(city3)<0) {
			str = city1 ;
			city1 = city2;
			city2 = str ;
		}else if (city3.compareToIgnoreCase(city2)<0 && city3.compareToIgnoreCase(city1)<0) {
			str = city1;
			city1 = city3 ;
			city3 = str;
			
		}if(city3.compareToIgnoreCase(city2)<0) {
			str = city3;
			city3 = city2;
			city2 = str ;
			
		}
		System.out.printf("The three cities in alphabetical order are %2s %2s %2s",city1, city2, city3);
		
	}

}
