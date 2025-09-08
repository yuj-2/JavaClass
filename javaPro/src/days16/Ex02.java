package days16;

/**
 * @author kenik  
 * @date 2025. 9. 8. 오전 10:43:09 
 * @subject   [ private 접근지정자로 필드를 선언한 후에 접근하는 방법 ] 
 * @content     ㄴ Getter, Setter
 *            Person 클래스 선언 
 */ 
public class Ex02 {

	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동", -20, true);
		// p1 객체의 이름,나이,성별 설정.
		//p1.name = "홍길동";
		//p1.age = -20;
		
		System.out.println( p1.name );
		
		// The field Person.age [is not visible]
		// System.out.println( p1.age );
		
		p1.setAge(-30);
		
		System.out.println( p1.getAge() );
		
		p1.dispPerson();
		
		
		

	} // main

} // class






