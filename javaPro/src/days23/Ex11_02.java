package days23;

import java.util.LinkedList;

/**
 * @author kenik  
 * @date 2025. 9. 17. 오후 5:30:05 
 * @subject   
 * @content 
 */ 
public class Ex11_02 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		
		System.out.println( list );
		
		int index =  list.indexOf(300);
		// list.set(index, 1);
		list.add(index, 1);
		
		System.out.println( list );
		
		// 다른 기능도 거의 ArrayList, Vector 비슷하다. 

	} // main

} // class
