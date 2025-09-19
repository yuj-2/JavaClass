package days25;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author kenik  
 * @date 2025. 9. 19. 오전 7:11:49 
 * @subject   Map
 * @content    ㄴ HashMap 컬렉션 클래스
 *             ㄴ entry( key + value ) 
 */ 
public class Ex01 {

	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<>(); 
		// 추가
		hm.put("admin", "관리자");
		hm.put("kenik", "이창익");
		hm.put("hong", "홍길동");
		
		System.out.println( hm.size() ); // 3
		System.out.println( hm );
		
		/* 수정, 삭제
		if( hm.containsKey("kenik") ) {
			// 이창익 -> 김창익 수정
			// key는 중복 허용 X , 같은 key로 엔트리를 추가하면 수정..
			// hm.put("kenik", "김창익");
			
			// kenik 삭제
			hm.remove("kenik");			
		}
		System.out.println( hm );
		*/

		// 모든 key값들을 조회(출력).  - Set  keySet() 메서드
		/*
		Set<String> ks = hm.keySet();
		Iterator<String> ir = ks.iterator();
		while (ir.hasNext()) {
			String key =  ir.next();
			System.out.println(key);
		}
		*/
		
		// [문제] 모든  value값들을 조회(출력).  - values()
		// [2]
		// hm.keySet();
		/*
		Collection<String> vs = hm.values();
		Iterator<String> ir = vs.iterator();
		while (ir.hasNext()) {
			String value =  ir.next();  
			System.out.println( value );
		}
		*/
		
		/* [1]
		Set<String> ks = hm.keySet();
		Iterator<String> ir = ks.iterator();
		while (ir.hasNext()) {
			String key =  ir.next();
			// key ->value get(key)
			String value = hm.get(key);
			System.out.println( value );
		}
		*/ 
		
		// [문제] 모든 key-value을 같이 출력.
		// ( key-value 형식으로 출력)
		// kenik-이창익
		// amdin-관리자
		// hong-홍길동
		/* [1]
		Set<String> vs = hm.keySet();
		Iterator<String> ir = vs.iterator();
		while (ir.hasNext()) {
			String key =  ir.next();  
			String value = hm.get(key);
			System.out.printf( "%s-%s\n", key, value);
		}
		*/
		// [2] Entry<String, String>   key + value 한쌍을 저장하고 있는 클래스 객체
		Set<Entry<String, String>> es = hm.entrySet();
		Iterator<Entry<String, String>>  ir = es.iterator();
		while (ir.hasNext()) {
			Entry<String, String> entry = ir.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.printf( "%s-%s\n", key, value);
		}
		
	} // main

} // class









