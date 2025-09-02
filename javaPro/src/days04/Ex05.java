package days04;

/**
 * @author kenik  
 * @date 2025. 8. 21. 오전 11:31:43 
 * @subject   p105 삼항(조건) 연산자 
 * @content 
 */ 
public class Ex05 {

	public static void main(String[] args) {
		int x = 30, y;
		// Type mismatch: cannot convert from boolean to int
		// y = x > 5 ? 100 + x : 200 - x;
		y = ( x > 5 ? ( x < 10 ? 1 : 2 ) : 200 );
		
		System.out.println(y);
	} // main

} // class







