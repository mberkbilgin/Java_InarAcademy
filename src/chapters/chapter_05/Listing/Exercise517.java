package chapters.chapter_05.Exercise;

import java.util.Scanner;

public class Exercise517 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of line:");
		int i = input.nextInt();
		
		for ( int k = 1 ; k <= i ; k++) {
			
			for ( int j = i-k ; j >= 1 ; j--) {
				System.out.print("  ");
			}
			for (int l = k ; l >= 2 ; l--) {
				System.out.print(l+" ");
			}
			for ( int r = 1 ; r<= k ; r++) {
				System.out.print(r+" ");
			}
			System.out.println();
		}
		
	}

}
