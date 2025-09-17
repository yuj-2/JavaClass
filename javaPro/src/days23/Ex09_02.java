package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author kenik  
 * @date 2025. 9. 17. 오후 3:29:26 
 * @subject   
 * @content 
 */ 
public class Ex09_02 {

	public static void main(String[] args) {
		// 1.  String [] -> ArrayList 변환
		String [] names = {"홍길동","이나영","김수진","장소예" }; 
		List nlist = Arrays.asList(names);
		System.out.println( nlist );
		
		// 2. ArrayList -> String [] 변환
		//     nlist    
		/* [1]
		Iterator ir = nlist.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			//  배열 추가
		}
		*/
		
		// [2]
		/*
		Object [] arr = nlist.toArray();
		for (Object n : arr) {
			String name = (String) n; // 다운 캐스팅
			System.out.println( name );
		}
		*/
		
		// [3]
		String [] arr = (String[]) nlist.toArray( String[]::new );

	} // main

} // class
