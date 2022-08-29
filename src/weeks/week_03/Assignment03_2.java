package weeks.week_03;

import java.util.Scanner;

public class Assignment03_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" Please enter  ages of three people ");

		int person1 = input.nextInt();
		int person2 = input.nextInt();
		int person3 = input.nextInt();

		int max;

		int min;
		if (person1 > person2 && person1 > person3) {
			max = person1;
			if (person2 > person3) {
				min = person3;
			} else
				min = person2;
		} else if (person2 > person1 && person2 > person3) {
			max = person2;
			if (person1 > person3) {
				min = person3;
			} else
				min = person1;
		} else {
			max = person3;
			if (person2 > person1) {
				min = person1;
			} else
				min = person2;
		}

		System.out.println("The oldest age  " + max + " The youngest age " + min);

	}

}
