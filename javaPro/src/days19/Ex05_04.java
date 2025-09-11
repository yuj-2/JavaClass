package days19;

import java.util.Random;

/**
 * @author kenik  
 * @date 2025. 9. 11. 오후 2:10:34 
 * @subject   
 * @content 
 */ 
public class Ex05_04 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		int [] m = new int[5];

		Random rnd = new Random();
		int n = -1;
		for (int i = 0; i < 10; i++) {

			try {				
				n = rnd.nextInt(5);  // 0 <=  정수  <5
				// java.lang.ArithmeticException: / by zero
				result = number / n;
				
				////
				//
				//
				System.out.println( result );
				
				int index = rnd.nextInt(10); // 0<= 정수 <10
				
				//java.lang.ArrayIndexOutOfBoundsException:
				m[index] = result;
				
				System.out.println("> index: " + index);

				/* 멀티 catch 블럭 */
			} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
				i--;
			} catch (Exception e) {
				System.out.println( "🤩🤩🤩" + e.toString());
				System.out.println( "❤️❤️❤️" + e.getMessage());
				e.printStackTrace();
			}

		} // for

	} // main

} // class









