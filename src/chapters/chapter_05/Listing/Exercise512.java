package chapters.chapter_05.Exercise;

public class Exercise512 {
	public static void main(String[] args) {

		int n = 0 ;
		while (n*n <= 12000) {
			n++;
		}
		System.out.println((n) +" is the smallest number such that number*number > 12,000");
	}
}
