package days09;

import com.util.MyCalendar;

/**
 * @author kenik  
 * @date 2025. 8. 28. 오전 10:49:43 
 * @subject   
 * @content 
 */ 
public class Ex02_03 {

	public static void main(String[] args) {
		// [문제] 1년 ~ 2025년 까지 총 몇 번의 윤년이 있는지 출력.
		/* [1]
		int count = 0;
		for (int i = 1; i <= 2025 ; i++) {
			 if( MyCalendar.isLeapYear(i) ) count++;
		}
		System.out.println( count );
		*/
		
		// [2]
		int count = 2025/4 - 2025/100 + 2025/400;
		System.out.println( count );

	} // main

} // class





