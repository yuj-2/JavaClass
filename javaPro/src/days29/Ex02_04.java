package days29;

/**
 * @author kenik  
 * @date 2025. 9. 25. 오전 10:08:59 
 * @subject   [ 람다식의 타입을 함수형 인터페이스 타입으로 형변환 ]
 * @content 
 */ 
public class Ex02_04 {

	public static void main(String[] args) {
		
//		MyFunction f = ()-> {};
		
		MyFunction f = (MyFunction)(()-> {});
		
		f.run();
		
		System.out.println(" end ");
		

	} // main

} // class
