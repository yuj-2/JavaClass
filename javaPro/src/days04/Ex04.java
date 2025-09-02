package days04;

/**
 * @author kenik  
 * @date 2025. 8. 21. 오전 11:12:02 
 * @subject   
 * @content 
 */ 
public class Ex04 {

	public static void main(String[] args) {
		// [ 0][ 0][0][0][0][0][1][0] >> 2
		//  
		
		System.out.println( 10 << 2 ); // 40
		System.out.println( 10 >> 2 ); // 2
		System.out.println( 10 >>> 2 );// 2
		
		// 
		int i = 10;
		// 1) i=i+1;
		// 2) i++;
		// 3) ++i;
		// 4) i += 1;   복합대입연산자. 
		
		i = i - 5;
		i -= 5;
		

	}//main

}//class
