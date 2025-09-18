package days24;

import java.util.TreeSet;
import java.util.stream.IntStream;

/**
 * @author kenik  
 * @date 2025. 9. 18. 오후 4:38:08 
 * @subject   
 * @content 
 */ 
public class Ex08_04 {

	public static void main(String[] args) {
		
		// TreeSet 중복 허용 X
		int [] score = { 80, 95, 50, 85, 45, 65, 10, 100 };
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i = 0; i < score.length; i++) {
			ts.add(score[i]);
		} // for i
		
		System.out.println( ts ); 
		
		// 1. 점수 가장 높은 점수 ? 
		System.out.println( ts.last());
		// 2. 점수 가장 낮은 점수 ?
		System.out.println( ts.first());
		
		// 3. 80 초과인 점수 확인
		System.out.println(ts.tailSet(80, false) );
		// 3-2. 80 이상인 점수 확인
		System.out.println(ts.tailSet(80) );
		// 3-3. 80 미만인 점수 확인
		System.out.println(ts.headSet(80) );
		// 3-4. 80 미만인 점수 확인		
		System.out.println(ts.headSet(80, true) );
		
		// 4. 50<= ~<= 80 점수 확인
	    System.out.println(ts.subSet(50, 81));
	    
		// 5. 총 점수 합  
		// 6. 평균 점수 
		
		

	} // main

} // class
