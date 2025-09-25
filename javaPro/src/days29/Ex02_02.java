package days29;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author kenik  
 * @date 2025. 9. 25. 오전 9:43:53 
 * @subject   
 * @content 
 */ 
public class Ex02_02 {

	public static void main(String[] args) {
		String [] s = {"kbs", "mbc","sbs", "jtbc"};
		// String [] -> List 변환
		List<String> list = Arrays.asList(s);
		System.out.println( list );
		// 내림차순 정렬해서 출력
		/*
		list.sort( new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {				
				return o2.compareTo(o1);
			}
		});
		*/
		Comparator<String> cp = ( o1,  o2) ->   o2.compareTo(o1) ;
		list.sort(  cp  );
		
		System.out.println( list ); 

	}

}





