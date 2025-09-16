package days22;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오전 10:40:49 
 * @subject   
 * @content 
 */ 
public class Ex03_04 {

	public static void main(String[] args) {
		int year = 2025;
		int month = 8;
		
		Calendar c = new GregorianCalendar(year, month-1, 1);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println( dayOfWeek ); // 금 (6)
		//c.add(  Calendar.DATE , -dayOfWeek+1 );		
		//c.add( Calendar.DATE, 1);
		c.add(  Calendar.DATE , -dayOfWeek );
		
		for (int i = 0; i < 42; i++) {
			c.add( Calendar.DATE, 1);
			
			String dateFormat =  String.format(
		 			"%d.%d.%d(%c)"
		 			, c.get( Calendar.YEAR )
		 			, c.get( Calendar.MONTH )+1
		 			, c.get( Calendar.DATE )
		 			, "_일월화수목금토".charAt( c.get( Calendar.DAY_OF_WEEK ) )
		 			);
		 	System.out.println( dateFormat );
			
		}
		

		
	}

}
