package chapters.chapter_05.Exercise;

public class Exercise056 {

	public static void main(String[] args) {
		System.out.println("Miles      Kilometers | Kilometers         Miles");
		for (int m = 1 , km = 20 ; m < 11 && km < 66 ;m++, km +=5) {
			System.out.printf("%-11d%-10.3f",m,(m*1.609));
			System.out.printf(" |     ");
			System.out.printf("%-15d%-6.3f\n",km,(km/1.609));
		}
	}

}
