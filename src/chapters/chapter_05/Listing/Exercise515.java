package chapters.chapter_05.Exercise;

import java.util.Scanner;

public class Exercise515 {

	public static void main(String[] args) {
		int count = 0 ;
	for (int i = 33 ; i < 127 ; i++) {
		count++;
		if (count % 10 == 0) {
			System.out.println((char)i);
		}else
			System.out.print((char)i+" ");
	}
	
	
	}
	}

