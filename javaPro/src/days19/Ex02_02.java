package days19;

/**
 * @author kenik  
 * @date 2025. 9. 11. 오전 10:18:37 
 * @subject   
 * @content 
 */ 
public class Ex02_02 {  // 외부 클래스 사용
	
	// 1. 인스턴스 클래스
	class InstanceClass{
		int iv = 100;  // 인스턴스 변수 선언 O
		// static int ic ; // 클래스 변수 선언 X
		final static int COUNT = 10; // 클래스 변수 +  상수화  선언 O
	}
	
	// 2. 정적 클래스
	static class StaticInner{
		static int ic = 100; // 클래스 변수 선언 O
		int iv = 200;         // 인스턴스 변수 선언 O
		final static int COUNT = 10;// 클래스 변수 +  상수화  선언 O
	}

	// 3. 지역클래스
	void test() {
		
		class LocalInner{
			int iv = 10;   // 인스턴스 변수 선언 O
			// static int ic = 100;
			final static int COUNT = 10;
		}
	}
	
	public static void main(String[] args) {
		
		// 각각의 내부 클래스의 static 변수 사용
		// InstanceClass.COUNT
		// StaticInner.COUNT
		// StaticInner.ic
		 
	}

}
