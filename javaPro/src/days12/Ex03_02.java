package days12;

import java.util.Arrays;

/**
 * @author yujin  
 * @date 2025. 9. 2. 오전 11:38:46 
 * @subject   배열 복사 메서드 사용 예제
 * @content 
 */ 
public class Ex03_02 {
	public static void main(String[] args) {
		int [] m = {3,5,2,4,1};
		System.out.println("> m: "+Arrays.toString(m));
		int [] temp = new int[m.length+3];
		// m -> temp 배열 복사 : arrayCopy() 메서드를 사용
//		System.arraycopy(m, 2, temp, 4, 2);
		System.arraycopy(m, 0, temp, 0, m.length);
		
		
		System.out.println("> temp: " + Arrays.toString(temp));
		System.arraycopy(args, 0, args, 0, 0);
		
	}
}
