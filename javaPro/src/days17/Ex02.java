package days17;

/**
 * @author kenik  
 * @date 2025. 9. 9. 오전 9:36:25 
 * @subject   [클래스들 간의 2가지 관계]
 * @content   1. has-a 관계( 소속 관계 )
 *               예)  자동차 클래스        Car
 *                      ㄴ 엔진 클래스     Engine
 *               결합력이 강한 코딩 좋지 않다 
 *               1) DI
 *               2) 인터페이스 사용       
 *                      
 *            2. is-a 관계 ( 상속 관계 )
 */ 
public class Ex02 {

	public static void main(String[] args) {	
		
		Engine engine = new Engine();
		// 의존성 주입(DI)
		// 1) 생성자를 통한 DI
		// 2) Setter 통한 DI
		// Car myCar = new Car(engine);		
		Car myCar = new Car();
		myCar.setEngine(engine);
		myCar.speedUp(20);
		System.out.println( myCar.getEngine().speed);
		// 
		Engine 중고engine = new Engine();
		myCar.setEngine(중고engine);
		
		
		System.out.println();

	} // main

} // class





