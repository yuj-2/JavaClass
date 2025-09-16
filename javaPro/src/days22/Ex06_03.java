package days22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오후 12:15:34 
 * @subject   
 * @content 
 */ 
public class Ex06_03 {

	public static void main(String[] args) {
		
		String s = "2025.02.28(금)"; 
		
		String pattern = "yyyy.MM.dd(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			// 1) 문자열  s -> SimpleDateFormat 사용해서 Date 객체로 변환
			Date d = sdf.parse(s);
			System.out.println( d.toLocaleString() );
			// 2) 문자열  s -> SimpleDateFormat 사용해서 Calendar 객체로 변환
			Calendar c = Calendar.getInstance();
			// Date -> Calendar 변환
			c.setTime(d);
			System.out.println( c );
		} catch (ParseException e) { 
			e.printStackTrace();
		}
		 
		
		
		
		 

	} // main

} // class







