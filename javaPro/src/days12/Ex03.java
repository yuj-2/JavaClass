package days12;

import java.util.Arrays;

/**
 * @author kenik  
 * @date 2025. 9. 2. 오전 11:30:20 
 * @subject   배열 단점 -> 컬렉션 클래스 사용.
 * @content    ㄴ 배열 크기 자동 증가 X
 *                 CRUD  추가,수정,삭제,조회
 */ 
public class Ex03 {

	public static void main(String[] args) {

		int [] m = new int[3];
		int index = 0;
		m[index++] = 3;  // 0
		// index++; 
		m[index++] = 5;  // 1
		m[index++] = 2;  // 2

		System.out.println( Arrays.toString(m));

		m = increaseSizeAndCopy(m, index);       
		m[index++] = 4;  // 3
		System.out.println( Arrays.toString(m));

		// 1. m 배열에 2가 있는 확인.
		int pos = sequenceSearch(m, 2, index);
		System.out.println( pos );
		if (pos != -1) {
			// 2-1.
			m = increaseSizeAndCopy(m, index);
			// 2-2. 2가 있는 위치~ index 사이의 값을 뒤로 1씩 이동
			for (int i = index-1; i >= pos; i--) {
				m[i+1]=m[i];

			}
			// 3. 100을 2의 위치에 배치
			m[pos]= 100;
			// 4. index 1증가.
			index++;
		}// if
		System.out.println(Arrays.toString(m));
		
		
		// 100을 찾아서 삭제
		pos = 2;
		for (int i = 2+1; i < index; i++) {
			m[i-1] = m[i]; 
		}
		m[index-1] =0;
		System.out.println(Arrays.toString(m));

	} // main


	private static int [] increaseSizeAndCopy(int[] m, int index) {
		int [] temp = m;
		if( m.length == index) {
			temp = new int[m.length+3];
			System.arraycopy(m, 0, temp, 0, m.length);
			// m = temp;
			//System.out.println("> " +  Arrays.toString(m));
		}      
		return temp;
	}


	// 중복함수
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







