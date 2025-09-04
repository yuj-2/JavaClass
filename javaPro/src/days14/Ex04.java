package days14;

/**
 * @author kenik  
 * @date 2025. 9. 4. 오전 11:37:18 
 * @subject   
 * @content 
 */ 
public class Ex04 {

	public static void main(String[] args) {
		
		// m  변수, 지역변수, 참조변수, 배열명
		int [] m =  new int[5];
		m[0] = 90;
		System.out.println( m[0] );
		
		// 변수, 지역변수, 참조변수, 객체
		// 객체 : Car 클래스로 선언된 참조 변수 
		Car myCar = new Car();		
		
		// 클래스 : 객체 설계도 ( 메소드 영역 )
		// 객체   : 클래스로 선언된 참조변수 (스택 영역)
		// 인스턴스: new 연산자에 의해 실제 객체가 생성된 것. ( 힙 영역 )
		// 인스턴스화:    new Car()
		
		// myCar = null;
		
		// myCar의 이름 설정
		// 객체명.필드명 
		//Car.name = "k9";
		
		// myCar라는 객체의 필드값을 설정.
		myCar.name = "k9";
		myCar.speed = 100;
		myCar.wheelCount = 4;
		
		System.out.println( myCar.name );
		System.out.println( myCar.speed );
		System.out.println( myCar.wheelCount );
		
		// myCar 라는 객체의 정보를 출력하는 기능 -> 메서드 구현
		// 객체명.메서드명();
		myCar.dispCarInfo();
		

	} // main

} // class
