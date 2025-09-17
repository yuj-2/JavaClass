package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kenik  
 * @date 2025. 9. 17. 오후 3:29:26 
 * @subject   
 * @content 
 */ 
public class Ex09 {

	public static void main(String[] args) {
		// 1.  String [] -> ArrayList 변환
		String [] names = {"홍길동","이나영","김수진","장소예" };
		/* [1]
		List nlist = new ArrayList();
		for (int i = 0; i < names.length; i++) {
			nlist.add( names[i] );
		}
		System.out.println( nlist );
		*/ 
		
		// [2] asList(T...args)
		List nlist = Arrays.asList(names);
		
		// ArrayList -> String [] 변환

	} // main

} // class
