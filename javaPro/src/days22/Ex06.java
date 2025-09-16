package days22;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오후 12:02:48 
 * @subject   DecimalFormat - format(), parse()
 * @content   SimpleDateFormat - format(), parse()
 */ 
public class Ex06 {

	public static void main(String[] args) {
		
		Date d = new Date();
		// 2025. 9. 16. 12:05:21
		// System.out.println( d.toLocaleString() );
		
		Calendar c = Calendar.getInstance();
		// System.out.println( c );
		
		// "2025. 9. 28. 4:48:00 금요일" 형식으로 날짜를 출력하고자 한다.
		String pattern = "yyyy. MM. dd. hh:mm:ss E요일"; 
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		// Date 클래스
		String strD = sdf.format(d);
		System.out.println( strD );
		// Calendar c -> Date 변환		
		strD = sdf.format(c.getTime());
		System.out.println( strD );
		
		

	} // main

} // class
