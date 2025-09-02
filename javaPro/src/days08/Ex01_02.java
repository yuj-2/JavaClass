package days08;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 27. 오전 6:54:00 
 * @subject   
 * @content 
 */ 
public class Ex01_02 {
	
	public static void main(String[] args) {
		 
		//int [] m = new Random().ints(1,101).distinct().limit(10).toArray();
		int [] m = { 42, 41, 71, 61, 50, 80, 5, 51, 53, 63 };
		System.out.println( Arrays.toString(m) );
		
		Scanner scanner = new Scanner(System.in);		
		System.out.print("> 정수(n) 입력 ? ");
		int n = scanner.nextInt();  
		
		// [72, 52, 40, 70, 42, 46, 29, 81, 39, 60]
		// [ 0,   ,]
		int [] gap = new int[m.length];
		// n=41
		// [문제] 입력받은 정수와 가장 가까운 수(근사치)를 구해서 출력.
		for (int i = 0; i < gap.length; i++) {
			//gap[i] = m[i]-n < 0 ? -1*(m[i]-n): m[i]-n ;
			gap[i] = Math.abs( m[i]-n );
		}
		System.out.println( Arrays.toString(gap));
        
		int min = gap[0], minIndex=0;		
		for (int i = 1; i < gap.length; i++) {
			if( min > gap[i] ) {
				minIndex = i;
			}
		}
		
		for (int i = 0; i < gap.length; i++) {
			if( gap[minIndex] == gap[i] )
				System.out.println( m[i] );
		}
	
		
		 
	} // main
 
} // class











