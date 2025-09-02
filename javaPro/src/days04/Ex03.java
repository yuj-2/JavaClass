package days04;

/**
 * @author kenik  
 * @date 2025. 8. 21. 오전 10:16:25 
 * @subject   p93 논리연산자
 * @content 
 *            1) 일반 논리 연산자
 *                 && 일반 논리 AND 연산자 == 논리곱
 *                 || 일반 논리 OR 연산자  == 논리합
 *                 !  부정(NOT) 연산자
 *                 
 *                 !  >  &&  >  ||  (순위 암기)
 *            2) 비트 논리 연산자
 */ 
public class Ex03 {

	public static void main(String[] args) {
		
		System.out.println( !true ); // false
		boolean b = false;
		System.out.println( !b );// true
		//                  ←←        
		System.out.println( !!b );// true
		// 주의 
		int i = 100;
		// The operator ! is undefined for the argument type(s) int
		//System.out.println( !i );
		
		System.out.println("=".repeat(50));	
		
		// →→→→→→→→→
		// 3 + 5 - 2
		
		// 3*2+4*2
		
		// p107 연산자 우선 순위 
		// && 일반 논리 AND 연산자 == 논리곱
		System.out.println( 4 > 2 &&  10 < 12  );
		System.out.println( 4 > 2 &&  10 > 12  );
		//                            Dead code
		System.out.println( 4 < 2 &&  10 < 12  );
		System.out.println( 4 < 2 &&  10 > 12  );
		
		// || 일반 논리 OR 연산자  == 논리합
		System.out.println( 4 > 2 ||  10 < 12  );
		System.out.println( 4 > 2 ||  10 > 12  );
		System.out.println( 4 < 2 ||  10 < 12  );
		System.out.println( 4 < 2 ||  10 > 12  );

	}

}
