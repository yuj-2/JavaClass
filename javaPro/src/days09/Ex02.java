package days09;

import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 28. 오전 9:36:16 
 * @subject   [문제] 년도를 입력받아서 윤년/평년 출력
 * @content 
 */ 
public class Ex02 {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int year;		
		year = getYear(scanner);		
		//System.out.println( year );
		
		// 윤년체크하는 메서드 : isLeapYear
		// 매개변수 :  int 년도
		// 리턴값  :  윤년 true 평년 false
		//          boolean
		
		if ( isLeapYear(year) ) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
		
		
		
		     
	} // main

	private static boolean isLeapYear(int year) {
		
		return year%4 ==0 && year%100 !=0 || year%400==0;
	}

	private static int getYear(Scanner scanner) {
		String regex = "\\d+";
		String input;
		do {
			System.out.print("> 년도 입력 ? ");
			input = scanner.next();			
		} while ( !input.matches(regex) );
		int year = Integer.parseInt(input);
		return year;
	}

} // class



//지구 공전 :  365.2422일
		// 그레고리력 : 365.2425일
		// .2425 -> 정수 딱 떨어지는 해. 
		// 400년 -> 97일           치윤법
		// [치윤법]
		// 1) 4의 배수 년도 -> 2/29  1추가  100       [3]
		// 2) 100의 배수 년도  -1 추가                -4 
		// 3) 400의 배수 년도  1 추가

	      /*      [치윤법]  && ||
	       *      ① 서력 기원 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하고,
	       *           year%4 ==0  
	       *      ② 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하며, 
	       *            year%100 !=0
	       *      ③ 다만 400으로 나누어 떨어지는 해는 다시 윤년으로 정하였다 
	       */ 