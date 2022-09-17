package chapters.chapter_05.Exercise;

public class Exercise540 {

	public static void main(String[] args) {
		for(int i = 1; i <= 1000000; i++) {
			int x = (int)(Math.random()*2);
			if(x == 0) {
				System.out.println("HEAD");
			}else
				System.out.println("TAIL");
		}
	}

}
