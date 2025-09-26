package days30;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author kenik  
 * @date 2025. 9. 26. 오전 10:26:47 
 * @subject   다양한 데이터 소스로 부터 스트림 생성해서 중간연산/최종연산 처리 예제
 * @content 
 */ 
public class Ex04_02 {

	public static void main(String[] args) {
		/*
		 * Stream<Integer> 와  IntStream 차이점
		 * Stream<T>
		 * 
		 * Stream<Integer>  형태의 스트림은 형변환 작업을 하셔야 된다. 
		 * -> 비효율 X -> 기본형을 다루는 스트림은 IntStream, 
		 * LongStream, DoubleStream 이 제공된다. 
		 * 
		 * Integer <-> int  오토 박싱, 오토 언 박싱. 
		 * 
		 * */
		
		int [] iArr = {34, 64, 22, 54, 11, 9 , 89, 13, 22, 34, 100};
		
		// [3]
		IntStream
		  .of(iArr)
		  .filter( (v) -> v >= 50 )
//		  .sorted()
		  .forEach(System.out::println);
			 

		/* [1]
		// 첫 번째 방법 : Arrays.stream()
		// 두 번째 방법 : Stream.of()         Stream<int[]>  s1 =  Stream.of(iArr);
		
		IntStream s1 = Arrays.stream(iArr);
		// int -> Integer  스트림 변환
		Stream<Integer> s2 = s1.boxed();
		*/
		
		/*
		// [2] int[] -> List 변환
		List<Integer> list =
				Arrays.stream(iArr).boxed().collect( Collectors.toList() );
		*/
		
		
	} // main

} // class







