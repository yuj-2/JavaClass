package days19;

import java.util.Arrays;

/**
 * @author kenik  
 * @date 2025. 9. 11. 오전 11:27:39 
 * @subject   
 * @content 
 */ 
public class Ex03_02 {

	public static void main(String[] args) {
		String [] s = { "kbs", "sbs", "mbc", "jtbc" };
		System.out.println( Arrays.toString( s ) );
		// 오름차순으로 정렬
		//Arrays.sort(s);
		/* [1]
		String [] temp = new String[s.length];
		// 0 -> 3  m.lenth-1
		// 1 -> 2
		// 2 -> 1
		// 3 -> 0
		// i    3-i
		// 내림차순으로 정렬 
		int upperBond = s.length-1;
		for (int i = 0; i < s.length; i++) {
			temp[upperBond - i] = s[i];
		}
		s = temp;		
		*/
		System.out.println( Arrays.toString( s ) );
		

	} // main

} // class








