package chapters.chapter_04;

public class Checkpoint047 {
	public static void main(String[] args) {
		double x = Math.log(Math.exp(5.5));
		System.out.println("x is " + x);

		double y = Math.exp(Math.log(5.5));
		System.out.println("y is " + y);

		double z = Math.asin(Math.sin(Math.PI / 6));
		System.out.println("z is " + z);

		double d = Math.sin(Math.asin(Math.PI / 6));
		System.out.println("d is " + d);
	}

}
