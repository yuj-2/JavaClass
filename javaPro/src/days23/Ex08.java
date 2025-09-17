package days23;

import java.util.ArrayList;

/**
 * @author kenik  
 * @date 2025. 9. 17. 오후 3:23:08 
 * @subject   
 * @content 
 */ 
public class Ex08 {

	public static void main(String[] args) {
		
		ArrayList   alist = new ArrayList();
		alist.add("a");
		alist.add("b");
		alist.add("c");
		
		System.out.println( alist );
		
		ArrayList blist = new ArrayList(alist); // Collection c 매개변수 다형성, 업캐스팅
		blist.add("x");
		blist.add("y");
		blist.add("z");
		System.out.println( blist );
		
		blist.removeAll(alist); // Collection c
		System.out.println( blist ); 

	} // main

} // class






