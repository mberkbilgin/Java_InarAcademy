package chapters.chapter_05.Exercise;

public class Exercise510 {

	public static void main(String[] args) {
		int line = 0;
		for (int i = 100; i < 1000; i++) {
			if (i % 5 == 0 && i % 6 == 0) {
				line++;
				if (line % 10 == 0) {
					System.out.println(i);
				} else
					System.out.print(i + " ");
			}
		}

	}
}
