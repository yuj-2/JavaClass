package days19;

/**
 * @author kenik  
 * @date 2025. 9. 11. 오전 10:25:11 
 * @subject   내부 클래스 선언한 후에 사용하는 방법
 * @content   > 외부 클래스의 멤버에서 내부 클래스 접근하는 방법
 */ 
public class Ex02_03 { // 외부 클래스 사용
	
	class InstanceInner{}      // 1.
	static class StaticInner{} // 2.
	
	// 외부의 인스턴스 멤버 간에 서로 직접 접근 가능하다. 
	InstanceInner iiObj = new InstanceInner();
	
	static StaticInner siObj = new StaticInner();
	
	void method1() {
		
		class LocalInner{}     // 3. 
		
		LocalInner liObj = new LocalInner();
		
		//메서드 안에서도 인스턴스 클래스 , 정적 클래스 객체를 사용할 수 있다. 		
		InstanceInner iiObj2 = new InstanceInner();
		StaticInner siObj2 = new StaticInner();
	}
	
	static void method2() {

		// 1. LocalInner  지역클래스는 그 해당 지역(블럭, 메서드)을 벗어나면 사용 X
		
		// 2. static 메서드 안에서 인스턴스 클래스를 사용 X
		// InstanceInner iiObj = new InstanceInner();  X		
		// 2-2. 인스턴스 클래스를 static 메서드에서 사용하려면 
		Ex02_03 outer = new Ex02_03();
		InstanceInner iiObj = outer.new InstanceInner();
		
		// 3 static메서드 안에서 정적 클래스 
		StaticInner siObj = new StaticInner();
	}

	public static void main(String[] args) {
		

	} // main

} // class
