package days13;

import java.util.Arrays;

/**
 * @author kenik  
 * @date 2025. 9. 3. 오전 11:45:28 
 * @subject   배열 초기화 설명
 * @content   1차원, 2차원, 3차원 배열 초기화 .. 
 */ 
public class Ex03 {

	public static void main(String[] args) {
		
		// 1 차원 배열의 초기화
		/*
		int [] m = new int[3];
		m[0] = 1;
		m[1] = 2;
		m[2] = 3;  
		// m[3] = 4; ArrayIndexOutOfBoundsException
		 */
		
		// int [] m = new int[] {1, 2, 3};
		int [] m = {
				     1, 
				     2, 
				     3
				   };
		
		System.out.println( Arrays.toString(m));
		

	} // main

} // class






