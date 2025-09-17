package days23;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author kenik  
 * @date 2025. 9. 17. 오전 9:16:43 
 * @subject Date, Calendar -> 형식화  클래스 - DF, SDF, CF, MF  
 * @content j.t.format 패키지 - 형식화 클래스 - DateTimeFomatter 클래스 
 *      DateTimeFomatter  pattern="패턴기호"  dtf.format()
 *      LocalDateTime
 *      
 *      "2025/03/04 화요일 15:16:45.123"    출력
 */ 
public class Ex02 {

	public static void main(String[] args) {
		
		LocalDateTime dt = LocalDateTime.now();
		/*
		// 2025-09-17T09:21:30.026077200
		// System.out.println( dt );		
		System.out.println( dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); 
		// 20250917
		System.out.println( dt.format(DateTimeFormatter.BASIC_ISO_DATE)); 
		// 2025-09-17
		System.out.println( dt.format(DateTimeFormatter.ISO_DATE)); 
		*/ 
		
		// "2025/03/04 화요일 15:16:45.123"    출력
		String pattern = "yyyy/MM/dd E요일 hh:mm:ss.SSS";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		
		String s = dtf.format(dt);
		System.out.println( s );
		

	} // main

}  // class






