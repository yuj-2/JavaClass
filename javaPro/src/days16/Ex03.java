package days16;

/**
 * @author kenik  
 * @date 2025. 9. 8. 오전 11:27:29 
 * @subject   p225, p245 
 * @content  [this 키워드]
 *   1. 정의 : 클래스 자기 자신의 주소값을 갖는 참조변수
 *   2. this 3가지 용도
 *      1) 멤버를 가릴킬 때의 this
 *      2) 생성자에서 또 다른 생성자를 호출할 때의 this
 *      3) 단독(홀로)으로 사용될 때의 this - [리턴값], [매개변수]
 */ 
public class Ex03 {

	public static void main(String[] args) {
		
		//Person p1 = new Person();
		Person p1 = new Person("홍길동", 20, true);
		p1.dispPerson();
		p1.changeAge(5).dispPerson();
		
		// p2.dispPerson(); 
		
		/*
		Person p1 = new Person("홍길동", 20, true);
		Person p2 = new Person("김길동", 30, true);
		*/
		/*
		 * 힙영역                                스택영역
		 *   p1.name
		 * ["홍길동"'][20][true][][][0x100번지]                 [0x100번지]
		 * 인스턴스                    this               p1 변수,지역변수,참조변수,객체
		 * 0x100번지
		 * 
		 * ["김길동"'][30][true][][][0x200번지]                 [0x200번지]
		 * 인스턴스                    this               p2 변수,지역변수,참조변수,객체
		 * 0x200번지
		 * 
		 * 메서드영역
		 * [dispPerson][Getter][Setter]
		 * 
		 * p1.name
		 * this.name
		 * */
		
		

	} // main

} // class








