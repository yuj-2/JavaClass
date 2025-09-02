package days04;

/**
 * @author kenik  
 * @date 2025. 8. 21. 오전 10:16:25 
 * @subject   p93 논리연산자
 * @content 
 *            ~/! > &  > ^ > | > && > ||
 *            1) 일반 논리 연산자 
 *            2) 비트 논리 연산자
 *               틸드(tilde) 연산자     ~     각 비트를 반전시키는 연산자. 0->1, 1->0
 *               비트 논리 AND 연산자    &
 *               배타적 논리합(XOR)연산자 ^
 *               비트 논리 OR 연산자     |
 */ 
public class Ex03_02 {

	public static void main(String[] args) {
		
		// 10    0000 1010
		//  ^    0000 0011
		//       0000 1001  -> 9
		//       0000 1011  -> 11
		//       0000 0010  -> 2
		
		
		System.out.println( 10&3 );  // AND  2
		System.out.println( 10^3 );  // e[X]clusive OR  9 베타적인 OR 연산자
		System.out.println( 10|3 );  // OR  11
		
		
		// -11
		System.out.println( ~10 ); //    1111 0101
		//                               1111 0100
		//                               0000 1011
		//                                     -11
		 
	}

}
