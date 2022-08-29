package weeks.week_03;

import java.util.Scanner;

public class Assignment03_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter ages of three people : ");
		int person1 = input.nextInt();
		int person2 = input.nextInt();
		int person3 = input.nextInt();

		int max=0;
		int min=0;

		if (person1 > person2 && person1 > person3) {
			max = person1;
			if (person2 > person3) {
				min = person3;} 
			else {
				min = person2;}} 
		
		else if (person2 > person1 && person2 > person3) {
			max = person2;
			if (person1 > person3) {
				min = person3;
			} else
				min = person1;} 
		else if (person3 > person1 && person3 > person2) {
			max = person3;
			if (person1 > person2) {
				min = person2;
			} else
				min = person1;

		}
		System.out.println("The oldest age " + max + " the youngest age " + min);

	}
}
