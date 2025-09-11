package days19;

/**
 * @author kenik  
 * @date 2025. 9. 11. 오전 11:05:38 
 * @subject   4. 익명(Anonymous) 클래스
 * @content     ㄴ 이름이 없는 클래스
 *              ㄴ 일회용
 *              ㄴ 클래스 선언 + 객체 생성  일체형
 *              ㄴ 선언 형식
 *                1)
 *              부모클래스명 객체명 =  new  부모클래스명(){
 *                   // 필드, 메서드 선언할 수 없다.
 *                   // 부모의 메서드만을 오버라이딩할 수 있다. 
 *                }
 *                
 *                2)
 *              인터페이스명 객체명 =  new 인터페이스명(){
 *                   // 필드, 메서드 선언할 수 없다.
 *                   // 인터페이스의 메서드만 오버라이딩할 수 있다. 
 *                }
 */ 
 

public class Ex03 {
	
 

	public static void main(String[] args) {
		/* 
		
		Engine engine = new Engine(){
			@Override
			public void moreFuel(int fuel) {
				System.out.println("> 익명 클래스로 구현 1 ");
			}
			@Override
			public void lessFuel(int fuel) {
				System.out.println("> 익명 클래스로 구현 2 ");
			}
			@Override
			public void stop() {
				System.out.println("> 익명 클래스로 구현 3 ");
			}			                      
			                };
		Car myCar = new Car(engine); // 생성자 DI		
		// 10년 
		 
		myCar.setEngine( new Engine() {
			
			@Override
			public void stop() { 
			}
			
			@Override
			public void moreFuel(int fuel) { 
			}
			
			@Override
			public void lessFuel(int fuel) { 
			}
		} ); // Setter DI

        */
		System.out.println( " end " );
	} // main

} // class

/*
interface Engine{
	void moreFuel(int fuel) ;	
	void lessFuel(int fuel);	
	void stop() ;
}
*/
/*
class H_Engine implements Engine{
	int speed;

	@Override
	public void moreFuel(int fuel) {
		this.speed += fuel * 0.05;
	}

	@Override
	public void lessFuel(int fuel) {
		this.speed += fuel * 0.05;
	}

	@Override
	public void stop() {
		this.speed = 0;
	}
}
class S_Engine implements Engine{
	int speed;

	@Override
	public void moreFuel(int fuel) {
		this.speed += fuel * 0.12;
	}

	@Override
	public void lessFuel(int fuel) {
		this.speed += fuel * 0.12;
	}

	@Override
	public void stop() {
		this.speed = 0;
	}
}
*/

/*
class Car{
	// 필드
	String name;
	String gearType;
	int door;
	// DI( 의존성 주입 )
	private Engine engine = null;

	// 생성자
	Car(){		
	}

	public Car(Engine engine) {
		this.engine = engine;
	}

	// Getter, Setter	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	// 메서드 
	void speedUp( int fuel ) {
		this.engine.moreFuel(fuel);
	}
	void speedDown(int fule) {
		this.engine.lessFuel(fule);
	}
	void stop() {
		this.engine.stop();
	}
}

*/
