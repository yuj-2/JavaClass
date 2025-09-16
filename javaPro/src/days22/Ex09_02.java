package days22;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오후 3:29:47 
 * @subject   
 * @content 
 */ 
public class Ex09_02 {

	public static void main(String[] args) {
		// [1. LocalDate 클래스] - 날짜 정보만 있다. 
	    LocalDate ld = LocalDate.now();
	    //                   2025-09-16
	    System.out.println( ld.toString() );
	    // 년
	    int year = ld.getYear();
	    System.out.println( year );
	    year = ld.get( ChronoField.YEAR );
	    System.out.println( year );
	    // 월
	    Month emonth =  ld.getMonth();
	    System.out.println( emonth );
	    int month = ld.getMonthValue();
	    System.out.println( month );
	    month = ld.get( ChronoField.MONTH_OF_YEAR );
	    System.out.println( month );
	    // 일
	    int day = ld.getDayOfMonth();
	    System.out.println( day );
	    day = ld.getDayOfYear();
	    System.out.println( day );
	    day = ld.get(ChronoField.DAY_OF_MONTH);
	    System.out.println( day );
	    
	    // 요일
	    // Enum 열거형 타입
	    // 1(월) 2(화) 3(수) ~ 6(토) 7(일)
	    DayOfWeek dof = ld.getDayOfWeek();
	    System.out.println( dof.getValue() +" / " + dof );
	    int dow = ld.get( ChronoField.DAY_OF_WEEK );
	    System.out.println( dow );
		
	    // 윤년 여부 boolean 반환하는 메서드 
	    // ld.isLeapYear()
	    System.out.println( ld.isLeapYear() ); // 2025  false
	    
	} // main

} // class











