package chapters.chapter_05.Exercise;

public class Exercise524 {

	public static void main(String[] args) {
		
		double d = 0 ;
		for(double i = 1 , k = 3 ; i <= 97 && k <= 99 ; i += 2, k += 2 ) {
			d += i / k ;
		}
	
		System.out.println("The sum is "+d);
	}

}
