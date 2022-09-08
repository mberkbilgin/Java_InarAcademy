package chapters.chapter_05.Checkpoint;

public class Checkpoint524a {

	public static void main(String[] args) {
		int balance = 10 ;
		while (true) {
			if (balance < 9)
				break ;
			balance = balance - 9 ;
		}
		
		System.out.println("Balance is "+balance);
	}

}
