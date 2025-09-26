package days30;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author kenik  
 * @date 2025. 9. 26. 오전 11:33:44 
 * @subject   [ flatmap() ]
 * @content     ㄴ flat : 평평한, 평탄한
 *              ㄴ 스트림의 요소가 배열 또는 스트림인 경우...
 *                 Stream<T[]>     ->  flatmap()  -> Steram<T>
 *                 Stream<Stream>  ->  flatmap()  -> Steram<T>
 */ 
public class Ex09 {

	public static void main(String[] args) {
		String [] lineArr = {
				"Belive or not It is true", // Stream<String> <- String []  String.split("공백") 
				"Do or do not There is no try"
		};
		
		// String [] -> Stream<String>
		Stream<String> s = Arrays.stream(lineArr);
		// s.forEach(System.out::println);
		
		// String -> String [] -> Stream<String>
		//      split()      Stream.of()
		// Stream<Stream<String>> s2 = s.map( e -> Stream.of( e.split(" +") ) );
		
		// flatMap()  -> Stream<String>
		Stream<String> s3 =s.flatMap(e -> Stream.of( e.split(" +") ) );
		s3.forEach(System.out::println);
		
	} // main

} // class







