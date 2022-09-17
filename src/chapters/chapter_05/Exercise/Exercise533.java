package chapters.chapter_05.Exercise;

public class Exercise533 {

	public static void main(String[] args) {
		System.out.println("Perfect number less than 10000 is ");
		for (int x = 6; x < 10000; x++) {
			int total = 0;
			for (int i = 1; i < x; i++) {
				if (x % i == 0)
					total += i;
			}
				if(x == total) {
					
					System.out.println(x);
			}
			
			
		
		}
		
	}
}
