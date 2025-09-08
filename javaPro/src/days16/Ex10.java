package days16;

/**
 * @author kenik  
 * @date 2025. 9. 8. 오후 4:44:32 
 * @subject   
 * @content 
 */ 
public class Ex10 {

	public static void main(String[] args) {
		/*                 [변수의 초기화 설명]
		 * 1. 변수
		 * 2. 변수 종류
		 * 3. 변수의 초기화 - 변수를 선언하고 처음으로 값을 할당하는 것.
		 * 4. 지역변수는 반드시 초기화를 해야 사용할 수 있다. 
		 *    인스턴스변수, 클래스 변수는 초기화하지 않으면 각 자료형의 
		 *    기본값으로 초기화 되어져 있다. 
		 *    
		 * [ 5. 필드의 초기화 방법 ]     
		 *   1) 명시적 초기화
		 *   2) 생성자 초기화
		 *   3) 초기화 블럭 사용.
		 * */ 

		Member m1 = new Member();
		System.out.println( m1.name );
		System.out.println( m1.age );
		
	} // main

} // class


class Member{
	
	// 필드
	// 1) 인스턴스 변수
	String name = "익명"; // 명시적 초기화
	int age = 20;        // 명시적 초기화
	int count;
	int serialNumber;
	
	// 2) 클래스 변수, static변수, 정적 변수, 공유변수
	static double rate;
	
	// 생성자 초기화
	Member(){
		name = "홍길동";
		age = 10;
	}
	
	
}





