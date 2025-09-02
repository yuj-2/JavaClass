package com.util;

import java.util.Date;
import java.util.Scanner;

public class RrnUtils {
	//올 true, 잘 false
	public static boolean isRrnCheck(String rrn) {
		int tot=0;
		int [] m = { 2,3,4,5,6,7,0,8,9,2,3,4,5 };
		for (int i = 0; i <= 12 ; i++)   tot += (rrn.charAt(i)-'0') * m[i]; 
		int ㅍ = Integer.parseInt( rrn.substring(13, 14) ) ;
		int checkSum = (11-((tot) % 11))%10;
		return  ( checkSum == ㅍ)? true : false; 

	}

	public static boolean isBeforeBirthday(String rrn) {
		// 생일의 월/일
		int birthMonth = Integer.parseInt( rrn.substring(2, 4) );// 04
		int birthDay = Integer.parseInt( rrn.substring(4, 6) );  // 12

		// 오늘날짜의 월/일
		Date today = new Date(); 
		int todayMonth = today.getMonth() + 1; 
		int todayDay = today.getDate();

		if(  birthMonth < todayMonth || 
				( birthMonth == todayMonth  && birthDay < todayDay ) )
			return true;
		else
			return false;
	}

	public static int getAmericanAge(String rrn) {
		// 만나이 = 한국나이 + ( 생일이지나지않으면 -1 )
		int age = getCountingAge(rrn) + (isBeforeBirthday(rrn)? -1:0);
		return age;
	}

	public static int getCountingAge(String rrn) {
		// 한국나이 = 올해년도 - 생일년도 + 1;
		int 생일년도 =  getCentury(rrn) + Integer.parseInt( rrn.substring(0, 2) ); // 2010
		Date today = new Date();  
		int 올해년도 =  today.getYear() + 1900; // 2025;
		return 올해년도-생일년도+1;
	}

	public static String getBirthday(String rrn) {
		// 100412-3700001
		int year =  getCentury(rrn) + Integer.parseInt( rrn.substring(0, 2) ); // 2010
		int month = Integer.parseInt( rrn.substring(2, 4) );// 04
		int day = Integer.parseInt( rrn.substring(4, 6) );  // 12

		return String.format("%d년 %d월 %d일", year, month, day);

	}

	public static boolean getNationality(String rrn) {
		char gender = rrn.charAt(7);
		switch (gender) { 
		case '5': case '6': case '7': case '8':
			return false;
		default:  
			return true;
		}
	}

	public static int getCentury(String rrn) { 
		char gender = rrn.charAt(7);
		switch (gender) {
		case '9': case '0':
			return 1800;
		case '1': case '2': case '5': case '6':
			return 1900;
		default: // 3,4,7,8
			return 2000;
		}

	}

	public static boolean getGender(String rrn) { 
		char gender = rrn.charAt(7);     
		return  ( gender - '0') % 2 == 1 ? true : false; 
	}

	public static String getRrn(Scanner scanner) {
		String regex = "^(\\d{6}-[0-9]{7})$";
		// String regex = "^(\\d{2})(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])-(?:[1-4]|[5-8])\\d{6}$";
		String rrn;
		do {
			System.out.print("> 주민등록번호 14자리 입력( 예: 000000-000000) ? ");
			rrn = scanner.next();
		} while (!rrn.matches(regex));

		return rrn;
	}

}
