package days05;

/**
 * @author kenik  
 * @date 2025. 8. 22. 오후 3:06:27 
 * @subject   
 * @content 
 */ 
public class Ex06_02 {

	public static void main(String[] args) {
		// 1~10=55 합 출력 
		int i=1;
		int sum = 0;
		
		while (i<=10) {
			System.out.printf("%d+", i);
			sum += i;  //  sum = sum + i;
			i++;
		}// while
		
		System.out.printf("\b=%d", sum);

	}// main

} // class







