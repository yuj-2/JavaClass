package days17;

/**
 * @author kenik  
 * @date 2025. 9. 9. 오후 12:26:27 
 * @subject    super 키워드 설명
 * @content    생성자 호출되는 순서 파악.
// super 키워드
//  ㄴ 정의 ? 자식 클래스에서 부모클래스의 멤버를 참조하는 데 사용되는 참조변수
//  ㄴ 용도 ?    1) 부모의 멤버를 가리킬 때의 super
//             2) 생성자에서 또 다른 부모의 생성자를 호출 할 때의 super()
//             3) 단독으로 사용되는 super X
 */ 
public class Ex05 {

	public static void main(String[] args) {
		/*
		Parent p = new Parent();
		System.out.println( p.x );
		*/
		
		Child c = new Child();
		System.out.println( c.x );

	}

}

class Parent extends Object{
	// 필드
	int x = 10; // 명시적 초기화
	
	Parent(){
		System.out.println("> Parent 디폴트 생성자 호출됨.");
	}
	
	void dispParent() {
		
	}
	
}

class Child extends Parent{
	
	// 부모클래스로 부터 물려 받은 x 필드가 존재하는 데 똑같은 이름으로 x 선언( 가능 )
	// int x = 10; 부모로 상속된 필드
	int x = 20;
	
	Child(){
		// super();
		// 컴파일러가 자동으로 부모의 디폴트 생성자가 호출...
		System.out.println("> Child 디폴트 생성자 호출됨.");
	}
	
	// void dispParent() {}  -> 오버라이딩( overriding ) == 재정의 함수
	@Override
    void dispParent() {
		System.out.println("새로 구현했다.( 재정의 )"); 
	}
	
}




