package days30;

import java.util.stream.Stream;

/**
 * @author kenik  
 * @date 2025. 9. 26. 오전 11:02:31 
 * @subject   
 * @content 
 */ 
public class Ex05 {

	public static void main(String[] args) {
		// [ 빈 스트림 ]
		/*
		Stream<Object> s = Stream.empty();
		System.out.println( s.count() );
		*/
		
		// 두 스트림 연결 - concat()
		String [] s1 = { "1","2","3" };
		String [] s2 = { "a","b","c" };
		
		Stream<String> ss1 = Stream.of(s1);
		Stream<String> ss2 = Stream.of(s2);
		
		Stream<String> ss3 = Stream.concat(ss1, ss2);
		
		
		

	}

}

