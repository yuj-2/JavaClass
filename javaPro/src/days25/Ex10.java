package days25;

/**
 * @author kenik  
 * @date 2025. 9. 19. 오후 4:43:34 
 * @subject   Enum 열거형
 *              ㄴ  한정된 값을 갖는 자료형
 * @content   제네릭
 *            IO 
 *            스레드, 네트워크 X
 *            람다식와 스트림
 *            
 *          Enum 이 없었을 때는 아래와 같이 코딩...
 *          
 *          [ Enum 열거형 ]
 *            ㄴ  서로 관련된 상수들의 집합을 나타내는 특별한 클래스 타입.
 *            ㄴ  jdk 1.5 새로 추가.
 *            ㄴ 정의 
 *                enum 열거형이름 {  상수명,상수명...              }
 *            ㄴ 사용방법
 *               열거형이름.상수명   
 */ 
public class Ex10 {

	public static void main(String[] args) {
		
		System.out.println( Card.CLOVER );
		/*
		int myCard = Card.CLOVER;
		
		switch ( myCard) {
		case Card.CLOVER:			
			break;
		case Card.DIAMOND:
			break;
		case Card.SPACE:
			break;
		default:
			break;
		}
		*/

	} // main

} // class

enum Card {
	CLOVER, HEART, DIAMOND, SPADE 
}

/*
class Card{
	public static final int CLOVER = 0;
	public static final int HEART = 1;
	public static final int DIAMOND = 2;
	public static final int SPACE = 3;
}
*/


