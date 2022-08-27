package chapters.chapter_03;

import java.util.Scanner;

public class Exercise310 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = (int) (Math.random() * 100);
		int y = (int) (Math.random() * 100);
		int z = (int) (Math.random() * 100);
		System.out.println(x +" - "+y+" - "+z+ " = ?" );
		int answer = input.nextInt() ;
		if (x-y-z == answer ) {
			System.out.println("TRUE!!");
		} else System.out.println("FALSE :(( " + x +" - " + y +" - " + z +" = "+(x-y-z));
	}

}
