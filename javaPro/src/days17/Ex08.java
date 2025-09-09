package days17;

/**
 * @author kenik  
 * @date 2025. 9. 9. 오후 3:33:49 
 * @subject   클래스 간의 형변환  - 상속관계 있어야지만 
 * @content   1) 업캐스팅
 *            2) 다운캐스팅
 */ 
public class Ex08 {

	public static void main(String[] args) {
		
		// 자동 업캐스팅
		Parent2 p = new Child2();		
		p.disp();
		
		// 강제 다운캐스팅
		// (변환하고자하는 클래스타입) 캐스트 연산자
		Child2 c = (Child2) p;

	} // main

} // class

class Parent2{
	
	public void disp() {
		System.out.println("> parent.disp()...");
	}
	
}

class Child2 extends Parent2{

	@Override
	public void disp() {
		System.out.println("> child.disp()...");
	}
	
}











