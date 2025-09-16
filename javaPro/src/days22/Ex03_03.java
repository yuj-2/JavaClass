package days22;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.util.Graphic2D;

public class Ex03_03 {

	public static void main(String[] args) {
		// [시험 1]	
		Scanner scanner = new Scanner(System.in);
		int year, month;

		System.out.printf("> year, month input ? ");
		year = scanner.nextInt();
		month = scanner.nextInt();

		printCalendar(year, month);	
	}

	private static void printCalendar(int year, int month) {
		Calendar c = new GregorianCalendar(year, month-1, 1);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK); 
		c.add(  Calendar.DATE , -dayOfWeek );
		// 
		System.out.printf("\t\t\t[%d년 %d월]\n", year, month );
		Graphic2D.drawLine(60, '-');
		String week = "일월화수목금토";
		for (int i = 0; i < week.length(); i++) {
			System.out.printf("\t%c", week.charAt(i));
		} // for i
		System.out.println();
		Graphic2D.drawLine(60, '-');
		
		for (int i = 0; i < 42; i++) {
			c.add( Calendar.DATE, 1);
			int date = c.get(Calendar.DATE);
			System.out.printf( isToday(c) ? "\t[%d]":"\t%d", date);
			if( i%7==6) System.out.println();
		}
		
		System.out.println();
		Graphic2D.drawLine(60, '-');
		
	}
	
	public static boolean isToday(Calendar c) {
		Calendar today = Calendar.getInstance();
		// 시,분,초,밀리초  절삭
		today.set(Calendar.HOUR , 0);
		today.set(Calendar.MILLISECOND , 0);
		today.set(Calendar.MINUTE , 0);
		today.set(Calendar.SECOND , 0);
    	  
    	return today.equals(c);
	}
	
	private static int getLastDay(int year, int month) {		
		Calendar c = new GregorianCalendar(year, month, 1);  
		return c.getActualMaximum(Calendar.DATE);
	}

	private static int getDayOfWeek(int year, int month, int day) { 
		Calendar c = new GregorianCalendar(year, month-1, day); 
		return c.get(Calendar.DAY_OF_WEEK);
	}

}
