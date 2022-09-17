package chapters.chapter_05.Exercise;

public class Exercise535 {

	public static void main(String[] args) {
		double d = 0 ;
		for (int i = 2; i <= 625; i++ ) {
			double k = (Math.pow(i-1, 0.5)+Math.pow(i, 0.5));
			d += 1/k ;
		}
		System.out.println(d);
	}

}
