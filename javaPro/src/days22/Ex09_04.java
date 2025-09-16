package days22;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오후 4:15:00 
 * @subject   
 * @content 
 */ 
public class Ex09_04 {

	public static void main(String[] args) {
		// [문제] 
		// A 생일 : 2000.1.21
		// B 생일 : 2000.9.16
		// C 생일 : 2000.11.8
		// 생일이 지났다. 생일이 지나지 않았다.  오늘이 생일이다.
		LocalDate aBirth = LocalDate.of(2000, 1, 21);
		LocalDate today = LocalDate.now();
		aBirth = aBirth.withYear(today.getYear());
		System.out.println( aBirth.compareTo(today) );  // 0  음수 양수
//		System.out.println( aBirth.equals(today) );   //   =    오늘
//		System.out.println( aBirth.isBefore(today) ); // aB < t 생지O
//		System.out.println( aBirth.isAfter(today) );  //   >    생지X
		
		
		
		
		
		// String 불변
		// LocalDate 불변
		// 1. LocalDate 클래스 : 25.8.18 개강날짜 객체 생성
		/*
		// [2] of() 메서드 
		LocalDate startDate = LocalDate.of(2025, 8, 18);
		System.out.println( startDate );
		*/
		/* [1]
		LocalDate ld = LocalDate.now();
		// System.out.println( ld );	// 2025-09-16
		// ld = ld.withXXX(0) , ld = ld.with( cf, 값 )
		//ld = ld.withYear(2026); 
		ld = ld.with(ChronoField.YEAR, 2027 );
		// ld = ld.withMonth(8);		
		ld = ld.with(ChronoField.MONTH_OF_YEAR, 4 );
		ld = ld.withDayOfMonth(18);		
		System.out.println( ld );
		*/
		

	} // main

} // class



