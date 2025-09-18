package days24;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

/**
 * @author kenik  
 * @date 2025. 9. 18. 오전 10:20:58 
 * @subject   로또 관련 예제 
 * @content 
 */ 
public class Ex03_02 {

	public static void main(String[] args) {

		Random rnd = new Random();
		HashSet  lotto = new HashSet(6);
		int n;

		while ( lotto.size() < 6 ) {
			n = rnd.nextInt(45)+1; //45		 
			lotto.add(n);
		} // while
		
//		System.out.println( lotto );
		
		// 반복자 사용해서 출력 (복습)

	}// main 

} // class
