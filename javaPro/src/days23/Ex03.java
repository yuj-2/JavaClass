package days23;

import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 9. 17. 오전 9:47:53 
 * @subject   
 * @content 
 */ 
public class Ex03 {

	public static void main(String[] args) {
		
		// 어노테이션
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();		
		// scanner.close();

	} // main

	// 어노테이션 : 컴파일러에게 부모클래스로 부터 재정의한 메서드이다라는 정보 전달
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	} 

} // class





