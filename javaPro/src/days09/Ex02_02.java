package days09;

import com.util.MyCalendar;

/**
 * @author kenik  
 * @date 2025. 8. 28. 오전 10:45:14 
 * @subject   
 * @content 
 */ 
public class Ex02_02 {

	public static void main(String[] args) {
		 // 1900~ 1950  윤년 체크
		for (int i = 1900; i <= 1950 ; i++) {
			System.out.printf("%d-%s\n", i
					, MyCalendar.isLeapYear(i)?"🤩":"" );
		}

	}

}
