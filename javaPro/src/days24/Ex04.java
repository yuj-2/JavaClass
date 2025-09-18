package days24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Vector;

/**
 * @author kenik  
 * @date 2025. 9. 18. 오전 11:27:39 
 * @subject   
 * @content 
 */ 
public class Ex04 {

	public static void main(String[] args) {
		// [42][36][21][38][6][26]
		
//		HashSet<int> lotto = new HashSet<int>(6);
//		HashSet<Integer> lotto = new HashSet<Integer>(6);
		
		// 기본적인 Set 계열은 순서 유지 X, 중복 허용 X
		// 순서가 유지되는 Set 계열 클래스 - LinkedHashSet 컬렉션 클래스 
		HashSet<Integer> lotto = new LinkedHashSet<Integer>(6);
		lotto.add(new Integer(42)); // int   오토박싱
		lotto.add(36);
		lotto.add(21);
		lotto.add(21);
		lotto.add(21); 
		lotto.add(38);
//		lotto.add("홍길동");
//		lotto.add( true );
		lotto.add(6);
		lotto.add(26);
		
//		ArrayList<Integer> lotto2 = new ArrayList<Integer>(lotto);
		
		// Arrays.sort(null);
//		Collections.sort(lotto);  HashSet X              List
		List<Integer> x = new ArrayList<Integer>(lotto);
		Collections.sort(x);
		
		// 복습 - 반복자 사용 출력
		Iterator<Integer> ir = x.iterator();
		while (ir.hasNext()) {
			int n = ir.next(); 
			// 다운캐스팅할 필요가 없다. Integer -> int 오토언박싱 
			System.out.printf("[%d]", n );
		}
		
		

	}

}










