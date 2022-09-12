package chapters.chapter_05.Exercise;

public class Exercise057 {

	public static void main(String[] args) {
		double tuition = 10000 ;
		for(int year = 1 ; year <10 ; year++) {
			
			tuition = (int)((tuition * (year)*(0.05)+tuition)*100)/100.0 ;
			System.out.println((year)+". year, tuition is $"+tuition);
			
		}
		
	}

}
