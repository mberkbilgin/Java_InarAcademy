package chapters.chapter_05.Exercise;

import java.util.Scanner;

public class Exercise529 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the year: ");
		int year = input.nextInt();
		System.out.println("Enter the first day of the year: ");
		int day = input.nextInt();
		
		
		for (int month = 1; month <= 12; month++ ) {
			switch (month) {
			case 1: System.out.println("      January  "+year ); System.out.println("_________________________");System.out.println("Sun Mon Tue Wed Thu Fri Sat"); break;
			case 2:  System.out.println("      February  "+year );System.out.println("_________________________"); System.out.println("Sun Mon Tue Wed Thu Fri Sat");break;
			case 3: System.out.println("      March  "+year );System.out.println("_________________________"); System.out.println("Sun Mon Tue Wed Thu Fri Sat");break;
			case 4: System.out.println("      April  "+year );System.out.println("____________________________"); System.out.println("Sun Mon Tue Wed Thu Fri Sat");break;
			case 5: System.out.println("      May  "+year );System.out.println("____________________________"); System.out.println("Sun Mon Tue Wed Thu Fri Sat");break;
			case 6: System.out.println("      June  "+year );System.out.println("____________________________"); System.out.println("Sun Mon Tue Wed Thu Fri Sat");break;
			case 7: System.out.println("      July  "+year );System.out.println("____________________________"); System.out.println("Sun Mon Tue Wed Thu Fri Sat");break;
			case 8: System.out.println("      August  "+year );System.out.println("____________________________"); System.out.println("Sun Mon Tue Wed Thu Fri Sat");break;
			case 9: System.out.println("      September  "+year );System.out.println("____________________________"); System.out.println("Sun Mon Tue Wed Thu Fri Sat");break;
			case 10: System.out.println("      October  "+year );System.out.println("____________________________"); System.out.println("Sun Mon Tue Wed Thu Fri Sat");break;
			case 11: System.out.println("      November  "+year ); System.out.println("____________________________"); System.out.println("Sun Mon Tue Wed Thu Fri Sat");break;
			case 12: System.out.println("      December  "+year ); System.out.println("____________________________"); System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			}
			
			if (month == 1 || month ==3 || month ==5 || month ==7 || 
					month ==8 || month ==10 || month ==12) {
				
			switch (day % 7 ) {
			case 0 : System.out.println(" 1  2  3  4  5  6    7 \n 8 9 10 11 12 13 14 \n 15 16 17 18 19 20 21 \n 22 23 24 25 26 27 28 \n 29 30 31"); break;
			case 1 : System.out.println("  1 2 3 4 5 6 \n 7 8 9 10 11 12 13 \n 14 15 16 17 18 19 20 \n 21 22 23 24 25 26 27 \n 28 29 30 31"); break;
			case 2 : System.out.println("    1 2 3 4 5 \n 6 7 8 9 10 11 12 \n 13 14 15 16 17 18 19 \n 20 21 22 23 24 25 26 \n 27 28 29 30 31"); break;
			case 3 : System.out.println("      1 2 3 4 \n 5 6 7 8 9 10 11 \n 12 13 14 15 16 17 18 \n 18 19 20 21 22 23 24 25 \n 26 27 28 29 30 31"); break;
			case 4 : System.out.println("        1 2 3 \n 4 5 6 7 8 9 10 \n 11 12 13 14 15 16 17 \n 18 19 20 21 22 23 24 \n 25 26 27 28 29 30 31"); break;
			case 5 : System.out.println("          1 2 \n 3 4 5 6 7 8 9 \n 10 11 12 13 14 15 16 \n 17 18 19 20 21 22 23 \n 24 25 26 27 28 29 30 \n 31"); break;
			case 6 : System.out.println("            1 \n 2 3 4 5 6 7 8 \n 9 10 11 12 13 14 15 \n 16 17 18 19 20 21 22 \n 23 24 25 26 27 28 29 \n 30 31 "); 
			}
			day +=31 ;
		}else if (month == 4 || month ==6 || month ==9 || month ==11 ) {
			
			switch (day % 7 ) {
			case 0 : System.out.println("1 2 3 4 5 6 7 \n 8 9 10 11 12 13 14 \n 15 16 17 18 19 20 21 \n 22 23 24 25 26 27 28 \n 29 30 "); break;
			case 1 : System.out.println("  1 2 3 4 5 6 \n 7 8 9 10 11 12 13 \n 14 15 16 17 18 19 20 \n 21 22 23 24 25 26 27 \n 28 29 30 "); break;
			case 2 : System.out.println("    1 2 3 4 5 \n 6 7 8 9 10 11 12 \n 13 14 15 16 17 18 19 \n 20 21 22 23 24 25 26 \n 27 28 29 30 "); break;
			case 3 : System.out.println("      1 2 3 4 \n 5 6 7 8 9 10 11 \n 12 13 14 15 16 17 18 \n 18 19 20 21 22 23 24 25 \n 26 27 28 29 30"); break;
			case 4 : System.out.println("        1 2 3 \n 4 5 6 7 8 9 10 \n 11 12 13 14 15 16 17 \n 18 19 20 21 22 23 24 \n 25 26 27 28 29 30 "); break;
			case 5 : System.out.println("          1 2 \n 3 4 5 6 7 8 9 \n 10 11 12 13 14 15 16 \n 17 18 19 20 21 22 23 \n 24 25 26 27 28 29 30 "); break;
			case 6 : System.out.println("            1 \n 2 3 4 5 6 7 8 \n 9 10 11 12 13 14 15 \n 16 17 18 19 20 21 22 \n 23 24 25 26 27 28 29 \n 30  "); 
			}
			day += 30 ;
		}else {
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
				switch (day % 7 ) {
				case 0 : System.out.println("1 2 3 4 5 6 7 \n 8 9 10 11 12 13 14 \n 15 16 17 18 19 20 21 \n 22 23 24 25 26 27 28 \n 29  "); break;
				case 1 : System.out.println("  1 2 3 4 5 6 \n 7 8 9 10 11 12 13 \n 14 15 16 17 18 19 20 \n 21 22 23 24 25 26 27 \n 28 29  "); break;
				case 2 : System.out.println("    1 2 3 4 5 \n 6 7 8 9 10 11 12 \n 13 14 15 16 17 18 19 \n 20 21 22 23 24 25 26 \n 27 28 29  "); break;
				case 3 : System.out.println("      1 2 3 4 \n 5 6 7 8 9 10 11 \n 12 13 14 15 16 17 18 \n 18 19 20 21 22 23 24 25 \n 26 27 28 29 "); break;
				case 4 : System.out.println("        1 2 3 \n 4 5 6 7 8 9 10 \n 11 12 13 14 15 16 17 \n 18 19 20 21 22 23 24 \n 25 26 27 28 29  "); break;
				case 5 : System.out.println("          1 2 \n 3 4 5 6 7 8 9 \n 10 11 12 13 14 15 16 \n 17 18 19 20 21 22 23 \n 24 25 26 27 28 29  "); break;
				case 6 : System.out.println("            1 \n 2 3 4 5 6 7 8 \n 9 10 11 12 13 14 15 \n 16 17 18 19 20 21 22 \n 23 24 25 26 27 28 29  "); 
				}
				day += 29;
			}else {switch (day % 7 ) {
			case 0 : System.out.println("1 2 3 4 5 6 7 \n 8 9 10 11 12 13 14 \n 15 16 17 18 19 20 21 \n 22 23 24 25 26 27 28"); break;
			case 1 : System.out.println("  1 2 3 4 5 6 \n 7 8 9 10 11 12 13 \n 14 15 16 17 18 19 20 \n 21 22 23 24 25 26 27 \n 28   "); break;
			case 2 : System.out.println("    1 2 3 4 5 \n 6 7 8 9 10 11 12 \n 13 14 15 16 17 18 19 \n 20 21 22 23 24 25 26 \n 27 28   "); break;
			case 3 : System.out.println("      1 2 3 4 \n 5 6 7 8 9 10 11 \n 12 13 14 15 16 17 18 \n 18 19 20 21 22 23 24 25 \n 26 27 28  "); break;
			case 4 : System.out.println("        1 2 3 \n 4 5 6 7 8 9 10 \n 11 12 13 14 15 16 17 \n 18 19 20 21 22 23 24 \n 25 26 27 28   "); break;
			case 5 : System.out.println("          1 2 \n 3 4 5 6 7 8 9 \n 10 11 12 13 14 15 16 \n 17 18 19 20 21 22 23 \n 24 25 26 27 28   "); break;
			case 6 : System.out.println("            1 \n 2 3 4 5 6 7 8 \n 9 10 11 12 13 14 15 \n 16 17 18 19 20 21 22 \n 23 24 25 26 27 28   "); 
			
			}
			day += 28;
			
			}
				
				
		
				
			
				
	}
		
		}
	}}
