package chapters.chapter_05.Exercise;

public class Exercise518c {

	public static void main(String[] args) {
		
		int number = 6;

		for (int i = 1; i <= number; i++) {
			for (int k = number - i; k >= 1; k--) {
				System.out.print("  ");
			}
			for (int l = i; l >= 1; l--) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
			
			
	}

}
