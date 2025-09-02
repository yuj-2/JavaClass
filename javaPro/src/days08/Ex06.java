package days08;

/**
 * @author kenik  
 * @date 2025. 8. 27. 오후 2:33:09 
 * @subject   
 * @content 
 */ 
public class Ex06 {

	public static void main(String[] args) {
		// [정보처리 기사 실기]
		// 피보나치 수열
		// 항의 갯수가 10개까지의 합
		// 1+1+2+3+5+... +??=???
		int firstTerm = 1;
		int secondTerm = 1;
		int nextTerm ;
		int sum = firstTerm + secondTerm;
		System.out.printf("1+1+");
		int termLength = 2;
		
		// for (int i = 2; i <= 9; i++) {
		//       m[i]= m[i-1]+m[i-2];
		// }
		// int [] m = [1][1][2][??][][][][][][]
		              
		while(termLength<10) {
			nextTerm = firstTerm + secondTerm;
			System.out.printf("%d+", nextTerm);
			sum += nextTerm;
			
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			termLength++;
		} // while
         System.out.printf("=%d", sum);

	}

}
