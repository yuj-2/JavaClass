package days19;

/**
 * @author kenik  
 * @date 2025. 9. 11. 오전 10:45:33 
 * @subject    외부클래스 > 내부 클래스 3 선언
 * @content    -> 완전히 다른 클래스에서 내부클래스의 멤버를 접근하는 방법
 */ 
public class Ex02_05 {
	
	public static void main(String[] args) {		
		Outer2 outer = new Outer2();
		Outer2.InstanceInner iiObj = outer.new InstanceInner();
		iiObj.a = 200;
		System.out.println( iiObj.a );
		
		// 2
		System.out.println( Outer2.StaticInner.c ); 
		
		Outer2.StaticInner siObj = new Outer2.StaticInner();
		siObj.b = 300;
	}

}

class Outer2{ // 외부 클래스 
	int y = 10;
	static int x = 100;
	
	class InstanceInner{  // 1. 인스턴스 클래스
		int a = 10;
	}
	static class StaticInner{ // 2. 정적 클래스
		int b = 20; // 인스턴스변수 b
		static int c = 30;
	}
	void method1() {
		class LocalInner{
			int d = 40;
		}
	}
	
}


