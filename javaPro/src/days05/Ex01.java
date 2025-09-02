package days05;

import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 22. 오전 7:00:39 
 * @subject   제어문 
 * @content 이재혁 병결
 *          이지혜 목/금 결석 (개인사정)
 *          
 *          1) 조건문 : if문, if~else문, if~else if~else if~else문
 *          2) 분기문 : switch문 
 */ 
public class Ex01 {

	public static void main(String[] args) {

		/*
		switch (key) {  // key == 주어진변수, 수식
		case value:     // value == 값	, 변수 X		
			break;
		default:
			break;
		}
		 */

		// 정수를 입력받아서 홀/짝수 출력 -> switch문 사용.
		int n;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("> 정수(n) 입력 ? ");
		n = scanner.nextInt();

		int zero = 0;
		final int ZERO= 0;
		
		String result ;
		// JDK 8, 11 이하 버젼
		switch (  n % 2  ) {
		// case 0:
		// case zero:
		case ZERO:
			result = "짝수(Even Number)";
			break;
		//case 1:
		default:
			result = "홀수(Odd Number)";
			break;
		}
		
		/* 
		// JDK 14 이상
		String result = switch ( n % 2 ) {
		    case 0 -> "짝수"; 
		    default -> "홀수";
		};
		*/
		System.out.printf("%d는 \"%s\"이다.", n, result);

	} // main

} // class















