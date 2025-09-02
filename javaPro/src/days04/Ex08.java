package days04;

/**
 * @author kenik  
 * @date 2025. 8. 21. 오후 2:24:38 
 * @subject   자바 연산자 
 * @content   [자바 제어문] p111
 */ 
public class Ex08 {

	public static void main(String[] args) {
		// 연산자를 사용해서 수식 : 연산식, 조건식
		// 1) x는 5보다 크다    :  x > 5
		
		int x = 1;
		//System.out.println( x > 5 );
		
		// 2) x는 10보다 같거나 크고, 20보다 같거나 작다.
		//       10<= x <= 20
		// The operator <= is undefined for the argument type(s) boolean, int
		//                 →→→→→→→→→→→→→→→→
		// System.out.println( 10 <= x <= 20 );
		// System.out.println( 10 <= x && x <= 20 );
		
		//The operator <= is undefined for the argument type(s) int, boolean
		//System.out.println( x <= true );
		
		// 3) x는 2의 배수이다.    x % 2 ==  0
		// 4) x는 2의 배수 또는 3의 배수이다. x%2==0 ||  x%3==0
		// 5) x는 2의 배수 또는 3의 배수이지만 6의 배수는 아니다.
		//  &&  > ||
		//   x%2==0 ||  x%3==0     &&     x%6!=0
		//   (x%2==0 ||  x%3==0)     &&     x%6!=0	
		// 6) 문자 c 는 숫자문자이다(  '0'~'9' )
		char c = '1';
		//   c == '0' || c == '1' || c == '2' || c == '3'..  || c == '9'
		//   '0'<= c && c <='9'
		
		// 7) 문자 c가 대문자이다.
		c = 'X';
		//  'A'<= c && c <='Z' 
		
		// 8) 문자 c가 알파벳이다. 
		// ('A'<= c && c <='Z')   || ( 'a'<= c && c <='z' )
		//   대문자 체크            또는      소문자체크
		
		
		

	}//main

}//class
