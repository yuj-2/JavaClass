package days05;

/**
 * @author kenik  
 * @date 2025. 8. 22. 오전 11:46:47 
 * @subject   
 * @content 
 */ 
public class Ex03_02 {

	public static void main(String[] args) {
		/*
		for (int i = 1; i <= 10; i++) {			
			System.out.printf("%d. 정난영\n", i);
		}
		*/
		
		// 1+2+3+4+5+6+7+8+9+10+=55 합 출력
		int sum = 0;
		for (int i = 1; i <= 10; i++) {			
			System.out.printf("%d+", i); // 1+2+3+
			// sum = sum + i; // 6
			sum += i; // 1
		}
		System.out.printf("=%d", sum);

	}// main

}// class








