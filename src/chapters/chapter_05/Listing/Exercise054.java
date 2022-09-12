package chapters.chapter_05.Exercise;

public class Exercise054 {

	public static void main(String[] args) {
		System.out.println("Miles     Kilometres");
		for(int miles = 1 ; miles < 11 ; miles++) {
			double km = (int)(miles * 1.609*100)/100.0 ;
			System.out.println(miles+"    	  "+km);
		
		}
	}

}
