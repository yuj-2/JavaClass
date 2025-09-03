package days13;

import java.util.Arrays;

/**
 * @author kenik  
 * @date 2025. 9. 3. 오전 10:17:16 
 * @subject   
 * @content 
 */ 
public class Ex02 {

	public static void main(String[] args) {
		
		// 1차원 배열 - 열
		/*
		int [] m = new int[8];
		dispM(m);
		*/
		
		// 2차원 배열 - 행, 열      다차원 배열
		// 배열의 배열이다. (암기)
		int [][] m = new int[4][2];
		// 2차원 배열의 크기 
		System.out.println( m.length ); // 행크기
		System.out.println( m[0].length ); // 0행의 열크기
		System.out.println( m[1].length ); // 1행의 열크기
		System.out.println( m[2].length ); // 2행의 열크기
		System.out.println( m[3].length ); // 3행의 열크기
		
		m[0][0] = 1;
		m[0][1] = 2;
		m[1][0] = 3;
		
		// 2차원 배열 출력하는 dispM() 선언 + 호출
		dispM(m);

	} // main

	private static void dispM(int[][] m) {
		// ****  0행    j 4
		// ***   1행    j 3
		// **    2행    j 2
		// *     3행    j 1
		// j=4-i
		/*
		for (int i = 0; i < m.length; i++) {      // 행 크기
			for (int j = 0; j < 4-i; j++) {  // 열 크기
				System.out.print("*");
			} // for j
			System.out.println();
		} // for i
		*/
		
		for (int i = 0; i < m.length; i++) {      // 행 크기 4
			for (int j = 0; j < m[i].length; j++) {  // 열 크기
				System.out.printf("m[%d][%d]=%d ", i, j, m[i][j] );
			} // for j
			System.out.println();
		} // for i
		
	}

	private static void dispM(int[] m) {
		System.out.println(Arrays.toString(m));
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d ", i, m[i]);
		}
	}

} // class











