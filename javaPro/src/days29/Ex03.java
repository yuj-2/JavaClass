package days29;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kenik  
 * @date 2025. 9. 25. 오전 10:13:11 
 * @subject   [ java.util.function 패키지 ]
 * @content                  ㄴ 자주 사용되는 함수형 인터페이스 설명
 *             - j.u.function 패키지는 자주 사용되는 함인를 미리 정의해 
 *                놓은 패키지.
 *             - 개발자이 통일(표준) , 유지, 보수 용이
 *             - j.u.function  패키지의 함 인 종류
		 *       (1) Runnable   void run()   매개변수X, 리턴값X
		 *       (2) Supplier     T get()        매개변수X, 리턴값O
		 *       (3) Consumer T accept(T)    매개변수 1, 리턴값X
		 *       (4) Function    T apply(T)  매개변수 1, 리턴값O
		 *       (5) Predicate   T test(T)   매개변수 1, 리턴값(b)
		 *       
		 *     -  매개변수가 2개 인 함수형 인터페이스
		 *       앞에 함수형 인터페이스의 이름이 'Bi'로 시작한다. 
			     (1) BiConsumer
		 *       (2) BiPredicate
		 *       (3) BiFunction    
		 *       
		 *     -  매개변수가 2개 초과인 함수형 인터페이스 
		 *       ( 개발자 직접 구현 )
		 *       @FunctionInterface
		 *       interface TriFunction<T,U,S,R>{
		 *            R apply(T t, U u, S s);
		 *       }     
		 *      
		 *     - Function 함수형 인터페이스의 특징
		 *        UnaryOperator
		 *          T    (T t)   매개변수의 자료형 == 리턴자료형  
		 *       BiFunction  함수형 인터페이스의 특징
		 *         BinaryOperator
		 *          T    (T t, T s)  
 *               
 *                
 */ 
public class Ex03 {

	public static void main(String[] args) {
		//  id      name
		Map<String, String> map =  new HashMap<>();
		map.put("admin", "관리자");
		map.put("hong", "홍길동");
		map.put("se", "서영학");
		
		map.forEach( (id, name)-> System.out.println(id+": " + name) );

	} // main

} // class
