package days17;

/**
 * @author kenik  
 * @date 2025. 9. 8. 오후 5:32:28 
 * @subject   [변수의 초기화]
 * @content   1. 변수
 *            2. 변수 종류 3가지
 *            3. 변수 초기화 - 변수 선언 + 처음으로 값을 할당.
 *            4. 초기화 방법
 *              1) 명시적 초기화
 *              2) 생성자 초기화
 *              3) 
 */ 
public class Ex01 {

	public static void main(String[] args) {
 		
		System.out.println( Member.rate ); // 0.07
		
		// (초기화 순서 기억)
		// 1) 명시적 초기화 -> 2) 인스턴스 초기화 블럭 -> 3) 생성자 초기화
		//     1-2) 클래스 초기화 블럭    
		//      홍길동             익명
		Member m1 = new Member();
		// System.out.println( m1.name );	// 익명		
		Member m2 = new Member();		
		Member m3 = new Member();

		System.out.println(" end ");
	} // main

} // class

class Member{
	
	// 필드
	String name = "홍길동"; // 명시적 초기화
	int age = 20; // 명시적 초기화
	int count;
	int serialNumber;
	
	// 클래스 변수, 정적 변수, static 변수, 공유(shared) 변수
	static double rate = 0.04; // 명시적 초기화
	
	// 인스턴스 초기화 블럭
	// 생성자가 오버로딩되어 져 있을 때 
	//   중복되는 코딩이 있다면 초기화 블럭을 사용한다.
	{
		count++;
		serialNumber = count;
		System.out.println("> 인스턴스 초기화 블럭");
	}
	
	// 클래스 초기화 블럭
	// 일괄적으로 클래스 변수들을 초기화 하기 위한 목적... 
	static {
		rate = 0.07;
		System.out.println("> 클래스 초기화 블럭");
	}
	
	// 생성자
	Member(){
		//count++;
		//serialNumber = count;
		this.name = "익명";
		System.out.println("> Member 디폴트 생성자 호출됨.");
	}
	Member(String name){
		//count++;
		//serialNumber = count;
		this.name = name;
		System.out.println("> Member 1 생성자 호출됨.");
	}
	// 메서드
	// Getter,Setter
	
}








