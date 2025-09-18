package days24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kenik  
 * @date 2025. 9. 18. 오후 2:36:29 
 * @subject   두 집합 선언
 * @content   합집합,          교집합,              차집합
 *            al.addAll(bl)  al.retainAll(bl)    al.removeAll(bl)
 */ 
public class Ex07 {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5};
		int [] b = {4,5,6,7,8};
		
		// int [] a => ArrayList 변환
		ArrayList<Integer> alist = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			alist.add(a[i]);
		}
		// int [] b => List<Integer> => ArrayList<Integer> 변환
	    List<Integer> list =  Arrays.stream(b)   // IntStream
	    							.boxed()     // Stream<Integer>
	    							.collect(Collectors.toList());
	    ArrayList<Integer> blist = new ArrayList<Integer>(list);
	    
	    // [1] 합집합
	    HashSet<Integer> union = new HashSet<>();
	    union.addAll(alist);
	    union.addAll(blist);
	    System.out.println( union );
	    
	    // [2] a - b  차집합
	    ArrayList<Integer> alistClone = (ArrayList<Integer>) alist.clone();
	    
	    alistClone.removeAll(blist);
	    System.out.println( alistClone ); // [1, 2, 3]
	    
	    // [3] a ∩ b  교집합
	    System.out.println( alist  ); // [1, 2, 3]
	    System.out.println( blist  ); // [1, 2, 3]
	    
	    alistClone = (ArrayList<Integer>) alist.clone();
	    alistClone.retainAll(blist); // 중복되는 요소를 유지
	    System.out.println( alistClone );
	    
		// 컬렉션 클래스 사용해서 코딩. - 합집합
		/*
		HashSet<Integer> union = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			union.add(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			union.add(b[i]);
		}
		System.out.println( union.size() );
		System.out.println( union);
		// HashSet -> int[] 변환
		*/
		
		
	} // main

} // class




/* 만약에 컬렉션 클래스를 사용하지 않고 구현...
int numberOfDuplicate = 0;
for (int i = 0; i < a.length; i++) {
	int m = a[i];
	for (int j = 0; j < b.length; j++) {
		int n = b[j];
		if( a[i] == b[j] ) numberOfDuplicate++;
				
	}
}
System.out.println( numberOfDuplicate );

// A ∪ B = {1,2,3,4,5,6,7,8}    union
// int [] abunion =new int[ a.length + b.length - numberOfDuplicate ];
// System.arraycopy();
// Arrays.copyOf();
int size = a.length + b.length - numberOfDuplicate;
int [] abunion = Arrays.copyOf(a, size);
System.out.println( Arrays.toString( abunion) );
for (int i = 0; i < b.length; i++) {
	if(a 배열에 없으면) {
		
	}
}
*/










