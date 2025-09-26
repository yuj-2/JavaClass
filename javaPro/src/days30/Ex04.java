package days30;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author kenik  
 * @date 2025. 9. 26. 오전 10:11:31 
 * @subject   [스트림의 연산]
 * @content    ㄴ 스트림이 제공하는 다양한 연산을 이용해서 
 *             복잡한 작업들을 간단히 처리 기능 == 함수 == 메서드
 *             ㄴ 연산(operation) ? 스트림에 정의된 메서드 중엣서
 *                데이터 소스를 다루는 메서드.
 *             ㄴ 2가지 연산 종류
 *                1) 중간 연산 - 스트림 O
 *                2) 최종 연산 - 스트림 X ( 스트림 안의 요소가 소모 )    
 */ 
public class Ex04 {

	public static void main(String[] args) {
		
		int [] m = { 3,5,2,4,1, 3,5,2 , 3};
		// Stream<Integer>
		IntStream s1 = Arrays.stream(m);
		//  중         중      중              최종 연산(요소 소모)
		//  지연된 연산
		s1.distinct().sorted().skip(2).limit(3).forEach(System.out::println);
		
		OptionalInt  oi  = s1.max();
		System.out.println( oi.getAsInt() );

	} // main

} // class




