package days08;

/**
 * @author kenik  
 * @date 2025. 8. 27. 오전 11:46:41 
 * @subject   
 * @content 
 */ 
public class Ex03_02 {

	public static void main(String[] args) { 
		// 1-2+3-4+5-6+7-8+9-10=-5 
		int i = 1, sum = 0;
		int ln = 10;
		// 스위치변수 선언
		boolean sw = false;
		while ( i<= ln ) {		
			/* [1]
			if ( sw ) { 
				System.out.printf("%d+", i);
				sum -= i;
				sw = false;
			} else {  // 홀수
				System.out.printf("%d-", i);
				sum += i;
				sw = true;
			}
			*/
			
			System.out.printf( sw ? "%d+" : "%d-", i); 
			sum += sw?i:-i;
			sw = !sw;
			i++;
		} // while
		System.out.printf("=%d\n", sum);

	} // main

} // class





