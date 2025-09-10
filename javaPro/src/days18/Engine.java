package days18;

public interface Engine {
	
	// 상수 필드
	// int SPEED = 0;  // public static final
	
	// 추상 메서드
	public abstract void moreFuel(int fuel) ;	
	void lessFuel(int fuel);	
	void stop() ;

}
