package days24;

import java.util.HashSet;

/**
 * @author kenik  
 * @date 2025. 9. 18. 오전 10:12:23 
 * @subject   C <- L <- ArrayList, Vector, LinkedList, Stack, [Queue]
 * @content   C <- S <- HashSet 컬렉션 클래스
 *                 중복 허용 X
 *                 순서 유지 X
 */ 
public class Ex03 {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add( 9 );
		hs.add( 1 );
		hs.add( 15 );
		hs.add( 3 );
		hs.add( 3 );
		hs.add( 3 );
		
		hs.add(null);
		hs.add(null);
		hs.add(null);
		
		// Set 계열
		// 순서 유지 X (확인)
		// 중복 허용 X (확인)
		// null 허용 O
		System.out.println( hs );
		
		

	} // main

} // class
