package chapters.chapter_03;

public class Exercise316 {

	public static void main(String[] args) {
		double a = (int) (Math.random() * 4);
		if (a == 0) {
			double x = (int) (Math.random() * 51);
			double y = (int) (Math.random() * 101);
			System.out.println(x + "," + y);

		} else if (a == 1) {
			double x = (int) (Math.random() * -51);
			double y = (int) (Math.random() * -101);
			System.out.println(x + "," + y);
		} else if (a == 2) {
			double x = (int) (Math.random() * -51);
			double y = (int) (Math.random() * 101);
			System.out.println(x + "," + y);

		} else if (a == 3) {
			double x = (int) (Math.random() * 51);
			double y = (int) (Math.random() * -101);
			System.out.println(x + "," + y);

		}

	}
}
