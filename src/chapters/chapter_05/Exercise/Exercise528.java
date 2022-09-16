package chapters.chapter_05.Exercise;

import java.util.Scanner;

public class Exercise528 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = input.nextInt();
		System.out.println("Enter the first day of the year:");
		int day = input.nextInt();

		for (int month = 1; month <= 12; month++) {
			String str = "";
			switch (month) {
			   case 1: str += "January"; break;
			   case 2: str += "February"; break;
			   case 3: str += "March"; break;
			   case 4: str += "April"; break;
			   case 5: str += "May"; break;
			   case 6: str += "June"; break;
			   case 7: str += "July"; break;
			   case 8: str += "August"; break;
			   case 9: str += "September"; break;
			   case 10: str += "October"; break;
			   case 11: str += "November"; break;
			   case 12: str += "December"; 

			}
			str += "1, "+ year + " is " ;
			
			day %= 7;
			
			switch(day) {
			
			case 0 : str += "Sunday"; break;
			case 1 : str += "Monday"; break;
			case 2 : str += "Tuesday"; break;
			case 3 : str += "Wednesday"; break;
			case 4 : str += "Thursday"; break;
			case 5 : str += "Friday"; break;
			case 6 : str += "Saturday"; 
			
			}
			
			if(month == 1 || month ==3 || month ==5 || month ==7 || 
					month ==8 || month ==10 || month ==12) {
				day +=31 ;
			
			}else if(month == 4 || month ==6 || month ==9 || month ==11 ) {
				day += 30 ;
			}else {
				if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
					day += 29;
				else
					day += 28;
			}
			System.out.println(str);
		}

			
					
		}

	}


