package days21;

public class Child extends Parent{
	
	public void modifierAcessTest() {
		this.pub = 100; // 패키지 내부 , 외부 어디서든 접근 가능
		this.pro = 90;  // 패키지 내부 접근 가능 + 상속 접근 가능.
		this.def = 80;  // 패키지 내부 접근 가능
		
		// this.pri  X  Parent 클래스 내부에서만 접근 가능. 
		//              상속관계가 있어도 Child 클래스에서는 접근 가능 X.
	}

}
