package days08;

/**
 * @author kenik  
 * @date 2025. 8. 27. 오후 14:00:00
 * @subject   
 * @content 
 */ 
public class Ex05 {

	public static void main(String[] args) {
		// [수열]
		// 항(term)
		// 1+2+3+4+5+6+7+8+9+10=55
		
		// 1+2+4+7+11+16+22+29+...+???=???
		//  1 2 3 4  5  6  7
		int sum = 0;
		int term = 1;
		int inc = 1;
		
		while (term <= 100) {
			sum += term; // 1
			System.out.printf("%d+", term);
			term += inc++;
		}
		System.out.printf("=%d", sum);
		

	} // main

} // class








