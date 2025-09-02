package days04;

import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 21. 오전 9:33:08 
 * @subject   Scanner  예제 
 * @content 
 */ 
public class Ex01_03 {

	public static void main(String[] args) {
		
//		Date now = new Date();

//		String input = "1fish        2  fish   red fish blue fish";
		String input = "1 ,        2  ,   red,blue    ,";
		// Ctrl + Shift + O
		Scanner s = new Scanner(input);
		// 구분자로 사용할 패턴은 정규표현식으로 표현..
		// \s  공백
		// *   갯수   0개 이상
		String pattern = "\\s*,\\s*";
		s.useDelimiter(pattern); // 구분자 설정 메서드 
		
		System.out.println(s.nextInt());
		
		System.out.println(s.nextInt());
		
		System.out.println(s.next());
		
		System.out.println(s.next());
		
		s.close();

	}

}
