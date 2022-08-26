package chapters.chapter_03;

public class Checkpoint330 {

	public static void main(String[] args) {

		int x = 3;
		int y = 3;

		switch (x + 3) {
		case 6:
			y = 1;
		default:
			y += 1;
		}
		System.out.println("y = " + y);

		//in if statements
		if (x + 3 == 6)
			y = 1;
		y += 1;
		System.out.println("y = " + y);
	}

}
