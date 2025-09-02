package days06;

import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author kenik  
 * @date 2025. 8. 25. 오후 3:37:20 
 * @subject   
 * @content 
 */ 
public class Ex03_02 {

	public static void main(String[] args) {
		// [문제]
		// 두 정수 n, m을 입력받아서
		// 두 정수 사이의 합을 출력
		// 입력형식)
		// > n, m 입력 ? 2 5엔터
		// 출력형식)
		// > 2+3+4+5=14
		
		Scanner scanner = new Scanner(System.in);
		int n, m;
		// 입력
		System.out.print("> n, m 입력 ? ");
		n = scanner.nextInt(); // 입력 잘못=> 유효성 검사
		m = scanner.nextInt(); // 입력 잘못=> 유효성 검사
		// 출력
		/* 
		for (int i = Math.min(n, m); i <= Math.max(n, m); i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		*/
		
		// [3]	
		int sum = 0;
		int min = n > m ? m : n; // Math.min(n, m);
		int max = Math.max(n, m);
		for (int i = min; i <= max; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		
		// [2]
		/*
		if (n > m) {
			int temp = n;
			n = m;
			m = temp;
		}
		for (int i = n; i <= m; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		*/
		/* [1]
		if (n > m) {
			for (int i = n; i >= m; i--) {
				System.out.printf("%d+", i);
				sum += i;
			}
		} else {
			for (int i = n; i <= m; i++) {
				System.out.printf("%d+", i);
				sum += i;
			}
		}
		*/
		
		System.out.printf("\b=%d\n", sum);
		
		
		 
	}// main

}// class





