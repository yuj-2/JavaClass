package days08;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

/**
 * @author kenik  
 * @date 2025. 8. 27. 오전 6:54:00 
 * @subject   
 * @content 
 */ 
public class Ex01 {
	
	public static void main(String[] args) {
		// 순서도
		// int 정수를 1~100까지 중복되지 않게 임의의 수를 10 채워넣은 배열 m을 선언하세요.
		/* [1]
		int index = 0;
		int n ;		
		boolean flag = false;
		int [] m = new int[10];
		n = (int)(Math.random()*100)+1;
		m[index++] = n;
			
		while ( index < m.length ) {
			flag = false;
			n = (int)(Math.random()*100)+1;
			for (int i = 0; i < index; i++) {
				if( m[i] == n ) {
					flag = true;
					break;
				}
			}			
			if( !flag ) m[index++] = n; 
		} // while
		*/
		
		int [] m = new Random().ints(1,101).distinct().limit(10).toArray();
		System.out.println( Arrays.toString(m) );
		
		// 1. 가장 큰 값, 작은 값을 찾아서 출력.
		/*
		int max = m[0], maxIndex=0;
		int min = m[0], minIndex=0;
		
		for (int i = 1; i < m.length; i++) {
			if( max < m[i] ) {
				max = m[i];
				maxIndex = i;
			}
			else if( min > m[i] ) {
				min = m[i];
				minIndex = i;
			}
		}
		System.out.println("max: " + max +"\t, index: " + maxIndex);
		System.out.println("min: " + min +"\t, index: " + minIndex);
		*/
		
		//  [2]
		// int [] -> IntStream 으로 변환
		/*
		System.out.println( Arrays.stream(m).max().getAsInt() );
		System.out.println( Arrays.stream(m).min().getAsInt() );
		*/

	} // main
 
} // class











