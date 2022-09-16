package chapters.chapter_05.Exercise;

public class Exercise526 {

	public static void main(String[] args) {
		double e = 0;
		// i is 10000
		for (double i = 1; i <= 10000; i++) {
			double d = i;
			for (double k = i - 1; k >= 1; k--) {
				d *= k;
			}
			e += 1 / d;

		}
		System.out.println("The e value is " + e);

		e = 0;
		// i is 20000
		for (double i = 1; i <= 20000; i++) {
			double d = i;
			for (double k = i - 1; k >= 1; k--) {
				d *= k;
			}
			e += 1 / d;

		}
		System.out.println("The e value is " + e);

		e = 0 ;
		// i is 100000
		for (double i = 1; i <= 100000; i++) {
			double d = i;
			for (double k = i - 1; k >= 1; k--) {
				d *= k;
			}
			e += 1 / d;

		}
		System.out.println("The e value is " + e);
	}

}