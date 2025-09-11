package days19;

import java.io.IOException;

/**
 * @author kenik  
 * @date 2025. 9. 11. 오후 2:48:03 
 * @subject    try~catch~finally 구문 설명
 * @content 
 */ 
public class Ex06 {

	public static void main(String[] args) {
		// try-catch-finally 블럭 실행 과정 실행
		
		System.out.println("1. DB - open()..");
		
		try {
			// CRUD
			System.out.println("2. select() 조회.");
			System.out.println("3. insert() 추가.");
			System.out.println("4. update() 수정." + (10/0));
			System.out.println("5. delete() 삭제.");
			
		} catch (ArithmeticException e) {
			System.out.println("6. ArithmeticException 예외 처리.");
		} catch( Exception e) {
			System.out.println("7. Exception 예외 처리.");
		} finally {
			// 예외 발생 유무에 상관없이 무조건 실행되는 블럭
			System.out.println("8. finally 블럭.");
			System.out.println("10. DB - close()"); 
		}
		
		
		System.out.println( " end ");
		

	}

}











