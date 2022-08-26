package chapters.chapter_03;

public class Exercise034 {

	public static void main(String[] args) {
		int number =(int)(Math.random()*100) ;
		switch (number % 12) {
			case 0 :
			System.out.println("The month is december." ); break ;
			case 1 :
				System.out.println("The month is january."); break ;
			case 2 :
				System.out.println("The month is february."); break ;
			case 3 :
				System.out.println("The month is march."); break ;
			case 4 :
				System.out.println("The month is april."); break ;
			case 5 :
				System.out.println("The month is may."); break ;
			case 6 :
				System.out.println("The month is june."); break ;
			case 7 :
				System.out.println("The month is july."); break ;
			case 8 :
				System.out.println("The month is august."); break ;
			case 9 :
				System.out.println("The month is september."); break ;
			case 10 :
				System.out.println("The month is october."); break ;
			case 11 :
				System.out.println("The month is november."); 
		}
		
	}

}
