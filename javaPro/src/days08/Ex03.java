package days08;

/**
 * @author kenik  
 * @date 2025. 8. 27. 오전 11:46:41 
 * @subject   
 * @content 
 */ 
public class Ex03 {

	public static void main(String[] args) {
		// [정보처리기사 실기]
		// 1 ~ 10=55 합 출력 ( while문 )
		
		// 1-2+3-4+5-6+7-8+9-10=-5
		// i 홀수일 경우
		//    sum += i
		//    %d-
		// i 짝수일 경우
		//    sum -= i
		//    %d+
		int i = 1, sum = 0;
		int ln = 10;
		while ( i<= ln ) {			
			if ( i%2 == 0) { // 짝수
				System.out.printf("%d+", i);
				sum -= i;
			} else {  // 홀수
				System.out.printf("%d-", i);
				sum += i;
			}
			
			i++;
		} // while
		System.out.printf("=%d\n", sum);

	} // main

} // class





