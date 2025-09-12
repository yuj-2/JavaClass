package days20;

import days15.Point;
import days16.Person;

/**
 * @author kenik  
 * @date 2025. 9. 12. 오전 9:23:52 
 * @subject   
 * @content 
 */ 
public class Ex02 {

	public static void main(String[] args) {
		// System obj = new System(); X
		Value v1 = new Value(20);
		Value v2 = new Value(20);
		Value v3 = v2; // 클래스 복사
		// 1. hashCode()  객체 자신의 고유한 해시코드값
		System.out.println(  v1.hashCode()  );
		System.out.println(  v2.hashCode()  );
		System.out.println(  v3.hashCode()  );
		
		//    ==        값을 비교
		// 2. equals()  주소값을 비교  같은 객체의 주소를 비교한다 => 같은 인스턴스를 참조
		// v1, v2 객체 처럼 인스턴스는 서로 다르지만 age 가 같으면 같은 객체라고 처리하고 
		// 싶을 때가 있다 .... ==> equals() 메서드를 오버라이딩해서 재정의 합니다. 
		System.out.println(  v1.equals(v2)  ); // false  -> true
		System.out.println(  v2.equals(v3)  ); // true
		
		//Person p = new Person();
		//v1.equals( p );
		
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		System.out.println( p1.equals(p2) );  // false
		// days15.Point 클래스의 equals() 오버라이딩해서 x, y 좌표가 
		// 같으면 같다...
		
		// 3. Object.toString() : v1 객체의 정보를 문자열로 반환하는 메서드
		//                     패키지명.클래스명@16진수코드
		//                        fullName
		//                     days20.Value@5594a1b5
		System.out.println( v1.toString() );
		System.out.println( v1 );
		
		// Point 클래스의 toString() 오버라이딩   x,y 좌표를 출력하도록 재정의.
		System.out.println( p1.toString() ); // [x=10, y=20]
		System.out.println( p1 );
		
		// 4. getClass() : 객체의 클래스 정보를 Class 타입으로 반환하는 메서드		
		Class  classInfo = p1.getClass();
		String fullName =  classInfo.getName();
		System.out.println( fullName );  // days15.Point

	} // main

} // class

class Value extends Object{
	// 필드  
	int age;
	// 생성자 
	public Value() {}
	public Value(int age) {		
		this.age = age;
	}
	
	// 메서드  
	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof Value && obj != null ) {
			// 다운캐스팅
			Value v = (Value)obj;
			return  v.age == this.age;
		} 
		return false;
	}
	
}








