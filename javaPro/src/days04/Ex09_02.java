package days04;

import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 21. 오후 3:11:16 
 * @subject   
 * @content 
 */ 
public class Ex09_02 {

	public static void main(String[] args) {
		// 두 문자열을 비교... ( 암기 )
		String a = "kenik";
		String b; 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> b 입력 ? ");
		b = scanner.next();
		
		// System.out.println( a == b ? "같다": "다르다" );
		
		// 두 문자열을 비교할 때는 equals() 메서드 사용한다.
		System.out.println( a.equals(b) ? "같다": "다르다" );
		System.out.println( a.equalsIgnoreCase(b) ? "같다": "다르다" );

	}// main

}// class









