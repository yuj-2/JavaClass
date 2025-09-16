package days22;

import java.util.Calendar;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오전 9:38:00 
 * @subject   jdk 1.0  Date 클래스
 * @content   [ jdk 1.1  Calendar 클래스 ]
 */ 
public class Ex02 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		// System.out.println( c.toString() );
		// 년
		System.out.println( c.get(1) );  // 2025
		System.out.println( c.get( Calendar.YEAR ) );  // 2025
		// 월
		System.out.println( c.get( Calendar.MONTH ) + 1 );  // 2025
		// 일
		System.out.println( c.get( Calendar.DATE )  ); 
		System.out.println( c.get( Calendar.DAY_OF_MONTH )  ); 
		System.out.println( c.get( Calendar.DAY_OF_YEAR )  ); 
		// 시간
		System.out.println( c.get( Calendar.HOUR)  );  // 12
		System.out.println( c.get( Calendar.HOUR_OF_DAY)  ); // 24 
		// 분
		System.out.println( c.get( Calendar.MINUTE )  ); 
		// 초
		System.out.println( c.get( Calendar.SECOND )  ); 
		// 요일
		// Date       0(일) 1(월) ~ 6(토)
		// Calendar   1(일) 2(월)   7(토)
		System.out.println( c.get( Calendar.DAY_OF_WEEK )  ); 
		
		// 밀리초
		System.out.println( c.get( Calendar.MILLISECOND )  );
		
		
		// 날짜,시간 출력
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




