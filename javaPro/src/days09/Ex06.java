package days09;

import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 28. 오후 5:03:55 
 * @subject   
 * @content 
 */ 
public class Ex06 {

	public static void main(String[] args) {
		/* [주민등록번호]
		 * 1. Resident Registration Number, RRN
		 * 2. ㄱㄴㄷㄹㅁㅂ - ㅅㅇㅈㅊㅋㅌㅍ
		 *    1) ㄱㄴㄷㄹㅁㅂ  생년월일
		 *    2) ㅅ - 18세기, 19세기, 20세기    성별
		 *    
		 *    3) ㅇㅈ - 출생등록지
		 *       ㅊㅋ - 읍,동,면 주민센터 
		 *    4) ㅌ - 주민센터 등록 순번   
		 *    5) ㅍ - 검증번호
		 *    ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}

              즉, 소괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ이다. (단, 10은 0, 11은 1로 표기한다.)
		 * */

		Scanner scanner = new Scanner(System.in); 
		String rrn = getRrn(scanner);
		System.out.println( rrn );
		
	} // main
     //                "123456-1234567"
	private static String getRrn(Scanner scanner) {
		String regex = "^(\\d{6}-[0-9]{7})$";
		// String regex = "^(\\d{2})(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])-(?:[1-4]|[5-8])\\d{6}$";
		return null;
	}

} // class



