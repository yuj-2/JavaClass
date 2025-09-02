package days02;

/**
 * @author kenik  
 * @date 2025. 8. 19. 오후 2:05:36 
 * @subject p50 논리타입  
 * @content 
 */ 
public class Ex06 {

	public static void main(String[] args) {
		// 남자(true),여자(false)  성별을 나타내는 변수 선언
		boolean gender = true;
		System.out.println( gender );
		
		gender = false;
		System.out.println( gender );
		
		//Type mismatch: cannot convert from int to boolean
		//gender = 1;
		
	}

}
