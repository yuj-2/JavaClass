package days26;

/**
 * @author kenik  
 * @date 2025. 9. 22. 오전 11:16:54 
 * @subject   제네릭의 제한
 * @content 
 */ 
public class Ex03_04 {

	public static void main(String[] args) {
		// T 타입의 배열을 선언할 수 있더라. 
		// 제네릭 기능(객체별로 다른 타입으로 지정해서 동작하도록 만든 기능(기술) )
		// 때문에 static 필드는 선언할 수 없다.
		// static 메서드의 매개변수 타입도 T를 사용할 수 없다.
		 
	}

}

class Box2<T>{
	
	T [] itemArr;
	
	// Cannot make a static reference to the non-static type T
	//static T sitem;
	
//	static int method1(T t1) { 
//	}
	
}
