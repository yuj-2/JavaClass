package days21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kenik  
 * @date 2025. 9. 15. 오후 3:47:28 
 * @subject   
 * @content    Pattern
 *             Matcher
 *                ㄴ boolean matcher.matches()
 *                ㄴ matcher.find() 설명
 *                           찾는다
 *            예) source 문자열 속에서 전화번호만 추출...               
 */ 
public class Ex10_02 {

	public static void main(String[] args) {
		String source = "안녕하세요. 홍길동입니다."
				+ "폰번호:011-1234-5678, 집번호: 02-436-4948입니다.";		
		//String regex = "0\\d{1,2}-\\d{3,4}-\\d{4}";
		
		//              (그룹)-(그룹)-(그룹)
		String regex = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(source);
		
		while( matcher.find() ) {
			System.out.printf("%s\t%s\t%s\t%s\n"
					,  matcher.group()
					, matcher.group(1)
					, matcher.group(2)
					, matcher.group(3));
		} // while
		

	} // main

} // class








