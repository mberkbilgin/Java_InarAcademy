package chapters.chapter_04;

public class Exercise425 {

	public static void main(String[] args) {
		int x = (int)(Math.random()*26+65);
		int y = (int)(Math.random()*26+65);
		int z = (int)(Math.random()*26+65);
		char ch1 =(char)(x); 
		char ch2 =(char)(y); 
		char ch3 =(char)(z); 
		int d1 = (int)(Math.random()*10);
		int d2 = (int)(Math.random()*10);
		int d3 = (int)(Math.random()*10);
		int d4 = (int)(Math.random()*10);
		
		System.out.println("Plate number is "+ch1+ch2+ch3+d1+d2+d3+d4);
	}

}
