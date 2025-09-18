package days24;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author kenik  
 * @date 2025. 9. 18. 오전 9:14:37 
 * @subject   
 * @content 
 */ 
public class Ex02 {

	public static void main(String[] args) {
		/* (암기)
		 * [큐(Queue) 구조]     [스택(Stack)구조]
		 *   ㄴ FIFO 구조        LIFO 구조
		 *   ㄴ offer()         push()
		 *      poll()          pop()
		 *                      Stack 컬렉션 클래스
		 *     Queue 인터페이스                 
		 *      
		 * */
		
		Queue q = new LinkedList(); // FIFO 구조
		q.offer("이나영");
		q.offer("김수진");
		q.offer("장소예");
		System.out.println( q.offer("이지혜") ); // true
		
		while( !q.isEmpty() ) {			
			String name = (String) q.poll();
			System.out.println( name );
		}
		
		
		

	} // main

} // class
