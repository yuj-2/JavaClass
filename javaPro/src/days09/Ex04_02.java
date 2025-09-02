package days09;

/**
 * @author kenik  
 * @date 2025. 8. 28. 오후 2:32:05 
 * @subject   매개변수를 가지고 메서드를 호출하는 방법
 * @content    
 *            Call By Reference
 */ 
public class Ex04_02 {

	public static void main(String[] args) { 
		// int x = 10, y = 20;
		// 배열 => 참조타입( Reference Type )
		int [] m = { 10, 20 };		
		System.out.printf("1. x=%d, y=%d\n", m[0], m[1]);		 
		swap( m ); // Call By Reference		
		System.out.printf("2. x=%d, y=%d\n", m[0], m[1]);
		

	} // main
 
	private static void swap(int [] m) {
		System.out.printf("swap 1. x=%d, y=%d\n", m[0], m[1]);
		int temp = m[0];
		m[0] = m[1];
		m[1] = temp;
		System.out.printf("swap 2. x=%d, y=%d\n", m[0], m[1]);
	}

} // class









