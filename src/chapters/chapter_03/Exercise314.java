package chapters.chapter_03;

import java.util.Scanner;

public class Exercise314 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Guess head or tail : (1 for head, 0 for tail)");
		int answer = input.nextInt();
		int number = (int)(Math.random()*2) ;
		System.out.println(answer == number ? "TRUE!!" : "FALSE :((" );
		
	}

}
