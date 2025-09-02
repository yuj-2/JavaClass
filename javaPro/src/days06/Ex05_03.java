package days06;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author kenik  
 * @date 2025. 8. 25. 오후 4:46:53 
 * @subject   
 * @content 
 */ 
public class Ex05_03 {

	public static void main(String[] args) {
		// [문제] 100 개의 정수 중에 가장 큰 값, 작은값
		// int [] m = {10, 31, 98, 38, 68, 91, 95, 76, 27, 29};
		// System.out.println( m.length );
		
		int [] m = new int[20];
		// 1~100 임의의 정수
		Random rnd = new Random();
		for (int i = 0; i < m.length; i++) {
			m[i] = rnd.nextInt(100)+1;
		}		
		System.out.println( Arrays.toString(m));
		
		// [2] int [] -> IntStream 변환 : of()
		// IntStream.of(m).max();
		
		// [1]
		// m[0] m[1] 2  3   4               19
		// [57, 41, 16, 25, 45, 72, 40, 18, 50]
		int max = m[0];
		int min = m[0];
		for (int i = 1; i < m.length; i++) {
			max = Math.max(max, m[i] );
			min = Math.min(min, m[i] );
		}
		System.out.println( " max:"+ max );
		System.out.println( " min:"+ min );
		

	} // main

} // class









