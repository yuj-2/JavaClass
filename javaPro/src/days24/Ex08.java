package days24;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author kenik  
 * @date 2025. 9. 18. 오후 3:30:49 
 * @subject   C <- S  : HashSet, LinkedHashSet
 * @content             [TreeSet] 컬렉션 클래스 
 */ 
public class Ex08 {

	public static void main(String[] args) {
		/*
		 * [TreeSet]
		 * 1. 중복 허용 X, 순서 유지 X
		 * 2. 이진 검색 트리(binary search tree)라는 자료구조로 데이터를 저장하기 때문에
		 *    정렬, 검색, 범위 검색 시 높은 성능을 나타내는 컬렉션 클래스 이다.
		 * 3. 링크드리스트 처럼 노드(Node)가 서로 연결된 구조이다. 
		 * 4. 노드(Node) 간의 관계
		 *    1) 최상위 노드 : 루드(root)노트
		 *    2) 부모노드 - 자식노드
		 *    3) 형제노드
		 * 5. 노드 구조
		 *    class TreeNode{
		 *       TreeNode 왼쪽자식노드;
		 *       int value;
		 *       TreeNode 오른쪽자식노드;
		 *    }      
		 *    
		 * 6. 이진 검색 트리 구조 설명. ***
		 *    - 부모노드의 왼쪽에는 부모노드 값보다 작은 값의 자식노드가 배치되고
		 *               오른쪽에는   "    "   큰 값의 자식노드가 배치된다.
		 *                    "abc"
		 *              [0x100][7][0x300] 트리노드
		 *                  /        \ alien
		 *      [0x200][4][0x400]   [null][9][null]
		 *      0x100                0x300
		 *       /          \
		 *[null][1][null]  [null][5][0x500] 
		 *0x200            0x400  
		 *                            \
		 *                            [null][6][null] 
		 *                            0x500 
		 *                     
		 * */
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(7);
		ts.add(4);
		ts.add(1);
		ts.add(9);
		ts.add(5);
		ts.add(6);
		//    [1, 4, 5, 6, 7, 9]
		System.out.println( ts );
		System.out.println( ts.add(5) ); // false 중복허용X 
		
		System.out.println( ts.first() );
		System.out.println( ts.last() );
		
		System.out.println( ts.higher(3));
		System.out.println( ts.lower(3));
		
		System.out.println( ts.ceiling(3));
		System.out.println( ts.floor(3));
		
		SortedSet<Integer> ss = ts.subSet(4, 7);
		System.out.println( ss );

	} // main

} // class







