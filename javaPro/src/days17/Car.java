package days17;

public class Car {
	
	// 필드
	String name;
	String gearType;
	int door;	
	// 결합력이 높은 코딩
	// private Engine engine = new Engine();  // has-a 관계
	
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
