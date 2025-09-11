package days19;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author kenik  
 * @date 2025. 9. 11. 오전 11:27:39 
 * @subject   
 * @content 
 */ 
public class Ex03_03 {

	public static void main(String[] args) {
		String [] s = { "kbs", "sbs", "mbc", "jtbc" };
		System.out.println( Arrays.toString( s ) );
		// 내림차순 정렬
		/*
		Comparator<String> c = new Comparator<String>() {			
			@Override
			public int compare(String o1, String o2) { 
				return o2.compareTo(o1);
			}
		};
		*/
		
		/*
		Arrays.sort(s, new Comparator<String>() {			
			@Override
			public int compare(String o1, String o2) { 
				return o2.compareTo(o1);
			}
		});
		*/
		
		/* [2]
		StringCompartor c = new StringCompartor();
		Arrays.sort(s, c);
		*/
		
		// [3]
		// Arrays.sort(s, Collections.reverseOrder());
		
		// [4]
		/*
		Arrays.sort(s,   (o1, o2) -> { 
								return o2.compareTo(o1);
							}
				
		);
		*/
		
		//[5] -> 람다연산자   람다식과 스트림 코딩
		Arrays.sort(s,   (o1, o2) ->  o2.compareTo(o1) );
		
		System.out.println( Arrays.toString( s ) );
	} // main

} // class

class StringCompartor implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
}






