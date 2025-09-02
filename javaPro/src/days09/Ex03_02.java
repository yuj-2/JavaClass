package days09;

import java.util.Date;

/**
 * @author kenik  
 * @date 2025. 8. 28. 오후 2:10:37 
 * @subject   
 * @content 
 */ 
public class Ex03_02 {

	public static void main(String[] args) {
		/*
		// Java 날짜/시간 정보를 가지고 있는 클래스 - java.util.Date, Calendar 클래스
		Date today = new Date();
		// 년도
		int todayYear = today.getYear() + 1900;
		// 월
		int todayMonth = today.getMonth() + 1;
		// 일
		int todayDay = today.getDate();
		
		System.out.println( todayYear );
		System.out.println( todayMonth );
		System.out.println( todayDay );
		*/

	}
	
    public static boolean isToday(int year, int month, int day) {
		// return true 오늘날짜와  year,  month,  day
    	Date today = new Date(); 
		int todayYear = today.getYear() + 1900; 
		int todayMonth = today.getMonth() + 1; 
		int todayDay = today.getDate();
		
    	return (   todayYear == year && todayMonth == month && todayDay == day  );
	}

}









