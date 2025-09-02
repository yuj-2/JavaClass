package days05;

/**
 * @author kenik  
 * @date 2025. 8. 22. 오후 3:06:27 
 * @subject   
 * @content 
 */ 
public class Ex06_03 {

	// 2+3+4=9
	// 1+2+3=6
	public static void main(String[] args) { 
		// i  sum    i++ <= 3
		// 2   2      1 <= 3  T 
		// 3   5      2 <= 3  T
		// 4   9      3 <= 3  T
		//            4 <= 3  F 
		
		// 2+3+4+=9
		int i=1;
		int sum = 0; 
		while (i++<=3) {
			System.out.printf("%d+", i);
			sum += i;
		}// while 
		System.out.printf("\b=%d", sum);

	}// main

} // class







