package days06;

import java.util.stream.IntStream;

/**
 * @author kenik  
 * @date 2025. 8. 25. 오후 3:24:03 
 * @subject   
 * @content 
 */ 
public class Ex03 {

	public static void main(String[] args) {
		// [람다와 스트림]
		// int sum = IntStream.rangeClosed(1, 10).sum();
		// System.out.println( sum );

		// 1~10 홀수의 합
		/* (암기)
		int sum = IntStream
				   .rangeClosed(1, 10)
				   .filter( n -> n%2!=0 )  // -> 람다연산자, 람다식
				   .sum();
		System.out.println( sum );
		 */

		// 1~10 정수의 합 출력.
		/*
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("\b=%d\n", sum );
		 */

		// 1~ n  정수의 합 출력.
		int n = 15;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("\b=%d\n", sum );


	}//main

}//class





