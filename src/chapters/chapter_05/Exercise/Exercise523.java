package chapters.chapter_05.Exercise;

public class Exercise523 {

	public static void main(String[] args) {

		double k = 0;
		double i = 1;
		while (i <= 50000) {
			k += 1 / i;
			i++;

		}
		System.out.println("Summation of series left to right: " + k);
		
		double j = 0 ;
		i = 50000 ;
		while (i >= 1) {
			j += 1 / i ;
			i-- ;
			
		}
		System.out.println("Summation of series right to left: " + j);
		
		System.out.println("Summation of the series right to left  -  Summation of the series left to right: " 
				+ (j - k));
	}

}
