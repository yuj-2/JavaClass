package days22;

import java.text.MessageFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오후 2:10:07 
 * @subject   days21.Ex10_02.java
 * @content 
 */ 
public class Ex08_04 {

	public static void main(String[] args) {
		String s = "이름:홍길동, 나이:20살, 성별:여자";
		
		String name;
		int age;
		boolean gender;
		 
		String pattern = "이름:{0}, 나이:{1}살, 성별:{2}";
		MessageFormat mf = new MessageFormat(pattern);
		
		try {
			Object [] objArr = mf.parse(s);
			System.out.println( Arrays.toString( objArr ));
			name = (String) objArr[0];
			age = Integer.parseInt( (String)objArr[1]  );
			// 
			
		} catch (ParseException e) { 
			e.printStackTrace();
		}
		
		

	} // main

} // class
