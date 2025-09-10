package days18;

/**
 * @author kenik  
 * @date 2025. 9. 10. 오후 5:11:11 
 * @subject   
 * @content 
 */ 
public class Ex12 {

	public static void main(String[] args) {
		// S회사
		// H회사
		// K회사
		
		
		Engine engine = new S_Engine() ; // new H_Engine();
		Car myCar = new Car(engine);
		myCar.speedUp(1000);
		// myCar.getEngine().speed;
		
		// 차의  speed 얼마인지 출력 코딩.... (문제제시)
		
	}

}
