package days19;

import java.util.Random;

/**
 * @author kenik  
 * @date 2025. 9. 11. 오후 2:10:34 
 * @subject   
 * @content 
 */ 
public class Ex05_02 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		Random rnd = new Random();
		int n = -1;
		for (int i = 0; i < 10; i++) {
			n = rnd.nextInt(5);  // 0 <=  정수  <5
			
			// 예외 처리 X
			if ( n == 0 ) {
				i--;
				continue;
			} else {
				// java.lang.ArithmeticException: / by zero
				result = number / n;
			} 
			
			System.out.println( result );
		} // for

	} // main

} // class









