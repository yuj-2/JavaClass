package days03;

/**
 * @author kenik  
 * @date 2025. 8. 20. 오전 11:36:14 
 * @subject   대문자 -> 소문자 변환
 * @content   소문자 -> 대문자 변환
 *                 +- 32
 */ 
public class Ex03 {

	public static void main(String[] args) {
		// 'A' -> 문자코드표 65(10진수)  -> 0000 0000 0100 0001 2진수 변환
		// char 정수계열에 포함.
		
		// 대문자 + 32 = 소문자 변환
		// 소문자 - 32 = 대문자 변환
		System.out.println('A' + 32);	// 97   'a'
		System.out.println('a' - 32);	// 65   'A'		
		System.out.println('a' - 'A');

	}

}
