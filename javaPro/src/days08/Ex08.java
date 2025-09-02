package days08;

import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 27. 오후 4:12:47 
 * @subject   두 정수를 입력받아서 합을 출력하는 코딩.
 * @content 
 */ 
public class Ex08 {

	public static void main(String[] args) {
		int a, b, result = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("> a b input ? ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		// 두 정수의 합 
		//sum = a + b;
		//result = sum(a,b); // 함수 호출 부분
		
		//The method sum(int, int) is undefined for the type Ex08
		result = sum(a,b);
		
		
		System.out.printf("%d + %d = %d\n", a, b, result);

	} // main

	private static int sum(int a, int b) {
		return a + b;
	}

	 
 

	/*
	// 함수 선언 부분
	public static int sum(int a, int b) {
		//int result = a + b;
		//return result;		
		return a + b;
	}
	*/
	
} // class
