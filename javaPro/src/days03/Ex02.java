package days03;

/**
 * @author kenik  
 * @date 2025. 8. 20. 오전 11:26:46 
 * @subject   p68 변수의 범위
 * @content 
 */ 
public class Ex02 {

	public static void main(String[] args) {
		
		int x = 100;

		{
			int n = 10;
			System.out.printf("1. n=%d\n", n);
			System.out.printf("2. x=%d\n", x);
		}
		
		{
			int m = 20;
		}

		// The local variable n may not have been initialized
		//System.out.printf("1. n=%d\n", n);


	}//main

}//class




