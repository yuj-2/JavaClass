package days12;

import java.util.Arrays;

/**
 * @author kenik  
 * @date 2025. 9. 2. 오후 2:32:29 
 * @subject   
 * @content 
 */ 
public class Ex05 {

	public static void main(String[] args) {
		/*
		 * [ 정렬(Sort) ]
		 * - 특정 기준에 맞게 데이터를 열거하는 알고리즘
		 * - 오름차순 정렬( [Asc]ending Sort )
		 *    예) 작은 값 ---> 큰값 순으로 정렬
		 *    1 2 3 4 5
		 *    a b c d e
		 *    가나다라마  
		 * 
		 *   내림차순 정렬( [Desc]ending Sort )
		 *    5 4 3 2 1
		 *    e d c b a
		 *    마라다나가
		 *  - [버블], 선택, 삽입, 쉘, 병합 정렬 등등   
		 * */

		int[] m = { 3, 5, 2, 4, 1 };
		System.out.println( Arrays.toString(m));
		//      Arrays.sort(m);
		bubbleSort(m);      
		System.out.println( Arrays.toString(m));

	} // main

	private static void bubbleSort(int[] m) {
		// ****
		// ***
		// **
		// *
		//	      System.out.println("****");
		//	      System.out.println("***");
		//	      System.out.println("**");
		//	      System.out.println("*");

		//  i=1  j=1,2,3,4  + 개행
		//  i=2  j=1,2,3  + 개행
		//  i=3  j=1,2  + 개행
		//  i=4  j=1 + 개행   
		//  j  = 5 - i
		/*
	      for (int i = 1; i <=4 ; i++) {     // 4줄 for문
	         for (int j = 1; j <= 5 - i; j++) { // **** for문
	            System.out.print("*");
	         }
	         System.out.println(); // 개행
	      }
		 */
		//  m0 m1 m2 m3 m4            버블정렬로 오름차순 정렬.
		//  3, 5, 2, 4, 1
		// (0-1)(1-2)(2-3)(3-4)  3, 2, 4, 1, [5]  1회전
		// (0-1)(1-2)(2-3)       2, 3, 1,[4],[5]  2회전
		// (0-1)(1-2)            2, 1,[3],[4],[5] 3회전
		// (0-1)                 1, 2,[3],[4],[5] 4회전

		// (0)(1)(2)(3)  3, 2, 4, 1, [5]  1회전
		// (0)(1)(2)       2, 3, 1,[4],[5]  2회전
		// (0)(1)            2, 1,[3],[4],[5] 3회전
		// (0)                 1, 2,[3],[4],[5] 4회전
		// i=1 j=0123
		// i=2 j=012
		// i=3 j=01
		// i=4 j=0
		// j=4-i
		for (int i = 1; i <=4 ; i++) {
			System.out.printf("%d회전: \n", i);
			for (int j = 0; j <= 4-i; j++) { // **** for문
				System.out.printf("(%d-%d)", j, j+1);
				if( m[j] > m[j+1]) {
					System.out.print( " *** ");
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
				}
				System.out.println(Arrays.toString(m));
			}
			//System.out.println(); // 개행
		}

	}

} // class
