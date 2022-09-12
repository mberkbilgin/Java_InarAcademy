package chapters.chapter_05.Exercise;

public class Exercise055 {

	public static void main(String[] args) {
		System.out.println("Kilograms      Pounds  |   Pounds      Kilograms");
		
		for(int kg = 1, pounds=20 ; kg < 200 && pounds <516 ; kg +=2 , pounds +=5) {
			
			
			System.out.printf("%-13d%6.1f" , kg ,(pounds*2.2));
			
			System.out.printf("    |    ");
			System.out.printf("%-8d%8.2f\n",pounds,(pounds/2.2));
		
			
		}
		
	}

}
