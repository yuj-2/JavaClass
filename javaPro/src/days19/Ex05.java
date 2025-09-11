package days19;

/**
 * @author kenik  
 * @date 2025. 9. 11. 오후 12:29:26 
 * @subject   chapter 11 예외처리
 * @content 
 */ 
public class Ex05 {

	public static void main(String[] args) {
	 
		/*
		 * [예외처리(Exception Handling)]
		 * 1. 오류 ? 프로그램 실행 중에 오작동 또는 비정상 종료되는 원인
		 * 2. 오류 발생 시점에 따라... 
		 *   1) 컴파일 오류
		 *      int a
		 *   2) 실행 오류 == 런타임(Runtime) 오류  
		 *     int [] m  = null;
		       m[0] = 100;
		       System.out.println( m[0]);
		          (1) 에러(Error) :복 구할 수 없는 심각한 오류
		                            메모리 부족, 스택 오버프로워 등등
		              Error 부모클래스
		                 ㄴ Error 자식클래스....              
		          (2) 예외(Exception) : 에러보다 덜 심각한 비교적 수습될 수 있는 실행 오류
		              Exception 부모클래스
		                 ㄴ 자식 클래스
		     3) 논리적 오류( 가장 어려운 오류 ) 
		     		int i = Integer.MAX_VALUE;
					int j = i + 100;
					System.out.println( j ); // -2147483549           
		 * */
		
		/*
		 * 예외 가 발생하면  
		 * JVM  안에 "예외처리기"가 발생한 예외를 예외객체(NullPointerException)를 
		 * 생성해서 개발자에게 [예외를 처리]하도록 전달.....
		 * 
		 * [예외처리]
		 *  - 프로그램 실행 시 발생할 수 있는 예기치 못한 예외의 대비한 코드를 작성하는 것.
		 *                         Object
		 *                            ↑
		 *                       Throwable
		 *                            ↑
		 *        Exception                            Error
		 *           ↑
		 *  [RuntimeException]               IOException ....
		 *       ㄴ NullPointException
		 *       ㄴ ArithmeticException
		 *       등등    
		 *       
		 * [예외 처리하는 2가지 방법]
		 *   1.    try~ catch 문      예외직접처리
		 *   2.    throws문           예외떠넘기기                           
		 * */

		int [] m  = null;
	       m[0] = 100;
	} // main

} // class
