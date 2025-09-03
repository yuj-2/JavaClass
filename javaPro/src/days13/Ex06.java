package days13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 9. 3. 오후 4:10:53 
 * @subject  검색(Search) 
 * @content   ㄴ 항목들의 집합에서 특정 항목을 찾아내는 것.
 *            1) 순차 검색( Sequence Search )
 *            2) 이진 검색( Binary Search )
 */ 
public class Ex06 {

	public static void main(String[] args) {

		int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10
				, 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };
		
		// Arrays.sort(m); 오른차순 정렬 

		Scanner scanner = new Scanner(System.in);
		System.out.print("> 배열에서 찾을 정수 입력 ? ");
		int n = scanner.nextInt();

		int index = sequenceSearch(m, n);

		if (index == -1 ) {
			System.out.println( "찾는 정수(n)은 없다." );
		}else {
			System.out.println( index );
		} 

	} // main

	// 오버로딩(Overloading)
	private static int sequenceSearch(int[] m, int n ) {
		int pos = -1;
		for (int i = 0; i < m.length; i++) {
			if( n == m[i] ) return i; 
		}
		return pos;
	}

	private static int sequenceSearch(int[] m, int n, int index) {
		int pos = -1;
		for (int i = 0; i < index; i++) {
			if( n == m[i] ) return i; 
		}
		return pos;
	}

} // class
