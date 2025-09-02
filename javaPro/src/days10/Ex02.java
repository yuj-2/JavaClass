package days10;

/**
 * @author kenik  
 * @date 2025. 8. 29. 오후 12:28:09 
 * @subject   
 * @content 
 */ 
public class Ex02 {

	public static void main(String[] args) {
		// [정보처리기사 실기]
		// 정수 10 -> 2진수 출력  "00001010"
		int n = 10;
		
		// System.out.println( Integer.toBinaryString(n) );		
		
		String result = toBinaryConvert(n);
		
		// 문자열 길이
		//System.out.println( result.length() ); // 4
		
		System.out.printf("%d - %s\n", n, result);

	} // main

	private static String toBinaryConvert(int n) {
		int rest;
		String binary = "";

		while(n != 0) {
			rest = n%2;
			n=n/2;
			// System.out.println(rest);
			binary = rest + binary;
		}

		return String.format("%s%s","0".repeat(8-binary.length()),  binary);
	}

} // class







