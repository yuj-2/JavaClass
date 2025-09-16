package days22;

import java.util.Date;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오전 7:03:43 
 * @subject   
 * @content 
 */ 
public class Ex01 {

	public static void main(String[] args) {
		
		// 개강일
		Date startDate = new Date(2025-1900, 8-1, 18, 9, 0, 0);
		System.out.println( startDate.toLocaleString() );
		// 수료일
		Date endDate = new Date();
		endDate.setYear(2026-1900);
		endDate.setMonth(3-1);
		endDate.setDate(4);
		endDate.setHours(18);
		endDate.setMinutes(0);
		endDate.setSeconds(0);		
		System.out.println( endDate.toLocaleString() );
		
		while (true) {
			// 오늘날짜
			Date today = new Date();
			//System.out.println( today.toLocaleString());
			
			// [days10.Ex03.java 문제와 동일한 개념.]
			// 오늘날짜 - 개강일 =  몇일 파악
			// [풀이] 수료일 - 오늘날짜 =  남은 기간 파악
			long timeDiff =  endDate.getTime() - today.getTime();
			System.out.println( timeDiff +" ms");
			long msSecond = 1000; // 1000ms == 1s
			long msMinute = msSecond * 60; // 1000 * 60 = 1m
			long msHour = msMinute * 60;   // 1h
			long msDay = msHour * 24;
			
			long days = timeDiff / msDay;
			timeDiff =  timeDiff % msDay;
			
			long hours = timeDiff / msHour;
			timeDiff =  timeDiff % msHour;
			
			long minutes = timeDiff /  msMinute;
			timeDiff = timeDiff % msMinute;
			
			long seconds = timeDiff / msSecond ;
			timeDiff = timeDiff % msSecond;
			
			System.out.printf("> 남은 기간: %d일 %2d:%2d:%2d.%3d\n"
					, days, hours, minutes, seconds, timeDiff);
			
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		} // while
		
		

	} // main

} // class










