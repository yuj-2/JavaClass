package days22;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오후 2:10:07 
 * @subject   days21.Ex10_02.java
 * @content 
 */ 
public class Ex08_03 {

	public static void main(String[] args) {
		String s = "이름:홍길동, 나이:20살, 성별:여자";
		
		String name;
		int age;
		boolean gender;
		
		String regex = "이름:([가-힣]{2,}), 나이:(\\d{1,3})살, 성별:([가-힣]{2})";
		Pattern pattern = Pattern.compile(regex);		
		Matcher matcher = pattern.matcher(s);
		
		if ( matcher.find()) {
			name = matcher.group(1);
			System.out.println( name );
			age =  Integer.parseInt( matcher.group(2) );
			System.out.println( age );
			//
		}
		 

	} // main

} // class
