package days19;

/**
 * @author kenik  
 * @date 2025. 9. 11. 오전 9:44:37 
 * @subject   
 * @content 
 */ 
public class Ex02 {

	public static void main(String[] args) {
		
		/*
		 * [ 내부(inner) 클래스 ]
		 * 1. 중첩 클래스
		 * 2. 윈도우 애플리케이션에서 이벤트 처리할 목적으로 자주 사용된다.
		 *    ( AWT, Swing )
		 * 3. 사용 빈도는 거의 없다. 개념 정도만 익혀두자.  
		 * 4. 내부(inner)  클래스의 종류와 특징 - 선언 위치
		 *    1) 인스턴스 클래스  - 외부 클래스의 필드 위치에 선언
		 *    2) 정적(static) 클래스 - 외부 클래스의 필드 위치에 선언
		 *    3) 지역(local) 클래스 - 외부 클래스 메서드 안, 초기화 블럭 안 선언.
		 *    4) 무명 == 익명 클래스 
		 *       ㄴ 클래스의 선언 + 객체 생성     합쳐진 이름없는 클래스
		 *       ㄴ 일회용
		 * 
		 * */
		

	} // main

} // class



class Car{   // 외부 클래스  Car.class	
	// 필드 위치
	String name;
	// Engine engine;
	class Engine{  // 내부 클래스   Engine.class
		
	}
	
	
}

 
class Engine{ 
	
}
 

class Outer{ // 외부 클래스
	
	// 필드 선언 위치 
	int iv = 0;    // 인스턴스 변수
	static int ic = 0; // 클래스 변수, static변수, 정적 변수, 공유변수	
	// 1. 인스턴스 클래스
	class InstanceClass{
		// 주로 외부 클래스의 인스턴스 멤버들과 관련된 작업을 더 용이하기 위한 목적
	}
	
	// 2. 정적(static) 클래스
	static class StaticClass{
		// 주로 외부 클래스의 static 멤버들과 관련된 작업을 더 용이하기 위한 목적
	}
	
	
	// 인스턴스 초기화 블럭
	{
		// 3. 지역(local) 클래스 
		class LocalClass{
			
		}
	}
	
	// 메서드
	public void disp() {
		
		// 지역변수
		Engine engine;
		
		
		// 지역(local) 클래스
		class LocalClass2{
			// 지역 변수 처럼 
			// 해당 지역에서만 사용되는 클래스 
		}
		
	}
}











