package days23;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author kenik  
 * @date 2025. 9. 17. 오전 9:32:09 
 * @subject   날짜 형식을 띈  String s 문자열 <- dtf.format() <- LocalDate 타입으로 변환.
 * @content                               -> dtf.parse() X  ->
 * @content                               -> LocalDate.parse(s, dtf) O  ->
 */ 
public class Ex02_02 {

	public static void main(String[] args) {
		
		String s = "2025년 02월 17일 (월)";		
		String pattern = "yyyy년 MM월 dd일 (E)";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);		
		// LocalDate d = (LocalDate) dtf.parse(s);
		LocalDate d = LocalDate.parse(s, dtf);		
		System.out.println( d );
		

	} // main

} // class







