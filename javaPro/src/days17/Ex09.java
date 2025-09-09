package days17;

/**
 * @author kenik  
 * @date 2025. 9. 9. 오후 4:07:56 
 * @subject  다운캐스팅 설명. 
 * @content  업캐스팅을 한 후에만 다운캐스팅이 가능하다.
 */ 
public class Ex09 {

	public static void main(String[] args) {
		
		A obj = new A();		
		  // java.lang.ClassCastException: class days17.A cannot be cast to class days17.B (days17.A and days17.B are in module javaPro of loader 'app')
		B obj2 = (B)obj;
		
		// 상속성
		// 다형성

	}

} // class


class A{}
class B extends A{}





