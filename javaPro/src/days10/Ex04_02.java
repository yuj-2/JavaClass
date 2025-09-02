package days10;

import java.util.Arrays;

/**
 * @author kenik  
 * @date 2025. 8. 29. 오후 3:19:13 
 * @subject   
 * @content 
 */ 
public class Ex04_02 {

	public static void main(String[] args) {
		int [] m = {3,5,2,4,1};
		//          z x a b f
		//        "jbc"  "kbs"   "jtbc"
		
		System.out.println( Arrays.toString(m) );
		// 오름차순 정렬(asc  sort)  1 2 3 4 5   a b f x z
		// 내림차순 정렬(desc) 5 4 3 2 1   z x f b a
		Arrays.sort(m);
		System.out.println( Arrays.toString(m) );
		
		/*
		int [] m = new int[10];		
		System.out.println( Arrays.toString(m) );
		
		//for (int i = 0; i < m.length; i++)   m[i] = 1;
		
		Arrays.fill(m, -1);
	 
		System.out.println( Arrays.toString(m) );
		*/
	}

}
