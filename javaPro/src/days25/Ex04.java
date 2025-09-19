package days25; // 

import java.util.HashMap; // 
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author kenik  
 * @date 2025. 9. 19. 오후 2:02:05 
 * @subject   
 * @content 
 */ 
public class Ex04 {
	
	// HashMap<키 String, 값 HashMap>
	//             그룹명            연락처   이름  엔트리
	//                       02-집          홍길동
	//                       010            홍길동
	static HashMap<String, HashMap<String, String>> phoneBook = 
			new HashMap<>();

	public static void main(String[] args) {
		// 1.  그룹명       이름  연락처 변수 선언
		String groupName, name, tel;

		// 2. 추가폰넘버
		addPhoneNo( "친구","이자바","010-1111-1111" );	
		addPhoneNo( "친구","김자바","010-2222-2222" );
        addPhoneNo( "친구","김자바","010-3333-3333" );
		addPhoneNo( "회사","이대리","010-4444-4444" );
		addPhoneNo( "회사","김대리","010-5555-5555" );
		addPhoneNo( "회사","박대리","010-6666-6666" );
		addPhoneNo( "동아리","김동아","010-7777-7777" );
		addPhoneNo( null, "세탁소","010-8888-8888" ); 
		addPhoneNo( null, "PC방","010-9999-8888" );  

		// 3. 목록 출력
		printList();
	}
	
	private static void printList() { 
		Set<Entry<String, HashMap<String, String>>> es	= phoneBook.entrySet();
		Iterator<Entry<String, HashMap<String, String>>> ir = es.iterator();
		while (ir.hasNext()) {
			Entry<String, HashMap<String, String>> entry = 
					(Entry<String, HashMap<String, String>>) ir	.next();

			String groupName = entry.getKey();
			HashMap<String, String> groupMap = entry.getValue();
			System.out.printf("* %s [%d]\n",  groupName, groupMap.size() );

			Iterator<Entry<String, String>>  ir2 = groupMap.entrySet().iterator();
			while (ir2.hasNext()) {
				Entry<String, String> entry2 = (Entry<String, String>) ir2.next();
				String tel  = entry2.getKey();
				String name = entry2.getValue();
				System.out.printf("\t%s : %s\n", name, tel);
			}
		}
	}
	
	private static void addPhoneNo(
			String groupName, String name, String tel) {	
		// 그룹명이 null 일경우엔 "기타" 라는 그룹명으로 변경.
		groupName = (  groupName == null ? "기타" : groupName  );
		
		// 그룹 추가 
		addGroup(  groupName );
		
		HashMap<String, String>  group = phoneBook.get(groupName);
		//        key 연락처 value 이름
		group.put( tel, name );
	}

	private static void addGroup(String groupName) {
		
		if (     !phoneBook.containsKey(groupName)   ) {
			//              그룹명 key     
			phoneBook.put(groupName, new HashMap<String, String>());
		}
		
	}

}
