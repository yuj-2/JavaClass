package days13;

import java.util.Arrays;

/**
 * @author kenik  
 * @date 2025. 9. 3. 오후 5:25:42 
 * @subject   정렬
 * @content     ㄴ 이진검색(binary search)
 *                  필수 조건: 정렬되어져 있어야 한다.
 */ 
public class Ex07 {

	public static void main(String[] args) {
		int [] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30, 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 
		   		 86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142, 145, 146, 150, 151, 160, 161, 166, 168, 
				 169, 172, 181, 184, 185, 191, 198 };
		// System.out.println(m.length); // 50
		// Arrays.binarySearch(m, 90)
		
		int index =  binarySeach( m , 90);
		System.out.println( index );

	}

	private static int binarySeach(int[] m, int n) {
		 int bot = 0, top = m.length-1, mid;
		 // int count = 0;
		return 0;
	}

}
