package days30;

import java.io.File;
import java.util.stream.Stream;

/**
 * @author kenik  
 * @date 2025. 9. 26. 오전 11:12:51 
 * @subject   [ map() ]
 * @content     ㄴ 스트림 변환
 *              ㄴ mapToObj()    i -> [ i ]   IntStream -> Stream<String> 변환
 *              ㄴ 스트림의 요소에 저장된 값 중에 원하는 요소만 뽑아내서 새로운 스트림 변환
 *              ㄴ            중 특정(다른) 형태의 스트림으로 변환할 때 사용하는 메서드 
 */ 
public class Ex07 {

	public static void main(String[] args) {
		Stream<File> sf = Stream.of(
							new File("Ex01"),
							new File("Ex01.bak"),
							new File("Ex02.java"),
							new File("Ex01.txt")
							);

		Stream<String> sn = sf
				             .map(File::getName)
				             .filter( s -> s.indexOf('.') != -1 )
				             // peek() 중간 연산 메서드 이기에 최종 연산 메서드가 호출되기 전에
				             //        지연된 연산 
				             // 스트림의 연산을 처리할 때 중간에서 확인하는 목적으로 사용...
				             .peek(s -> System.out.printf("> fileName=%s\n", s))
				             .map(s-> s.substring(s.indexOf('.')+1))
				             .map(String::toUpperCase);
		
		
		sn.forEach(System.out::println);

	}

}
