package days22;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오후 12:15:34 
 * @subject   
 * @content 
 */ 
public class Ex06_02 {

	public static void main(String[] args) {
		
		String s = "2025.02.28(금)";
		
		// 1) 문자열  s -> SimpleDateFormat 사용해서 Date 객체로 변환		
		int year = Integer.parseInt( s.substring(0, 4) );
		int month = Integer.parseInt( s.substring(5, 7) );
		int day = Integer.parseInt( s.substring(8, 10) );
		
		System.out.printf( "%d.%d.%d\n", year, month, day );
		
		Date d = new Date(year-1900, month-1, day);
		System.out.println( d.toLocaleString() );
		
		
		// 2) 문자열  s -> SimpleDateFormat 사용해서 Calendar 객체로 변환
		Calendar c = new GregorianCalendar(year, month-1, day);
		System.out.println( c );
		

	} // main

} // class







