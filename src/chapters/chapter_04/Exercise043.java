package chapters.chapter_04;

public class Exercise043 {

	public static void main(String[] args) {
		final double radius = 6371.01;

		double atlanta_x = Math.toRadians(33.7489924);
		double atlanta_y = Math.toRadians(-84.3902644);

		double orlando_x = Math.toRadians(28.5421109);
		double orlando_y = Math.toRadians(-81.3790304);

		double savannah_x = Math.toRadians(32.0564572);
		double savannah_y = Math.toRadians(-81.0951271);

		double charlotte_x = Math.toRadians(35.2272086);
		double charlotte_y = Math.toRadians(-80.8430827);

		// atlanta to orlando
		double d1 = radius * Math.acos(Math.sin(atlanta_x)) * Math.sin(orlando_x)
				+ Math.cos(atlanta_x) * Math.cos(orlando_x) * Math.cos(atlanta_y - orlando_y);
		System.out.println("distance of atlanta and orlando is " + d1);

		// atlanta to savannah
		double d2 = radius * Math.acos(Math.sin(atlanta_x)) * Math.sin(savannah_x)
				+ Math.cos(atlanta_x) * Math.cos(savannah_x) * Math.cos(atlanta_y - savannah_y);
		System.out.println("distance of atlanta and savannah is " + d2);

		// charlotte to savannah
		double d3 = radius * Math.acos(Math.sin(charlotte_x)) * Math.sin(savannah_x)
				+ Math.cos(charlotte_x) * Math.cos(savannah_x) * Math.cos(charlotte_y - savannah_y);
		System.out.println("distance of charlotte and savannah is " + d3);
		
		// atlanta to charlotte
		double d4 = radius * Math.acos(Math.sin(atlanta_x)) * Math.sin(charlotte_x)
				+ Math.cos(atlanta_x) * Math.cos(charlotte_x) * Math.cos(atlanta_y - charlotte_y);
		System.out.println("distance of atlanta and charlotte is " + d4);
		
		//charlotte to savannah
		double d5 = radius * Math.acos(Math.sin(charlotte_x)) * Math.sin(savannah_x)
				+ Math.cos(charlotte_x) * Math.cos(savannah_x) * Math.cos(charlotte_y - savannah_y);
		System.out.println("distance of charlotte and savannah is " + d5);


		double side1 = (d1 + d2 + d3) / 2;
		double area1 = Math.pow(side1 * (side1 - d1) * (side1 - d2) * (side1 - d3), 0.5);

		double side2 = (d2 + d4 + d5) / 2;
		double area2 = Math.pow(side2 * (side2 - d2) * (side2 - d4) * (side2 - d5), 0.5);

		System.out.println("the estimated area enclosed by these four cities is " + (area1 + area2));

	}

}
