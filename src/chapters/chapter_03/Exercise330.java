package chapters.chapter_03;

public class Exercise330 {

	public static void main(String[] args) {
	    
		long totalMilliseconds = System.currentTimeMillis();

	    long totalSeconds = totalMilliseconds / 1000;

	    long currentSecond = totalSeconds % 60;

	    long totalMinutes = totalSeconds / 60;

	    long currentMinute = totalMinutes % 60;

	    long totalHours = totalMinutes / 60;

	    int currentHour = (int)(totalHours % 24);
	    
	    switch(currentHour % 24) {
	    case 0: System.out.println("Current time is "  + "0:"
	  	      + currentMinute + ":" + currentSecond + " AM");break;
	    case 1: System.out.println("Current time is "  + "01:"
		  	      + currentMinute + ":" + currentSecond + " AM");break;
	    case 2: System.out.println("Current time is "  + "02:"
		  	      + currentMinute + ":" + currentSecond + " AM");break;
	    case 3: System.out.println("Current time is "  + "03:"
		  	      + currentMinute + ":" + currentSecond + " AM");break;
	    case 4: System.out.println("Current time is "  + "04:"
		  	      + currentMinute + ":" + currentSecond + " AM");break;
	    case 5: System.out.println("Current time is "  + "05:"
		  	      + currentMinute + ":" + currentSecond + " AM");break;
	    case 6: System.out.println("Current time is "  + "06:"
		  	      + currentMinute + ":" + currentSecond + " AM");break;
	    case 7: System.out.println("Current time is "  + "07:"
		  	      + currentMinute + ":" + currentSecond + " AM");break;
	    case 8: System.out.println("Current time is "  + "08:"
		  	      + currentMinute + ":" + currentSecond + " AM");break;
	    case 9: System.out.println("Current time is "  + "09:"
		  	      + currentMinute + ":" + currentSecond + " AM");break;
	    case 10: System.out.println("Current time is "  + "10:"
		  	      + currentMinute + ":" + currentSecond + " AM");break;
	    case 11: System.out.println("Current time is "  + "11:"
		  	      + currentMinute + ":" + currentSecond + " AM");break;
	    case 12: System.out.println("Current time is "  + "12:"
		  	      + currentMinute + ":" + currentSecond + " PM");break;
	    case 13: System.out.println("Current time is "  + "01:"
		  	      + currentMinute + ":" + currentSecond + " PM");break;
	    case 14: System.out.println("Current time is "  + "02:"
		  	      + currentMinute + ":" + currentSecond + " PM");break;
	    case 15: System.out.println("Current time is "  + "03:"
		  	      + currentMinute + ":" + currentSecond + " PM");break;
	    case 16: System.out.println("Current time is "  + "04:"
		  	      + currentMinute + ":" + currentSecond + " PM");break;
	    case 17: System.out.println("Current time is "  + "05:"
		  	      + currentMinute + ":" + currentSecond + " PM");break;
	    case 18: System.out.println("Current time is "  + "06:"
		  	      + currentMinute + ":" + currentSecond + " PM");break;
	    case 19: System.out.println("Current time is "  + "07"
		  	      + currentMinute + ":" + currentSecond + " PM");break;
	    case 20: System.out.println("Current time is "  + "08:"
		  	      + currentMinute + ":" + currentSecond + " PM");break;
	    case 21: System.out.println("Current time is "  + "09:"
		  	      + currentMinute + ":" + currentSecond + " PM");break;
	    case 22: System.out.println("Current time is "  + "10:"
		  	      + currentMinute + ":" + currentSecond + " PM");break;
	    case 23: System.out.println("Current time is "  + "11:"
		  	      + currentMinute + ":" + currentSecond + " PM");
	    }
	    

	    
	    
	}

}
