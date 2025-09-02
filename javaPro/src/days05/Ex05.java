package days05;

/**
 * @author kenik  
 * @date 2025. 8. 22. 오후 12:41:40 
 * @subject   1~10+= 합 출력
 * @content   1) + 제거
 *            2) 짝수의 합 출력
 *               2+4+6+8+10=30
 *            3) 홀수의 합 출력
 *               1+3+5+7+9 =25   
 */ 
public class Ex05 {

	public static void main(String[] args) {

		int sum = 0; 
		for (int i = 1; i <= 10 ; i++) {	
			if( i%2==0 ) continue;
			System.out.printf("%d+", i); 
			sum += i;			 
		} // for
		System.out.printf("\b=%d\n", sum);		

	}

	/*
	public static void main(String[] args) {

		int sum = 0; 
		for (int i = 1; i <= 10 ; i+=2) {			 
				System.out.printf("%d+", i); 
				sum += i;			 
		} // for
		System.out.printf("\b=%d\n", sum);


	} // main
	 */

	/*
	public static void main(String[] args) {

		int sum = 0;
		//  i=1   ~  10 반복
		for (int i = 1; i <= 10 ; i++) {
			if( i % 2 == 1 ) {
				if (i==9) {  // 10까지 중에 가장 큰 홀수값
					System.out.printf("%d", i);
				} else {
					System.out.printf("%d+", i);
				} 
				sum += i;
			} // if
		} // for
		System.out.printf("\b=%d\n", sum);


	} // main
	 */

} // class






