package days21;

import days17.Employee;
import days17.Regular;

/**
 * @author kenik  
 * @date 2025. 9. 15. 오전 11:31:48 
 * @subject   Chapter 12.6 래퍼(Wrapper) 클래스
 * @content             ㄴ Integer
 *              기본형을 사용하기 쉽도록 여러 기능을 구현한 클래스를 
 *              래퍼클래스라고 한다. 
 *                     
 *              박싱(Boxing)과 언박싱(UnBoxing) 설명
 */ 
public class Ex05 {

	public static void main(String[] args) {
		
		// 업캐스팅
		Employee emp = new Regular();		
		disp(emp); 
		 
		// int의 표현값 중에 가장 큰값을 출력
//		System.out.println( Integer.MAX_VALUE );
//		System.out.println( Integer.MIN_VALUE );		
		
		/*
		// String -> int
		String s = "100";
		int i = Integer.parseInt(s);
		System.out.println( i );
		*/
		int i = 100;
		disp(i);
		// 기본형 int i를 래퍼클래스 Integer에 참조시켜도 된다.
		// 기본형 -> 래퍼클래스 변환 자동  ( 오토 박싱 )
		// Integer <- int
		Integer j = i;
		System.out.println( j.intValue() );
		
		
		// 오토 언 박싱. ( 래퍼클래스 객체 -> 기본형 변환 )
		int l = j;
		

	}

	// 매개변수 Object 선언 : 모든 타입의 매개변수를 사용할 수 있다. 
	// int i -> Integer 오토박싱 -> Object obj  업캐스팅
	private static void disp(Object obj) {  // 매개변수 다형성 ( 업캐스팅 )
		 System.out.println( obj.toString() );
	}

}
