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
public class Ex06_02 {

	public static void main(String[] args) {

		int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10
				, 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };

		Scanner scanner = new Scanner(System.in);
		System.out.print("> 배열에서 찾을 정수 입력 ? ");
		int n = scanner.nextInt();

		/*[3]
		int [] temp = sequenceSearch(m, n);
		System.out.println( Arrays.toString(temp));
		*/
		
		/* [2]
		String  result =  sequenceSearch(m, n);		
		System.out.println( result );  // "1, 6, 20, "		
		
		String regex = "\\s*,\\s*";
		String [] indexArr = result.split(regex);		
		System.out.println( Arrays.toString(indexArr));
		*/

		

	} // main

	// 오버로딩(Overloading)
	// [3]
	/*
	private static int [] sequenceSearch(int[] m, int n ) {
		int [] temp = new int[m.length];  // "1, 6, 20"
		int index = 0;
		for (int i = 0; i < m.length; i++) {
			if( n == m[i] ) {
				temp[index++] = i;
			}
		}
		 
		return Arrays.copyOf(temp, index);
	}
	*/
	
	// [2]
	/*
	private static String sequenceSearch(int[] m, int n ) {
		String result = "";  // "1, 6, 20"
		for (int i = 0; i < m.length; i++) {
			if( n == m[i] ) {
				result += i +", ";
			}
		}
		return result;
	}
	*/
	
	/* [1]
	private static int sequenceSearch(int[] m, int n ) {
		int pos = -1;
		for (int i = 0; i < m.length; i++) {
			if( n == m[i] ) {
				System.out.printf("찾는 정수 %d는 %d 위치에 있다.\n", n, i);
			}
		}
		return pos;
	}
	*/

	private static int sequenceSearch(int[] m, int n, int index) {
		int pos = -1;
		for (int i = 0; i < index; i++) {
			if( n == m[i] ) return i; 
		}
		return pos;
	}

} // class
