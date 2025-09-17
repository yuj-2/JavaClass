package days23;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author kenik  
 * @date 2025. 9. 17. 오전 7:15:23 
 * @subject   Period 클래스   : 날짜 - 날짜 간격
 * @content   Duration 클래스 : 시간 - 시간 간격
 * 
 *             ㄴ between()              == until()
 *                static메서드            인스턴스 메서드
 *                                       Period p =
 *                Period.between()       p.until()
 *                Duration.between()     d.until()
 *                
 */  
public class Ex01 {

	public static void main(String[] args) {
		
		// 오늘 수업 시작해서 얼마나 시간이 지났는 지 확인.
		LocalTime st = LocalTime.of(9, 0, 0);
		LocalTime nt = LocalTime.now();
		Duration d = Duration.between(st, nt);
		
		// System.out.println( d.get( ChronoUnit.HOURS) ); 예외발생. X
		/*
		System.out.println( d.getSeconds()/60 ); // 11
		System.out.println( d.getSeconds() ); // 689
		System.out.println( d.getNano() );    // 574700800
		*/
		System.out.println( d.toHours()  ); // 0
		System.out.println( d.toMinutes()  ); // 13
		
		// 개강일 ~ 오늘까지 날짜 간격..
		/* [1]
		LocalDate sd = LocalDate.of(2025, 8, 18); 
		LocalDate td = LocalDate.now();
		// Period 클래스의 between() 메서드를 사용하면 날짜간의 간격(차)
		//            sd <=        < td 
		Period p = Period.between(sd, td);
		System.out.println( p.getYears() );
		System.out.println( p.getMonths() );
		System.out.println( p.getDays() );   // 30		
		System.out.println("-".repeat(70));
		System.out.println( p.get( ChronoUnit.YEARS ) );
		System.out.println( p.get( ChronoUnit.MONTHS ) );
		System.out.println( p.get( ChronoUnit.DAYS ) );
		System.out.println("-".repeat(70));
		*/
		
		
		
		
		

		
		
	} // main

} // class



