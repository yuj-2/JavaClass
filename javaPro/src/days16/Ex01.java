package days16;

/**
 * @author kenik  
 * @date 2025. 9. 8. 오전 7:00:46 
 * @subject   
 * @content 
 */ 
public class Ex01 {

	public static void main(String[] args) {
		// 대소문자 상관없이
		// 순서 상관없이.
		
		String n = "keNik";   
		String m = "kKnie";  
		
		n = n.toUpperCase();
		m = m.toUpperCase();
		
		System.out.println( n ); 
		System.out.println( m ); 
		

	} // main

} // class



/* [복습]
 * 1. 접근 지정자 설명
 *   1) 클래스 앞
 *   2) 멤버(필드, 메서드, 생성자) 앞
 *   
 *   public 
 *   protected
 *   default
 *   private
 *   
 * 2. 생성자 설명 - 8번
 *   
 * 3. 클래스 복사(copy)와 클래스 복제(clone) 설명
 *    
 * 4. 클래스 배열 초기화를 Student 클래스를 사용해서 3명의
 *    학생 정보를 처리하는 코딩을 하세요 . 
 *    (클래스 배열 초기화)
 *    
 *    Student [] s = {
 *       new Student(),
 *       new Student(),
 *       new Student()
 *    };
 *    
 *      
 * 5. 자바의 변수 종류 및 설명
 *   1) 지역변수
 *   2) 인스턴스변수
 *   3) 클래스변수  
 *   
 * 6. 오버로딩(overloading) 설명
 * 
 * 7. 아래 두 문자열의 대소문자 구분 없이, 순서 상관 없이 같은 문자여부를 
 *    체크하는 코딩을 하세요. 
		String n = "keNik";   
		String m = "kKnie";      
 * */



