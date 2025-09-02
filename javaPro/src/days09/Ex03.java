package days09;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import com.util.Graphic2D;
import com.util.MyCalendar;

/**
 * @author kenik  
 * @date 2025. 8. 28. 오전 11:18:11 
 * @subject   만년 달력
 * @content   [일정관리/근태관리] - 달력
 *            년도와 월 선택(입력) -> 달력 
 */ 
public class Ex03 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int year, month;
		
		System.out.printf("> year, month input ? ");
		year = scanner.nextInt();  // 2000 ~2010
		month = scanner.nextInt(); // 1~12
		
//		for (int y = year; y <= year +10 ; y++) {
//			System.out.printf("\t [%d년도 달력]\n", y);
//			
//			for (int i = 1; i <=12; i++) {
//				printCalendar(y, i);
//			}
//			
//			System.out.println("> 엔터 치면 계속합니다.");
//			System.in.read();
//			System.in.skip(System.in.available()); // 13, 10
//		}
				
		 printCalendar(year, month);
		
	} // main

	private static void printCalendar(int year, int month) {
		// 1. year.month.1   무슨 요일 
		int dayOfWeek = getDayOfWeek(year, month, 1);
		//System.out.println( "일월화수목금토".charAt(dayOfWeek));
		// 2. year.month     마지막 날짜  28/29/30/31
		int lastDay = getLastDay(year, month);
		
		// 달력 출력
		System.out.printf("\t\t\t[%d년 %d월]\n", year, month );
		Graphic2D.drawLine(60, '-');
		String week = "일월화수목금토";
		for (int i = 0; i < week.length(); i++) {
			System.out.printf("\t%c", week.charAt(i));
		}
		System.out.println(); // 개행
		Graphic2D.drawLine(60, '-');
		// 1의 위치를 잡기 위한 코딩
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.printf("\t");
		}
		// 1 ~ lastDay
		for (int i = 1; i <= lastDay; i++) {
			System.out.printf( isToday(year, month, i) ? "\t[%d]" : "\t%d", i);
			if( (i+dayOfWeek) % 7 == 0 ) System.out.println();
		}
		System.out.println(); // 개행
		Graphic2D.drawLine(60, '-');
	}
	
	public static boolean isToday(int year, int month, int day) {
		// return true 오늘날짜와  year,  month,  day
    	Date today = new Date(); 
		int todayYear = today.getYear() + 1900; 
		int todayMonth = today.getMonth() + 1; 
		int todayDay = today.getDate();
		
    	return (   todayYear == year && todayMonth == month && todayDay == day  );
	}

	private static int getLastDay(int year, int month) {
		int lastDay = 0;
		int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		lastDay = daysInMonth[month]; 
		if( month == 2 && MyCalendar.isLeapYear(year) )	lastDay++;
		
		/*
		switch (month) {
		case 1: case 3: case 5: case 7:  case 8: case 10: case 12:
			lastDay = 31;
			break;
		case 2:
			lastDay = 28 + (MyCalendar.isLeapYear(year)? 1 : 0);
			break; 
		default: // 4/6/9/11
			lastDay = 30;
			break;
		} 
		*/
		return lastDay;
	}

	private static int getDayOfWeek(int year, int month, int day) {
		
		int totalDays = 0;
		// 1.1.1 ~ y.m.1 총날짜수
		totalDays = getTotalDays(year, month, day);
		//System.out.printf("%d년 %d월 %d일 총날짜수: %d일\n"			, year, month, day ,totalDays);

		return totalDays % 7; // 0(일) 1(월) 2(화) ~ 6(토)
	}

	private static int getTotalDays(int year, int month, int day) {
		// 1.1.1 ~ 2019.12.31     2020.5.1
		// year-1 == 2019
		
		int totalDays = 365 * (year-1) + ((year-1)/4 - (year-1)/100 + (year-1)/400);
		
		// year      12
		//                       1   2   3
		int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 1; i < month; i++)	totalDays += daysInMonth[i]; 
		if( month >=3 && MyCalendar.isLeapYear(year) ) totalDays++;		
		totalDays += day;
		
		return totalDays;
	}

} // class
 


