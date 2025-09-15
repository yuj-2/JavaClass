package days21;

import java.util.Date;

/**
 * @author kenik  
 * @date 2025. 9. 15. 오후 4:31:02 
 * @subject   날짜와 시간을 다루는 클래스 
 * @content   형식화 클래스
 * 
 *         1. jdk 1.0 - java.util.Date 클래스   - 폐기될 예정
 *         2. jdk 1.1 - java.util.Calendar 클래스 
 *         3. jdk 1.8 - java.time 패키지 안에
 *                           ㄴ 다양한 하위 패키지
 *                           ㄴ 다양한 날짜/시간 클래스 추가되어졌다.  
 */ 
public class Ex11 {

	public static void main(String[] args) {
		// 생성자 8가지 있고 3개정도만 폐기 안됨. 
		Date d = new Date(); 
		// Mon Sep 15 16:35:25 GMT+09:00 2025
		System.out.println( d );
		// 2025. 9. 15. 오후 4:35:45
		System.out.println( d.toLocaleString() );
		
		// 년
		System.out.println( d.getYear() + 1900 );
		// 월
		System.out.println( d.getMonth() + 1 ); // 0(1월) ~ 11(12월)
		// 일
		System.out.println( d.getDate() );
		// 시간
		System.out.println( d.getHours() );
		// 분
		System.out.println( d.getMinutes() );
		// 초
		System.out.println( d.getSeconds() );
		// 밀리초 X		
		// 요일
		System.out.println( "일월화수목금토".charAt( d.getDay() ) +"요일"); // 0(일),1(월)~6(토)
		
		// Date.getTime()
		long ms = d.getTime();  // 1970.1.1 00:00:00 계산된 밀리초를 반환하는 메서드
		System.out.println( ms );
		

	} // main

} // class
