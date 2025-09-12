package days20;

/**
 * @author kenik  
 * @date 2025. 9. 12. 오후 2:31:18 
 * @subject   
 * @content 
 */ 
public class Ex04_04 {

	public static void main(String[] args) {
		/*
		String s = "public static void main(String[] args) {";

		System.out.println( s.contains( "main") ); // boolean
		System.out.println( s.indexOf( "main") );  // 찾은 위치(index)   -1

		// join()
		String [] sArr = s.split("\\s");
		System.out.println( String.join("**", sArr) );
		 */

		String s = "pub한글1l23ic 홍길동jo4i5n {y김철수y}  [xx]";
		// s 문자열 속에서 한글이 아닌 문자는 제거 한 문자열 ?
		String t = "";
		
		t = s.replaceAll("[^가-힣ㅏ-ㅣㄱ-ㅎ]", "");
		/* [1]
		char [] sArr = s.toCharArray();
		for (int i = 0; i < sArr.length; i++) {
			char one = sArr[i];
			if( (one >= '가' && one <= '힣')
					|| (one >= 'ㄱ' && one <= 'ㅎ') 
					|| (one >= 'ㅏ' && one <= 'ㅣ'))   t += sArr[i];
		}
		*/
		System.out.println( t );
		
		

	} // main


} // class










