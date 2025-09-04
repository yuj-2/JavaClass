package days14;

/**
 * @author kenik  
 * @date 2025. 9. 4. 오전 9:28:41 
 * @subject   p146 Part 2 객체 지향 프로그래밍
 * @content 
 */ 
public class Ex02 {

	public static void main(String[] args) {
		
		int [] m = null; // 변수, 지역변수, 참조변수, 배열명
		
		m = new int[3];
		//The local variable m may not have been initialized
		// java.lang.NullPointerException
		m[0] =100;
		
		m = null;
		
		System.out.println( m[0] );
		

	} // main

} // class







