package days04;

/**
 * @author kenik  
 * @date 2025. 8. 21. 오후 3:30:44 
 * @subject   두 기억공간의 값을 바꾸기
 * @content   [20]     [10]
 */ 
public class Ex10 {

	public static void main(String[] args) {
		
		int x = 10, y = 20;
		System.out.printf("1. x=%d, y=%d\n", x, y);
		
		{
			int temp = x;
			x = y;
			y = temp;
		}
		
		System.out.printf("2. x=%d, y=%d\n", x, y);

	} // 

} // 









