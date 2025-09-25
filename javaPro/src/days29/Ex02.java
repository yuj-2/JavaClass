package days29;

/**
 * @author kenik  
 * @date 2025. 9. 25. 오전 9:24:10 
 * @subject   
 * @content 
 */ 
public class Ex02 {

	public static void main(String[] args) {
		/*
		 * [함수형 인터페이스( Functional Interface )]
		 * 
		 *  ㄴ 람다식 == 하나의 메서드를 람다연산자를 사용해서 식으로 나타낸 것
		 *  ㄴ 자바에서 하나의 메서드는 반드시 클래스 내에 선언된다.
		 *  ㄴ (a,b) -> a>b?a:b  람다식은 어떤 클래스에 선언되는가?
		 *                       답)  익명 클래스
		 *     클래스 선언 + 객체를 생성                    
		 *    new 부모클래스명(){
		 *        오버라이딩된 메서드만 구현.
		 *    }
		 *                       
		 *    new 인터페이스명{
		 *      오버라이딩된 메서드만 구현.
		 *    }     
		 *    
		 *  ㄴ  타입  변수명 = 람다식;
		 *                   함수형 인터페이스  메서드-> 식
		 *   예) 인터페이스 선언
		 *   1) MyFunction 인터페이스는 하나의 메서드만 선언된 인터페이스이다.
		 *   2) 람다식으로 다룰 수 있도록 했다.
		 *   3) 정리: 람다식을 다룰 수 있는 1개의 메서드 만을 가진 
		 *           인터페이스를 "함수형 인터페이스"라고 한다. 
		 *    @FunctionalInterface        
		 *   interface MyFunction {
		 *     // public abstract
		 *     int max(int a, int b);
		 *     // static, default 메서드를 선언 할 수 있다. 
		 *   } 
		 *   
		 *   int a = 10, b = 20;
		 *   int max ;
		 *   
		 *   업캐스팅 
		 *                  //MyFunction 인터페이스 -> 익명 객체
		 *   MyFunction mf = new MyFunction(){
		 *      int max(int a, int b){
		 *        return a>b? a: b;
		 *      }
		 *   };
		 *   
		 *   람다식으로 수정
		 *   MyFunction mf =  (  a,   b) -> a>b? a: b;
		 *   
		 *   max =  mf.max(a, b);
		 *   
		 *   syso( max );
		 *   
		 *   
		 *            
		 *                   
		 * */

	} // main

} // class






