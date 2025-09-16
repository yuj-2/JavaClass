package days22;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오후 4:43:42 
 * @subject   
 * @content    plus(), minus(), plusXXX(), minusXXX()
 */ 
public class Ex09_05 {

	public static void main(String[] args) {
		// 개강일 + 100일  기념일 몇 일? 
		LocalDate startDate = LocalDate.of(2025, 8, 18);
		LocalDate endDate = LocalDate.of(2026, 3, 4);
		// LocalDate hDate = startDate.plusDays(100);
		// LocalDate hDate = startDate.plus(100, ChronoUnit.DAYS);
		
		// LocalDate hDate = startDate.plus(1, ChronoUnit.MONTHS);
		// LocalDate hDate = startDate.plusMonths(1); 
		
		LocalDate hDate = endDate.minusDays(100);
		
		//                  2025-08-18/2025-11-26
		System.out.println( startDate +"/" + hDate );
		 

	} // main

} // class






