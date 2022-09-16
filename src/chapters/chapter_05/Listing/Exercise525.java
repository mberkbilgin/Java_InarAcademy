package chapters.chapter_05.Exercise;

public class Exercise525 {

	public static void main(String[] args) {

		// i is 10000
		double a = 1 ;
		for (double i = 2; i <= 10000; i++) {
			double k = Math.pow(-1, i + 1);
			double j = 2 * i - 1;

			a += k / j;

		}
		System.out.println("pi is " + 4 * a);

		
		
		// i is 20000
		double b = 1 ;
		for (double i = 2; i <= 20000; i++) {
			double k = Math.pow(-1, i + 1);
			double j = 2 * i - 1;

			b += k / j;

		}
		System.out.println("pi is " + 4 * a);

		// i is 100000
		double c = 1 ;
		for (double i = 2; i <= 100000; i++) {
			double k = Math.pow(-1, i + 1);
			double j = 2 * i - 1;

			c += k / j;

		}
		System.out.println("pi is " + 4 * a);
	}

}