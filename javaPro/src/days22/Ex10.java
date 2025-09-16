package days22;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오후 5:10:35 
 * @subject   [Temporal + Adjusters 클래스]
 * @content    시간상의     조정자
 * 
 *             plus(), plusXXX()
 *             minus(), minusXXX()
 *             with(), withXXX()
 *             
 *             ㄴ 자주 사용되는 날자/시간을 수정(조정)하는 기능(메서드)이 구현된
 *             클래스가  TemporalAdjusters 클래스이다. 
 */ 
public class Ex10 {

	public static void main(String[] args) {
		// 예) 이번 달 마지막 목요일(?)은 휴강입니다. 
		// 예) 이번 달 두번째 월요일(?)은 휴강입니다. 
		// 등등
		
		LocalDate d = LocalDate.now();
		System.out.println( d ); // 2025-09-16
		
		/*
		// 1. 이번 달 첫 번째 월요일 
		d = d.with( TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)  );
		System.out.println( d );
		// 2. 이번 달 마지막 토요일
		d = d.with( TemporalAdjusters.lastInMonth(DayOfWeek.SATURDAY)  );
		System.out.println( d );
		// 3. 이번 달 3번째 목요일 - 휴강 
		d = d.with( TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.THURSDAY)  );
		System.out.println( d );
		*/
		
		// 문제) 다음 주 수요일은 휴강 ?  2025-09-24
		//      2025-09-16
		
		

	}

}







