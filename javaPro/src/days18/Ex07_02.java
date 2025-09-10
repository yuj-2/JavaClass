package days18;

/**
 * @author kenik  
 * @date 2025. 9. 10. 오후 2:02:40 
 * @subject   클래스 설계할 때
 * @content     추상화 작업 언제/ 어떻게 하는지 이해 예제...
 *                ㄴ  공통 부분을 따로 빼는 것.
 *                
 *                ㄴ  유닛 - 마린, 탱크, 수송선
 *                    추상클래스(추상화) - 구조 쉽고, 유지보수 용이.
 */ 
public class Ex07_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

} // class

/*
abstract class Unit{
	int x, y; // 현재 위치	
	abstract void move(int x, int y) ;
	abstract void stop() ;
	abstract void attack();
}

//해병대원
class Marine extends Unit{

	void stimPack() {
		// 이동 속도, 싸움 강화 등등
	}

	@Override
	void move(int x, int y) {  
	}

	@Override
	void stop() { 
	}

	@Override
	void attack() {
		 
	}

}

//탱크
class Tank extends Unit{

	// 공격 모드 변환 메서드
	void changeMode() {

	}

	@Override
	void move(int x, int y) { 
	}

	@Override
	void stop() { 
	}

	@Override
	void attack() { 
	}

} 

//수송선
class DropShip extends Unit{

	// 짐 싣고
	void load() {

	}
	// 짐 내리기
	void unload() {

	}
	
	@Override
	void move(int x, int y) { 
	}
	
	@Override
	void stop() { 
	}
	
	@Override
	void attack() { 
	}

}
*/
