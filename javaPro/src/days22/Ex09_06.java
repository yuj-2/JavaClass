package days22;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오후 5:01:57 
 * @subject   
 * @content 
 */ 
public class Ex09_06 {

	public static void main(String[] args) {
		// [2]
		LocalDate ld = LocalDate.now();
		System.out.println( ld ); // 2025-09-16
		
		LocalTime lt = LocalTime.now();
		System.out.println( lt ); // 17:05:34.586607500
		
		// 날짜 + 시간 클래스 = LocalDateTime 클래스
		LocalDateTime dt = LocalDateTime.of(ld, lt);
		//System.out.println( dt );
		
		ld = dt.toLocalDate();
		lt = dt.toLocalTime();
		
		dt = ld.atTime(lt); // 날짜 + 시간
		
		System.out.println(dt);  // 2025-09-16T17:09:40.095468100
		dt = dt.truncatedTo(ChronoUnit.DAYS);
		System.out.println(dt); // 2025-09-16T00:00
		
//		LocalDateTime dt = LocalDateTime.now();
//		System.out.println( dt );  // 2025-09-16T17:06:23.921832500
		
		/* [1]
		LocalTime lt = LocalTime.now();
		// 17:02:22.661443300
		System.out.println( lt );
		
		// 초 밑으로 절삭
		lt = lt.truncatedTo(ChronoUnit.SECONDS);
		lt = lt.truncatedTo(ChronoUnit.HOURS);
		System.out.println( lt );
		*/

	}

}
