package days22;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오전 10:14:29 
 * @subject   
 * @content 
 */ 
public class Ex03 {

	public static void main(String[] args) {
		// 달력 그리기 - Calendar 클래스 사용
		int year = 2025;
		int month = 9;
		
		// 1) year.month.1  무슨요일 ?
		int dayOfWeek = getDayOfWeek(year, month, 1); // 1 ~ 7 
		System.out.println( "_일월화수목금토".charAt( dayOfWeek ) );
		// 2) year.month    마지막 날짜 ? 
		int lastDay = getLastDay(year, month);
		System.out.println( lastDay );

	} // main

	private static int getLastDay(int year, int month) {
		/* [1]
		// 2025.10.1 날짜 객체 생성
		Calendar c = new GregorianCalendar(year, month, 1);
		// 하루 뺀 날짜 객체 얻어올게요.
		// c.set( Calendar.DATE , c.get(Calendar.DATE) -1 );
		c.add(Calendar.DATE, -1);
		return c.get(Calendar.DATE);
		*/
		
		// [2]
		Calendar c = new GregorianCalendar(year, month, 1);  
		return c.getActualMaximum(Calendar.DATE);
	}

	private static int getDayOfWeek(int year, int month, int day) {
//		Calendar c = Calendar.getInstance();
//		c.set(year, month-1, day);
		
		Calendar c = new GregorianCalendar(year, month-1, day);
		
		return c.get(Calendar.DAY_OF_WEEK);
	}
	
	

} // class









