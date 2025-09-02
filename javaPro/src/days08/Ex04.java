package days08;

import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 27. 오후 12:26:50 
 * @subject   
 * @content 
 */ 
public class Ex04 {

	public static void main(String[] args) {
		// 정보처리 기사 실기
		// [문제] 어떤 정수를 입력받아서 약수를 구해서 출력하세요. 
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 정수(n) 입력 ? ");
		int n = scanner.nextInt();  // 8
		
		System.out.println(1);
		System.out.println(n);
		
		for (int i = 2; i <= n/2; i++) {
			if( n % i == 0 ) {
				System.out.println( i );
			}
		}
		
		// [문제] 최대공약수, 최소공배수
		// [문제] 소수
		
		// 피보나치 수열
		

	} // main

} // class










