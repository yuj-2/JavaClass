package days10;

import java.util.Date;
import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 29. 오전 7:02:56 
 * @subject   주민등록번호 rrn
 * @content   https://ko.wikipedia.org/wiki/%EC%A3%BC%EB%AF%BC%EB%93%B1%EB%A1%9D%EB%B2%88%ED%98%B8
 */ 
public class Ex01 {

	public static void main(String[] args) {
		
		// 830412-2700001
		Scanner scanner = new Scanner(System.in); 
		String rrn = getRrn(scanner);
		System.out.println( rrn );
		
		/*
		// 1. 주민등록번호 -> 성별 체크
		boolean gender = getGender( rrn ); // 남자 true, 여자 false
		System.out.println(gender ? "남자" : "여자");
		// 2. 18세기, 19세기, 20세기 체크
		int century = getCentury( rrn );
		System.out.println( century );
		// 3. 내국인, 외국인 파악
		boolean nationality = getNationality(rrn);
		System.out.println( nationality ? "Koreans" : "Foreigners" );
		
		// 4. 생년월일     100412-3700001
		// "2010년 4월 12일" 반환 메서드 선언
		String birthday = getBirthday(rrn);
		System.out.println( birthday );
		*/
		
		// 5. 주민등록번호 -> 나이
		//           24.12.30 25.1.1 25.12.30 26.1.1
		//  한국나이      1살     2살     2살      3살
		// (세는나이)
		//  만나이       0살     0살     1살
		
		// 한국나이 = 올해년도 - 생일년도 + 1;
		// 만나이  = 올해년도 - 생일년도    생일이 지나면 1 + ;
		//        = 한국나이 + ( 생일이지나지않으면 -1)
		
		// 5-1. 세는 나이
		int age = getCountingAge(rrn);
		System.out.println("> 세는 나이: " + age);
		
		// 5-2. 만 나이
		age = getAmericanAge(rrn);
		System.out.println(age);

	} // main
	
	private static boolean isBeforeBirthday(String rrn) {
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
	
	private static int getAmericanAge(String rrn) {
		// 만나이 = 한국나이 + ( 생일이지나지않으면 -1 )
		int age = getCountingAge(rrn) + (isBeforeBirthday(rrn)? -1:0);
		return age;
	}

	private static int getCountingAge(String rrn) {
		// 한국나이 = 올해년도 - 생일년도 + 1;
		int 생일년도 =  getCentury(rrn) + Integer.parseInt( rrn.substring(0, 2) ); // 2010
		Date today = new Date();  
		int 올해년도 =  today.getYear() + 1900; // 2025;
		return 올해년도-생일년도+1;
	}

	private static String getBirthday(String rrn) {
		// 100412-3700001
		int year =  getCentury(rrn) + Integer.parseInt( rrn.substring(0, 2) ); // 2010
		int month = Integer.parseInt( rrn.substring(2, 4) );// 04
		int day = Integer.parseInt( rrn.substring(4, 6) );  // 12
		
		// System.out.printf("%d년 %d월 %d일", year, month, day);
		
		// return year +"년 " + month + "월 " + day + "일";
		return String.format("%d년 %d월 %d일", year, month, day);
		
	}

	private static boolean getNationality(String rrn) {
		char gender = rrn.charAt(7);
		switch (gender) { 
		case '5': case '6': case '7': case '8':
			return false;
		default:  
			return true;
		}
	}

	private static int getCentury(String rrn) {
		// ㄱㄴㄷㄹㅁㅂ - [ㅅ]ㅇㅈㅊㅋㅌㅍ
		// ㅅ : 성별 + 18(9,0),19(1,2,5,6),20(3,4,7,8)세기
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

	private static boolean getGender(String rrn) {
		// ㄱㄴㄷㄹㅁㅂ - [ㅅ]ㅇㅈㅊㅋㅌㅍ
		// ㅅ : 성별 + 18,19,20세기
		// String rrn = "830412-2700001"
		// String rrn.substring(0, 0)
		char gender = rrn.charAt(7); // '0'->48 '1'->49  		
		return  ( gender - '0') % 2 == 1 ? true : false;		
		/*
		switch (gender) {
		case '1': case '3': case '5': case '7': case '9':
			return true;
			// Unreachable code
			//break;
		default:
			return false;
			//break;
		}
		*/
		//return false;
	}

	private static String getRrn(Scanner scanner) {
		String regex = "^(\\d{6}-[0-9]{7})$";
		// String regex = "^(\\d{2})(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])-(?:[1-4]|[5-8])\\d{6}$";
		String rrn;
		do {
			System.out.print("> 주민등록번호 14자리 입력( 예: 000000-000000) ? ");
			rrn = scanner.next();
		} while (!rrn.matches(regex));
		
		return rrn;
	}

} // class
