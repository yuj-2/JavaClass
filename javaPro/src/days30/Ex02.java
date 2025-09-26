package days30;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author kenik  
 * @date 2025. 9. 26. 오전 9:22:46 
 * @subject   [ 메서드 참조 ]
 * @content   람다식을 사용해서 함수형 인터페이스의 1개 메서드를 간결하게 표현.
 *            이 간결한 람다식을 [메서드 참조]을 사용해서 더욱더 간결하게 표현할 수 있다. 
 *            
 *            [메서드 참조 3가지 방식]
 *            1) static 메서드 참조     		- 클래스명::메서드명
 *            2) 인스턴스 메서드 참조     		- 클래스명::메서드명
 *            3) 특정 객체 인스턴스 메서드 참조 	- 특정객체명::메서드명
 */ 
public class Ex02 {

	public static void main(String[] args) {
		/* [1]
		Function<String, Integer> f = new Function<String, Integer>() { 
			@Override
			public Integer apply(String t) { 
				return Integer.parseInt(t);
			}
		};
		*/
		
		// [2] 람다식으로 표현
		// Function<String, Integer> f = (t) -> Integer.parseInt(t);
		
		// [3] 메서드 참조를 사용해서 더 간결..
		Function<String, Integer> f = Integer::parseInt;
		
		
		// BiFunction<String, String, Boolean> f2 = (t, u) ->  t.equals(u);
		BiFunction<String, String, Boolean> f2 = String::equals;
		
		// [ 생성자의 메서드 참조 ]
		// Supplier<Box> s =  () ->  new Box(); 
		Supplier<Box> s =  Box::new;
		
		// [ 배열의 메서드 참조 ]
		// Function<Integer, int[]> af = (t) ->  new int[t]; 
		Function<Integer, int[]> af = int[]::new;
		

	} // main

} // class

class Box{
	public Box() {}
	public Box(Integer i, String s) {}
}
