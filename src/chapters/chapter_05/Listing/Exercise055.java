package chapters.chapter_05.Exercise;

public class Exercise055 {

	public static void main(String[] args) {
		System.out.println("Kilograms      Pounds   | Pounds   Kilograms");
		for(int kg = 1 ; kg < 200 ; kg++) {
			double pounds = (int)(kg * 2.2*100)/100.0;
			
			System.out.printf(kg+"               "+pounds+"   |");
		}
		for (int pounds = 20 ; pounds < 516 ; pounds++) {
			double kg = pounds * 0.45 ;
			System.out.printf(pounds+"  "+kg);
			
		}
		
	}

}
