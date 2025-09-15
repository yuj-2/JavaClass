package days21;

/**
 * @author kenik  
 * @date 2025. 9. 15. 오후 4:08:07 
 * @subject   days20.Ex04_03.java 
 * @content 
 */ 
public class Ex10_03 {

	public static void main(String[] args) {
		String source = "안녕하세요. 홍길동입니다. 이름은 홍길동입니다. 별명도 홍길동입니다.";
		
		// 1. 홍길동을 찾아서 찾은 위치를 모두 출력
		String word = "홍길동";
		int index = -1;
		int fromIndex = 0;
		
		while ( ( index = source.indexOf(word, fromIndex) ) != -1  ) {
			System.out.println( index );
			fromIndex = index + word.length();
		}
		
		// 두 번째 홍길동을 찾아서 "XXX" 로 변경
		int secondIndex = 	19;	
		System.out.println( 
				source.substring(0, secondIndex)
				+"XXX" 
		        +source.substring(secondIndex+"홍길동".length())
		        );

	} // main

} // class
