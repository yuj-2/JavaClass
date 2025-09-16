package days22;

import java.util.Calendar;
import java.util.Date;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오전 11:17:55 
 * @subject   1) Date -> Calendar 변환
 * @content   2) Calendar -> Date 변환
 */ 
public class Ex04 {

	public static void main(String[] args) {
		
		// 1) Date -> Calendar 변환
		Date d = new Date();
		// 2025. 9. 16. 오전 11:19:29
		System.out.println( d.toLocaleString() );
		
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		// System.out.println( c );
		
		// 2) Calendar -> Date 변환
		Date d2 = c.getTime();
		
		

	} // main

} // class






