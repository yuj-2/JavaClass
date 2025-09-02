package days05;

/**
 * @author kenik  
 * @date 2025. 8. 22. 오후 4:13:18 
 * @subject   
 * @content 
 */ 
public class Ex08 {

	public static void main(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10+=55
		// 홀수의 합 출력 : ( continue문을 사용해서 )
		// 1+3+5+7+9+=25
		// i  sum    i<=10     i%2==0(짝수)
		// 1   1     1<=10 참    false
		// 2   1     2<=10 참    true
		//           2<=10 참
		
		// 1+
		int i=1, sum=0;
		
		while (i<=10) {
			if( i%2==0 ) {
				i++;
				continue;
			}
			System.out.printf("%d+",i);
			sum += i;
			i++;
			// i+=2;
		}
		
		System.out.printf("\b=%d", sum);
		

	} // main

} // class







