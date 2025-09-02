package days12;

import java.util.Arrays;

/**
 * @author yujin  
 * @date 2025. 9. 2. 오후 2:07:21 
 * @subject   
 * @content 
 */ 
public class Ex03_03 {
	public static void main(String[] args) {
		int [] m = {3,5,2};
		//[3,5,2]
		System.out.println(Arrays.toString(m));
		// 배열 복사 + 크기 증가
		
		/*
		// [1]
		int [] temp = new int[m.length+3];
		for (int i = 0; i < m.length; i++) {
			temp[i] = m[i];
			
		}
		m=temp;
		*/
		
		
		/*
		// [2]
		int [] temp = new int[m.length+3];
		System.arraycopy(m, 0, temp, 0, m.length);
		m = temp;
		*/
		
		// [3] Arrays.copyOf() 메서드  -> 1) 배열크기증가 2) 배열복사
		m = Arrays.copyOf(m, m.length+3);		
		System.out.println(Arrays.toString(m));
		
	}
}
