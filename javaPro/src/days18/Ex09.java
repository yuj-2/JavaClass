package days18;

import java.util.ArrayList;

/**
 * @author kenik  
 * @date 2025. 9. 10. 오후 2:46:20 
 * @subject   p341 Chapter 08  인터페이스
 * @content   > 클래스 수업 관련 챕터 확인문제 모두 풀어보기 < 
 */ 
public class Ex09 {

	public static void main(String[] args) {
		/*
		 * [ 인터페이스( interface ) ]
		 * 1. 자바 자료형 
		 *    기본형
		 *    참조형 - 배열, 클래스, 인터페이스 
		 * 2. 인터페이스의 구성요소
		 *    1) 상수 필드
		 *    2) 추상 메서드
		 *    
		 *    
		 *    3) default 메서드   JDK 1.8 추가된 문법
		 *    4) static 메서드    JDK 1.8 추가된 문법
		 *    5) private 메서드   
		 *    
		 *     3:05 
		 * 3. 일종의 추상 클래스이다. 
		 * 4. 인터페이스는 그 자체로 사용되지는 않는다. 
		 *   -> 인터페이스를 구현한 다른 클래스를 선언하는 목적으로 사용된다. 
		 * 5. 인터페이스를 선언 형식 == 클래스 선언 거의 동일 
		 *    [접근지정자] interface 인터페이스명{  // 대문자로 시작
		 *    }
		 * 6. 인터페이스 끼리도 상속이 가능하다 - extends 키워드를 사용.
		 * 7. 장점
		 *   1) 개발 시간을 단축.
		 *   2) 표준화 가능
		 *   3) 서로 관련 없는 클래스들에게 관계를 맺어 줄 수 있다. 
		 *   4) 독립적인 프로그래밍이 가능. ( 추후  Car/Engine has-a)    
		 *    
		 * */
		
		 Tank t1 = new Tank();
		 DropShip s1 = new DropShip();
		 Marine m1 = new Marine();
		 SCV v1 = new SCV();
		 
		 t1.attack(s1);
		 
		 v1.repair(s1);
		 
		 // X   v1.repair(m1);

	} // main

} //class


// (군사)부대, 한 사람, 단일체
class Unit{
	
	// 유닛의 위치 - 필드
	int x;
	int y;
	
	// 유닛의 체력 - 필드
	int currentHP;
	
}

// 하늘 유닛
// 땅 유닛
// 바다 유닛  X

// 인터페이스 선언 - 형용사 : 움직일 수 있는, 이동가능한
interface Movable{
	// 상수 필드
	// 추상메서드 - [ public abstract ] 생략 가능
	void move(int x, int y);
	
}

interface Attackable{
	void attack(Unit unit);
}

interface Defendable{
	void defend();
}

// 인터페이스 끼리 상속 가능 - extends 키워드
// 인터페이스는 다중 상속이 가능하다. 
interface Fightable extends Movable, Attackable, Defendable{
	
}

class GroundUnit extends Unit { 
}

class AirUnit extends Unit{  
}


class Tank extends GroundUnit implements Fightable, Repairable{
	@Override
	public void move(int x, int y) { }
	@Override
	public void attack(Unit unit) { }
	@Override
	public void defend() { }
	// 
}

class DropShip extends AirUnit implements Fightable, Repairable{
	@Override
	public void move(int x, int y) { }
	@Override
	public void attack(Unit unit) { }
	@Override
	public void defend() { }
	// load(), unload() 기능 ...
}

interface Repairable{
	// 상수 필드 X
	// 추상 메서드 X
}

// 자원 채취, 건물 건축, 유닛 수리
class SCV extends GroundUnit implements Repairable{
	// 1) 자원 채취 메서드 
	// 2) 건물  메서드
	// 3) 유닛 수리
	void repair( Repairable  target ) { // 인터페이스 사용한 매개변수 다형성
		if ( target instanceof Unit ) {
			// 탱크, 수송선, SCV
			// 다운캐스팅~
			Unit u = (Unit)target;
			// 수리 코딩.
		}
	}
}

class Marine extends Unit implements Fightable{
	@Override
	public void move(int x, int y) { }
	@Override
	public void attack(Unit unit) { }
	@Override
	public void defend() { }	
}










