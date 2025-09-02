package days03;

/**
 * @author kenik  
 * @date 2025. 8. 20. 오후 3:08:59 
 * @subject   변수와 [상수]
 * @content 
 */ 
public class Ex07 {

	public static void main(String[] args) {
		// Math 클래스
		System.out.println( Math.PI );
		// 
		int r = 10;
		
		final double PI = 3.141592;
		
		double 원둘레 = 2 * PI * r;
		
		// Duplicate local variable 원둘레
		원둘레 = 2 * PI * r;
		
		
		원둘레 = 2 * PI * r;
		
		// PI = 3.15;
		
		원둘레 = 2 * PI * r;
		
		
		원둘레 = 2 * PI * r;
		
		원둘레 = 2 * PI * r;
		
		원둘레 = 2 * PI * r;
		
		/* [1]
		double 원둘레 = 2 * 3.141592 * r;
		
		// Duplicate local variable 원둘레
		원둘레 = 2 * 3.141592 * r;
		
		
		원둘레 = 2 * 3.141592 * r;
		
		
		원둘레 = 2 * 3.1415912 * r;
		
		
		원둘레 = 2 * 3.141592 * r;
		
		원둘레 = 2 * 3.141592 * r;
		
		원둘레 = 2 * 3.141592 * r;
		*/
		

	}//main

}//class








