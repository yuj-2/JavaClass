package days20;

/**
 * @author kenik  
 * @date 2025. 9. 12. 오전 11:31:46 
 * @subject   문자열 다루는 클래스
 * @content   1. String 클래스
 *                ㄴ 변경 불가능한( immutable ) 클래스이다. *** 
 *            2. StringBuiler 클래스 / StringBuffer 클래스
 *            3. StringTokenizer 클래스
 *            4. StringJoiner 클래스
 *            등등
 */ 
public class Ex04 {

	public static void main(String[] args) {
		/*
		 [힙]                   [스택]
         ["홍길동"]              [ 0x100 ]
         0x100                  name1 변수,지역변수,참조변수, [객체명] 
         "홍길동"주소
         
         
                                [ 0x100 ]
                               name2
       */
		String name1 = "홍길동";   // 자동 String 객체 생성
		String name2 = "홍길동";   // 클래스 복사
		// String name = new String("홍길동");		
		System.out.println( name1 == name2  ); // true
		
		String n1 = new String("AAA");
		String n2 = new String("AAA");
		
		System.out.println( n1 == n2 ); // false
		System.out.println( n1.equals(n2) ); // true

	}

}
