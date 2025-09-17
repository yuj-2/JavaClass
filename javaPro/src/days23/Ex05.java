package days23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author kenik  
 * @date 2025. 9. 17. 오전 10:37:25 
 * @subject   [(1)List 인터페이스]를 구현한 대표적인 컬렉션 클래스
 * @content     ㄴ ArrayList 컬렉션 클래스
 *             (2) 특징 - 중복 허용 O, 순서 유지 O
 */ 
public class Ex05 {

	public static void main(String[] args) {
		/*
		// 학생 이름을 여러 명 저장
		// String name;
		// 배열 사용했을 때 단점(문제점)
		String [] names = new String[30];
		names[0] = "이나영";
		names[1] = "김수진";
		// 1) 단점 : 배열 크기 자동 증가 X ( 배열 크기 증가 코딩 + 배열 복사 )
		// 2) 3 : 홍길동     삽입
		// 3) 삭제
		// 파악...
		 */

		// <E> 제네릭  [E]lement == 요소
		// ArrayList<E>
		//		ArrayList list = new ArrayList(10); 
		ArrayList list = new ArrayList(); 

		// add()
		// size()
		// clear()
		System.out.println( list.size() ); // 0
		list.add("이나영");
		list.add("이창익");
		list.add("김수진");
		list.add("장소예");
		System.out.println( list.size() ); // 3
		//		list.clear();
		//		System.out.println( list.size() ); // 3

		String name = "홍길동";
		// "홍길동"이 list 에 있는 지 유무를 확인한 후 
		// 있으면 삭제하고 없으면 없다라는 메시지 출력.
		// boolean contains() , remove()   + All() 
		if ( list.contains(name) ) {
			list.remove(name);
		} else {
			System.out.println(name + "은 없다.");
		}
		// 출력
		// 확인 : 순서 유지 확인 [이나영, 김수진, 장소예]
		System.out.println( list );
		// get(int index)
		// System.out.println(  list.get(1) );

		for (int i = 0; i < list.size(); i++) {
			System.out.println(  list.get(i) );
		}

		// [문제] 김수진 찾아서 앞에 홍길동 삽입... 
		//    [이나영, 김수진, 장소예]
		//    [이나영, 홍길동, 김수진, 장소예]
		//  true/false list.contains("김수진")
		int index = list.indexOf("김수진"); // -1
		// list.lastIndexOf("김수진");
		System.out.println( index );		
		list.add(index, "홍길동");  // insert(삽입)
		System.out.println( list );

		// list.trimToSize();

		// String.trim() 문자열 앞 뒤의 공백을 제거하는 메서드 
		//System.out.printf("[%s]\n", "    XXX    ".trim());

		list.add("이지혜");
		System.out.println( list );

		// [문제] 성이  "이"씨인 학생을 삭제...
		// [홍길동, 김수진, 장소예]
		/* [1]
		for (int i = 0; i < list.size(); i++) {
			// System.out.printf("%d - %s\n", i,  list.get(i) );
			name = (String) list.get(i); // Object->String 형변환, 다운캐스팅
//			if( name.charAt(0) == '이') {
			if( name.startsWith("이") ) {
				list.remove(i); // index
				i--;
				// list.remove(name); // Object o
			}
		}
		 */

		// [2]
		/*
		ArrayList leeList = new ArrayList();
		for (int i = 0; i < list.size(); i++) { 
			name = (String) list.get(i);  
			if( name.startsWith("이") ) {
				leeList.add(name);
			}
		}
		System.out.println(leeList);		
		list.removeAll(leeList);
		 */

		// [3] 람다와 스트림
		// [1]
		/*
		Predicate<String> p = new Predicate<String>() {			
			@Override
			public boolean test(String t) { 
				return t.startsWith("이");
			}
		};
		list.removeIf( p );
		 */

		// [2] 익명 클래스 
		/*
		list.removeIf( new Predicate<String>() {			
			@Override
			public boolean test(String t) { 
				return t.startsWith("이");
			}
		} );
		*/

		// [3]
		// list.removeIf( (t) ->  ((String) t).startsWith("이") );
		
		System.out.println( list );

		// [이나영, 이창익, 홍길동, 김수진, 장소예, 이지혜]
		//          1     ~      3
//		System.out.println( list.get(1));
//		System.out.println( list.get(2));
//		System.out.println( list.get(3));
		
//		for (int i = 1; i <=3 ; i++) {
//			System.out.println( list.get(i));
//		}

		List list13 = list.subList(1, 3+1) ;
		System.out.println( list13);
		
		// 배열 정렬하듯  ArrayList 정렬
		System.out.println( list );
				
		list.sort( (o1, o2) -> ((String) o1).compareTo((String) o2)  );
		
		System.out.println( list );


	} // main

} // class







