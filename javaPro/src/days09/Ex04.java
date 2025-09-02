package days09;

/**
 * @author kenik  
 * @date 2025. 8. 28. 오후 2:32:05 
 * @subject   매개변수를 가지고 메서드를 호출하는 방법
 * @content   Call By Name
 *            Call By Value
 *            Call By Reference
 */ 
public class Ex04 {

	public static void main(String[] args) {
		// drawLine(); Call By Name
		// 두 기억공간의 값을 바꾸는 코딩. -> 메서드 선언(호출)
		int x = 10, y = 20;
		
		System.out.printf("1. x=%d, y=%d\n", x, y);
		
		// swap
		/*
		{
			int temp = x;
			x = y;
			y = temp;
		}
		*/
		swap(x, y); // Call By Value
		
		System.out.printf("2. x=%d, y=%d\n", x, y);
		

	} // main

	//                       x=10  y=20
	private static void swap(int x, int y) {
		System.out.printf("swap 1. x=%d, y=%d\n", x, y);
		int temp = x;
		x = y;
		y = temp;
		System.out.printf("swap 2. x=%d, y=%d\n", x, y);
	}

} // class









