package days20;

/**
 * @author kenik  
 * @date 2025. 9. 12. 오후 4:20:21 
 * @subject   문자열을 다루는 클래스 : String 클래스
 * @content                         불변
 *             문자열 변경하는 작업을 할 때는 String 클래스 사용 X
 *             StringBuilder 클래스    - 스레드 안전하지 않다( 동기화 처리 X )
 *             또는
               StringBuffer 클래스 사용. - 스레드 안전( 동기화 처리 O )
 */ 
public class Ex05_02 {

	public static void main(String[] args) {
		// s 문자열에서     's' -> "에스" 수정
		String s = "public static void main(String[] args) {";
		String word = "main";
		
		//StringBuilder sb = new StringBuilder(s);
		StringBuffer sb = new StringBuffer(s);
		
		
		System.out.println( sb );
		System.out.println( sb.toString() );
		sb.append("뒤에 문자열 추가");
		System.out.println( sb.toString() );
		int start = sb.indexOf(word);
		int end = start + word.length();
		sb.delete(start, end);
		System.out.println( sb.toString() );
		sb.insert(start, "안녕");
		System.out.println( sb.toString() ); 
	    sb.reverse();
	    System.out.println( sb.toString() );
		/* [1]
		// main s 삭제
		int index =  s.indexOf(word);
		System.out.println( s.substring(0, index) );
		index += word.length();
		System.out.println("안녕");
		System.out.println( s.substring(index) );
		// main 문자열 뒤에 "안녕" 문자열 삽입 
		*/

	} // main

} // class









 