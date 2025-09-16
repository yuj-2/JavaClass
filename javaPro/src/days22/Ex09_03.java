package days22;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오후 4:02:28 
 * @subject   LocalDate 클래스 - 날짜만 다루는 클래스
 * @content   LocalTime 클래스 - 시간만 다루는 클래스 
 */ 
public class Ex09_03 {

	public static void main(String[] args) {
		// now(), of()
		LocalTime lt = LocalTime.now();
		// 16:03:55.914473300  ns
		// System.out.println( lt );
		// 시
		int hour = lt.getHour();
		System.out.println( hour );
		hour = lt.get(ChronoField.HOUR_OF_AMPM);
		System.out.println( hour );
		// 분
		int minute = lt.getMinute();
		System.out.println( minute );
		// 초
		int second = lt.getSecond();
		System.out.println( second );
		// 밀리초
		int ms = lt.get(ChronoField.MILLI_OF_SECOND);
		System.out.println( ms );
		
		// 나노초
		int ns = lt.getNano() ;
		System.out.println( ns );
		
		

	} // main

} // class
