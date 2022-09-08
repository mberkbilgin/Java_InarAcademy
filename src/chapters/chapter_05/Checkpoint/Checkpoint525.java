package chapters.chapter_05.Checkpoint;

public class Checkpoint525 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while (i < 4) {
			if (i % 3 == 0) {
				i++;
				continue;
			}
			sum += i;
			i++;
			System.out.println(sum);
		}
	}

}
