package days18;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kenik  
 * @date 2025. 9. 10. 오후 12:25:51 
 * @subject   추상메서드 , 추상 클래스 설명
 * @content 
 */ 
public class Ex06 {

	public static void main(String[] args) {

		// new Player();  X 
		
		Player cdP  = new CDPlayer();
		cdP.play(10);
		
		List list = new ArrayList();
		
	}

}

// 추상 클래스 선언
abstract class Player{

	// 필드
	boolean pause; // 작동 중지
	int currentPos; // 현재 작동 중인 위치

	// 생성자
	public Player() {		
	}

	// 추상 메서드 선언
	abstract void play(int pos);
	abstract void stop();

}

//The type AudioPlayer must implement the inherited abstract method  Player.stop()
abstract  class AudioPlayer extends Player{

	@Override
	void stop() {
		System.out.println("> 추상 메서드를 오버라이딩 완료!!");
	}
	
}

class CDPlayer extends AudioPlayer{

	@Override
	void play(int pos) { 
		System.out.println("> 추상 메서드를 오버라이딩 완료!!");
	}
	
}











