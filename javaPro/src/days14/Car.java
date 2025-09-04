package days14;

// 신형 자동차를 설계도  p204
// 클래스 선언
public class Car {
	
	// 멤버
	// 속성=멤버변수=필드
	String name = null;  // 자동차이름
	int speed = 0;    // 속도
	int wheelCount = 0; // 바퀴수
	
	// 기능(일)=멤버함수=메서드
	public void dispCarInfo() {
		System.out.printf("> 차명:%s, 속도:%d \n", name, speed);
	}

}
