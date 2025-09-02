package days04;

import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 21. 오후 3:11:16 
 * @subject   
 * @content 
 */ 
public class Ex09 {

	public static void main(String[] args) {
		int a = 100;
		int b; // 키보드로 부터 정수를 입력		
		// a,b 정수값이 같은지 여부를 체크 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> b 입력 ? ");
		b = scanner.nextInt();
		
		System.out.println( a == b ? "같다": "다르다" );

	}// main

}// class









