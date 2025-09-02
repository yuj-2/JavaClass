package days05;

/**
 * @author kenik  
 * @date 2025. 8. 22. 오후 12:14:33 
 * @subject   
 * @content 
 */ 
public class Ex04 {

	public static void main(String[] args) {
		/*
		 *   i    i<=10   sum
		 *   1    true     1
		 *   2    true     3
		 *   3    true     6
		 *   4    true     10
		 *   5    true     15
		 *   6    true     15
		 *   7    true     22
		 *   8    true     30
		 *   9    true     39
		 *   10   true     49
		 *   11   false
		 *   
		 *   1+2+3+4+5+7+8+9+10+=49
		 * */
		
		// 1+2+3+4+5+=15
		int sum = 0;
		for (int i = 1; i <= 10 ; i++) {
			// if(i > 5) break;
			// if( i == 6 ) break;
			
			// if(i > 5) continue;
			if(i == 6 ) continue;
			System.out.printf("%d+", i);
			sum += i; // sum = sum + i;
		} // for
		System.out.printf("=%d", sum);
		

	} // main

} // class






