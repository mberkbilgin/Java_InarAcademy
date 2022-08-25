package chapters.chapter_02;

import java.util.Scanner;

public class Exercise028 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter the time zone offset to GMT : ");
		int timeOffset = input.nextInt() ;
		
		long totalMilliseconds = System.currentTimeMillis() ;
		
		long totalSeconds = totalMilliseconds / 1000 ;
		long seconds = totalSeconds % 60 ;
		
		long totalMinutes = totalSeconds / 60 ;
		long minutes = totalMinutes % 60 ;
		
		long totalHours = totalMinutes / 60 ;
		long hours = totalHours % 24 ;

		System.out.println("The current time is : " + (timeOffset + hours) + ":" + minutes + ":" + seconds);
	}

}
