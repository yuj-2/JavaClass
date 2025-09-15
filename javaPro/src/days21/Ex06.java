package days21;

import java.util.Arrays;

/**
 * @author kenik  
 * @date 2025. 9. 15. 오전 11:48:30 
 * @subject   java.util 패키지
 * @content     ㄴ 자주 사용되는 유용한 유틸리티( 클래스 )
 *                 Arrays 클래스
 *                 Random 클래스
 */ 
public class Ex06 {

	public static void main(String[] args) {
		int [] m = { 3, 5, 2, 4, 1, 15 };
		System.out.println( Arrays.toString(m) );
		// 이진 검색의 필수 조건은 정렬이 되어져 있어야 한다. 
		Arrays.sort(m);
		System.out.println( Arrays.toString(m) );
		
		int index = Arrays.binarySearch(m, 4);
		System.out.println( index );
		
		// Arrays.asList(null)   int[] -> List 변환
		// 배열과 배열을 비교하는 메서드 
		// Arrays.compare(null, null)
		
//		Arrays.fill(m, -1);
//		System.out.println( Arrays.toString(m) );
		
		
		

	}

}
