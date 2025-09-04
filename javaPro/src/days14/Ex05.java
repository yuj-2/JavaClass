package days14;

/**
 * @author kenik  
 * @date 2025. 9. 4. 오후 12:17:03 
 * @subject   
 * @content 
 */ 
public class Ex05 {

	public static void main(String[] args) {
		int [] m = null;
		// m[0] = 100;  java.lang.NullPointerException

		Car myCar = null;
		myCar = new Car();
		myCar.name = "k9";  // NullPointerException
		
		// 클래싀 필드를 초기화 하지 않으면 그 필드의 자료형의 기본값으로 설정된다.
		System.out.println( myCar.wheelCount );  // 0

	}







}
