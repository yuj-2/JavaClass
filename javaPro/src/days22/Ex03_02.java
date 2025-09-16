package days22;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오전 10:28:08 
 * @subject   
 * @content 
 */ 
public class Ex03_02 {

	public static void main(String[] args) {
		// 개강일로부터 100일째 되는 날 기념..
		Calendar c = new GregorianCalendar(2025, 8-1, 18);
		c.add( Calendar.DATE, 100);
		
		String dateFormat =  String.format(
	 			"%d.%d.%d(%c) %s %2d:%2d:%2d.%3d"
	 			, c.get( Calendar.YEAR )
	 			, c.get( Calendar.MONTH )+1
	 			, c.get( Calendar.DATE )
	 			, "_일월화수목금토".charAt( c.get( Calendar.DAY_OF_WEEK ) )
	 			, c.get( Calendar.AM_PM ) == 0 ? "오전" : "오후"
	 			, c.get( Calendar.HOUR )
	 			, c.get( Calendar.MINUTE )
	 			, c.get( Calendar.SECOND )
	 			, c.get( Calendar.MILLISECOND ));
	 	System.out.println( dateFormat );

	} // main

} // class
