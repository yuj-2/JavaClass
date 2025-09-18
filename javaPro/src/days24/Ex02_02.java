package days24;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author kenik  
 * @date 2025. 9. 18. 오전 9:25:32 
 * @subject   
 * @content 
 */ 
public class Ex02_02 {

	public static void main(String[] args) {
		/*
		  [ Queue 인터페이스 <-(상속)- D+e+que 인터페이스		 ? ]
           == Double Enabled Queue
           == 양쪽 입출력이 가능한 큐
        */
		Deque q = new LinkedList();
		
		q.offerFirst("A");
		q.offerFirst("B");
		q.offerLast("C");
		
		System.out.println( q );  //  [B, A, C]
		
		// System.out.println( q.pollFirst() );
		System.out.println( q.pollLast() );

		
	} // main

} // class
