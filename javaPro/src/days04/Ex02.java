package days04;

/**
 * @author kenik  
 * @date 2025. 8. 21. 오전 10:05:32 
 * @subject   연산자 - p90 비교연산자
 * @content   같다, 다르다, 크다, 작다, 같거나 크다, 같거나 작다
 *            ==     != 
 *            비교연산자 처리 결과 : boolean( true/false ) 
 */ 
public class Ex02 {

	public static void main(String[] args) {
		int i = 10, j = 3;
		// boolean i, j= true;
		// 주의  == 2개 :  System.out.println( i = j ); 
		System.out.println( i == j ); // false
		// !=   =! System.out.println( i =! j );
		System.out.println( i != j ); // true
		
		System.out.println( i > j ); // true
		System.out.println( i < j ); // false
		
		System.out.println( i >= j ); // true
		System.out.println( i <= j ); // false
	}

}





