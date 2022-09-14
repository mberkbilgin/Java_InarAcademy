package chapters.chapter_05.Exercise;

public class Exercise511 {

	public static void main(String[] args) {
		int number = 0 ;
		for(int i = 100 ; i <=200 ; i++) {
			if ( (i % 5 == 0 || i % 6 == 0) && i % 30 != 0) {
				number++ ;
				if ( number % 10 == 0) {
					System.out.println(i);
				}else
					System.out.print(i+" ");
			}
		}
		
	}

}
