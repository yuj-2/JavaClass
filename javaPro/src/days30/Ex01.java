package days30;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author kenik  
 * @date 2025. 9. 26. 오전 7:09:01 
 * @subject   Function 합성?과  Predicate 의 결합?
 * @content   1    1          boolean  1  조건
 *             andThen()          and(), or(), negate(), isEquals()
 *             compose()
 *             identity()           
 * 
 *           함수형 인터페이스        -> 람다식 표현
 *              ㄴ 1개의 추상 메서드     오버라이딩   타입 유추
 *              ㄴ 디폴트, static 메서드 정의 *** 
 */ 
public class Ex01 {
	
	public static void main(String[] args) {
		// [3]
		String s1 = "abc";
		String s2 = "abc";
		// System.out.println( s1.equals(s2) );
		
		Predicate<String> p2 = Predicate.isEqual(s1);
		System.out.println( p2.test(s2) );
		
		/*
		// [2] 조건 결합
		Predicate<Integer> p = (t) ->  t < 100; // 100보다 작냐? 조건식 
		Predicate<Integer> q = (t) ->  t < 200; // 200보다 작냐? 조건식 
		Predicate<Integer> r = (t) ->  t%2 ==0; // 짝수 조건식 
		Predicate<Integer> notP = p.negate(); // 부정 
		// 100<= t   < 200
		Predicate<Integer> all = notP.and(q); // 조건 결합 and() 디폴트메서드
		System.out.println( all.test(150)); // true
		System.out.println( all.test(250)); // false 
 		*/
		
		/* [1] 합성
		// f String -> 16진수 Integer(int) 변환해서 반환하는 람다식.
		Function<String, Integer> f = (t) -> Integer.parseInt(t, 16) ;
		// g Integer(int) -> 2진수 형식의 문자열로 변환해서 반환하는 람다식
		Function<Integer, String> g = (t) -> Integer.toBinaryString(t) ; 
		//                          f + 합성 + g
		// andThen() 합성:  문자열 FF-> 16진수 숫자로 변화(f) -> Integer -> 2진수 문자열 (g) 변환
		//                            f     g
		// Function<String, String> h = f.andThen(g);
		//System.out.println( h.apply("FF") );
		
		//                          순서 g -> f
		Function<Integer, Integer> h = f.compose(g);
		System.out.println( h.apply(2));
		*/
		
	} // main 

} // class







