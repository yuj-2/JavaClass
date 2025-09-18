package days24;

import java.util.HashMap;

/**
 * @author kenik  
 * @date 2025. 9. 18. 오후 5:05:14 
 * @subject   C <- List : ArrayList, Vector, LinkedList, Stack, Queue 등등
 * @content   C <- Set : HashSet, LinkedHashSet, SortedSet, TreeSet 등등
 *                 Map :  키-값  한쌍   으로 데이터를 저장하는 구조
 *                       엔트리(Entry)
 *                        키는 중복 허용  X
 *                        
 *                  1) [Hash]Map    신
 *                  2) [Hash]table  구
 *                  
 *                      Hash ? 해싱 기법을 사용해서 데이터 저장 - 검색 기능 뛰어나다.
 *                      
 *                      해싱기법 ?  해시함수를 이용해서
 *                                데이터를 해시테이블에 저장하고 검색하는 기법
 *                      해시함수 ? 데이터가 저장되는 곳을 알려주는 함수
 *                               다량의 데이터 중에 원하는 데이터를 빠르게 검색할 수 있다. 
 *                  3) TreeMap - 정렬, 검색, 부분 검색 기능이 뛰어나다. 
 *                  4) LinkedHashMap - 순서 유지 맵 
 */ 
public class Ex09 {

	public static void main(String[] args) {
		
		// <Key, Value>
		HashMap<String, String> hm = new HashMap<>();
		// 순서 유지
		// LinkedHashMap<String, String> hm = new LinkedHashMap<>();
		
		// 맵 안에 엔트리 추가 : put(),   putAll()
		hm.put("kenik", "이창익");
		hm.put("admin", "관리자");
		hm.put("hong", "홍길동");
		hm.put("hong", "홍남길");
		hm.put( null, null);
		
		// {hong=홍길동, kenik=이창익, admin=관리자}
		System.out.println( hm );
		
		// 엔트리의 키/값 검색
		System.out.println( hm.containsKey("hong") );
		System.out.println( hm.containsValue("강남길") );
		
		// hm.replace("hong", "홍남길", "홍길동");
		hm.replace("hong", "홍길동");
		System.out.println( hm );
		
		hm.remove("hong");
		System.out.println( hm );
		
		
		String key = "admin";
		String value = hm.get(key);
		System.out.println( value );
		
		key = "abc";
		// value = hm.get(key);
		value = hm.getOrDefault(key, "무명");
		System.out.println( value );
		

	} // main

} // class








