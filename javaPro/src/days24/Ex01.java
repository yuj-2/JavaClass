package days24;

import java.util.Stack;

/**
 * @author kenik  
 * @date 2025. 9. 18. 오전 7:09:20 
 * @subject   C
 * @content     ㄴ L
 *                  ㄴ ArrayList 컬렉션 클래스  : 순차적으로 추가/삭제 빠르다.
 *                  ㄴ Vector 컬렉션 클래스
 *                  ㄴ LinkedList 컬렉션 클래스 : 중간에 삽입,삭제 빠르다.
 */ 
public class Ex01 {

	public static void main(String[] args) {
		/* 
		 * [스택(Stack)과 큐(Queue) 구조]
		 * 1. 스택 구조
		 *    ㄴ LIFO 자료구조 ***
		 *    ㄴ  push()
		 *        pop()
		 *       
		 *       peek(), isEmpty(), search() 
		 * 2. Vector 클래스의 자식클래스
		 * */ 
		
		Stack s = new Stack();
		s.push("이나영");
		s.push("김수진");
		s.push("장소예");
		s.push("이지혜");
		
		/*
		System.out.println( s.size() ); // 4
		// String name =  (String) s.pop(); // 다운캐스팅
		String name =  (String) s.peek(); // 다운캐스팅
		System.out.println( name );
		System.out.println( s.size() ); // 4
		*/
		
		// 모든 스택에 있는 요소를 얻어와서 출력.
		while ( !s.isEmpty() ) {
			String name =  (String) s.pop();
			System.out.println( name );
		}
		 
		

	} // main

} // class
