package days13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 9. 3. 오후 4:10:53 
 * @subject  검색(Search) 
 * @content   ㄴ 항목들의 집합에서 특정 항목을 찾아내는 것.
 *            1) 순차 검색( Sequence Search )
 *                n 값이 있는 모든 index 값을 출력하자.
 *                검색) 수정, 삭제 ...
 *            2) 이진 검색( Binary Search )
 */ 
public class Ex06_03 {

	public static void main(String[] args) {

		int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10
				, 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };

		Scanner scanner = new Scanner(System.in);
		System.out.print("> 배열에서 찾을 정수 입력 ? ");
		int n = scanner.nextInt();
		
		int fromIndex = 0;
		int index = -1;
		
		while ( (index = sequenceSearch(m, n, fromIndex) ) != -1 ) {
			System.out.println( index);
			fromIndex = index + 1;
		}
		
		/*
		int fromIndex = 0;
		int index = -1;
		index = sequenceSearch(m, n, fromIndex);
		if (index == -1) {
			System.out.println("X");
		} else {
			System.out.println( index);
		}
		//
		fromIndex = index + 1;
		index = sequenceSearch(m, n, fromIndex);
		if (index == -1) {
			System.out.println("X");
		} else {
			System.out.println( index);
		}
		//
		fromIndex = index + 1;
		index = sequenceSearch(m, n, fromIndex);
		if (index == -1) {
			System.out.println("X");
		} else {
			System.out.println( index);
		}
		//
		fromIndex = index + 1;
		index = sequenceSearch(m, n, fromIndex);
		if (index == -1) {
			System.out.println("X");
		} else {
			System.out.println( index);
		}
		*/
		
		

		 

	} // main
 

	private static int sequenceSearch(int[] m, int n, int fromIndex ) {
		int pos=-1;
		for (int i = fromIndex; i < m.length; i++) {
			if( n == m[i] )			return i;
		}
		return pos;
	} 
	
	private static int sequenceSearch(int[] m, int n ) {
		int pos=-1;
		for (int i = 0; i < m.length; i++) {
			if( n == m[i] )			return i;
		}
		return pos;
	} 
	 

} // class
