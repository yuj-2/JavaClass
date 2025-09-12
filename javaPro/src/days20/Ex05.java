package days20;

/**
 * @author kenik  
 * @date 2025. 9. 12. 오후 4:20:21 
 * @subject   문자열을 다루는 클래스 : String 클래스
 * @content                         불변
 *             문자열 잘라내기, 삽입, 삭제, 추가 (문제점,불편) 
 *             StringBuilder 또는 StringBuffer 클래스 사용. 
 */ 
public class Ex05 {

	public static void main(String[] args) {
		// s 문자열에서     's' -> "에스" 수정
		String s = "public static void main(String[] args) {";
		String word = "main";
		// main s 삭제
		int index =  s.indexOf(word);
		System.out.println( s.substring(0, index) );
		index += word.length();
		System.out.println("안녕");
		System.out.println( s.substring(index) );
		// main 문자열 뒤에 "안녕" 문자열 삽입

	} // main

} // class









 