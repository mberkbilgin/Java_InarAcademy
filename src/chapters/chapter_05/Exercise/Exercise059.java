package chapters.chapter_05.Exercise;

import java.util.Scanner;

public class Exercise059 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students:");
		int number = input.nextInt();
		String hsName  = "" ;
		String hs2Name  = "" ;
		int hs = 0 ;
		int hs2 = 0 ;
		
		for (int i = 0 ; i<number ; i++) {
			System.out.print((i+1)+". Student \n Name:");
			String name = input.next();
			System.out.print("Score: ");
			int score = input.nextInt();
			
			if (i == 0) {
				hs = score ;
				hsName = name ;
			}else if (i == 1 && score > hs ) {
				hs2 = hs ;
				hs2Name = hsName;
				hs = score ;
				hsName = name ;
			}else if(i == 1){
				hs2 = score ;
				hs2Name = name ;
			}else if (i > 1 && score > hs && score > hs2) {
				hs2 = hs ;
				hs2Name = hsName ;
				hs = score ;
				hsName = name ;
			}else if (i > 1 && score > hs2 ) {
				hs2 = score ;
				hs2Name = name ;
			}
					
		}
					
					
		System.out.println("Student with the highest score's name and score is "+hsName+" and "+hs);
		System.out.println("Student with the second-highest score's name and score is "+hs2Name+" and "+hs2);
	}

}
