package days04;

import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 21. 오후 3:44:18 
 * @subject   [제어문]
 * @content    ㄴ 정의 : 프로그램의 실행 순서(흐름)를 제어하는 문
 *             ㄴ 종류
 *                1) 조건문 : if문
 *                2) 분기문 : switch문
 *                3) 반복문 : for문, foreach문(==확장for문)
 *                4) 조건반복문 : while문, do~while문
 *                5) 기타 : break문, continue문
 */ 
public class Ex11 {

	public static void main(String[] args) {
		
		// 정수를 입력받아서
		// 짝수 -> "짝수" 출력
		// 홀수 -> "홀수" 출력.
		int n;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("> 정수(n) 입력 ? ");
		n = scanner.nextInt();
		
		/*
		if (n % 2 == 0)	System.out.println("짝수(Even Number)");
		if (n % 2 == 1)	System.out.println("홀수(Odd Number)");
		*/
		
		if (n % 2 == 0) {
			System.out.println("짝수(Even Number)");
		} else {
			System.out.println("홀수(Odd Number)");
		}
		
		System.out.printf("n=%d\n", n);
		

	}//main

}//class
