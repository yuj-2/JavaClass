package days24;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author kenik  
 * @date 2025. 9. 18. 오전 10:04:43 
 * @subject   스택 구조 -> Stack 컬렉션 클래스
 * @content   큐   구조 -> Queue 인터페이스를 구현한 LinkedList 컬렉션 클래스
 *                     -> Priority[Queue] 컬렉션 클래스
 *                       ㄴ FIFO 구조 X
 *                       ㄴ 저장된 순서에 상관없이 우선 순위가 높은 것 부터 꺼내는 구조.
 *                       ㄴ null 저장할 수 없다. ( NullPointException 발생 )
 */ 
public class Ex02_04 {

	public static void main(String[] args) {
		Queue q = new PriorityQueue();
		
		q.offer(3);
		q.offer(5);
		q.offer(2);
		q.offer(4);
		q.offer(1);
		
		System.out.println( q );
		
		// 숫자인 경우에는 우선순위가 작은 숫자가 높다. 
		while ( !q.isEmpty() ) {
			System.out.println( q.poll() );
		}

	} // main

} // class
