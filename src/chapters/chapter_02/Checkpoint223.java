package chapters.chapter_02;

public class Checkpoint223 {

	public static void main(String[] args) {

		long totalMilliseconds = System.currentTimeMillis(); // Obtain the total milliseconds since 01.01.1970

		long totalSeconds = totalMilliseconds / 1000; // Obtain the total seconds

		long currentSecond = totalSeconds % 60; // Obtain current seconds

		long totalMinute = totalSeconds / 60;

		long currentMinute = totalMinute % 60;

		long totalHours = totalMinute / 24;

		long currentHour = totalHours % 24;

		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);

	}
}