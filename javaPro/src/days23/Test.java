package days23;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.util.Graphic2D;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year, month;
		System.out.print("year month : ");
		year = scanner.nextInt();
		month = scanner.nextInt();
		
		printCalendar(year,month);
	}

	private static void printCalendar(int year, int month) {
		Calendar c = new GregorianCalendar(year, month-1, 1);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		c.add(Calendar.DATE, -dayOfWeek);
		System.out.printf("\t\t\t[%d %d]",year, month);
		System.out.println();
		Graphic2D.drawLine(60,'-');
		String week = "일월화수목금토";
		for (int i = 0; i < week.length(); i++) {
			System.out.printf("\t%c",week.charAt(i));
		}
		System.out.println();
		Graphic2D.drawLine(60,'-');
		for (int i = 0; i < 42; i++) {
			c.add(Calendar.DATE, 1);
			int date = c.get(Calendar.DATE);
			System.out.printf(isToday(c)? "\t[%d]" : "\t%d", date);
			if(i%7==6) System.out.println();
			
		}
	}

	private static boolean isToday(Calendar c) {
		Calendar today = Calendar.getInstance();
		today.set(Calendar.MILLISECOND, 0);
		today.set(Calendar.HOUR_OF_DAY, 0);
		today.set(Calendar.SECOND, 0);
		today.set(Calendar.MINUTE, 0);
		return today.equals(c);
	}
}
