package chapters.chapter_05.Exercise;

import java.util.Scanner;

public class Exercise058 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int hs = 0 ;
	String hsName = "" ;
	
	System.out.println("Enter the number of students: ");
	int numberOfStudents = input.nextInt();
	
	System.out.println("Enter name and score of each students: ");
	for (int i = 0 ; i <numberOfStudents ; i++) {
		System.out.print("Student: "+(i+1)+ "\n Name");
		String name = input.next();
		System.out.print("Score :");
		int score = input.nextInt();
		
		if (score > hs) {
			hs = score ; 
			hsName = name ;
			 
		}
		
	}
	System.out.println("Student with the highest score: "+hsName);
	System.out.println("Him or her score is "+hs);
	
	}

}
