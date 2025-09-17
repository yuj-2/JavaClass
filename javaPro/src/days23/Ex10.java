package days23;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author kenik  
 * @date 2025. 9. 17. 오후 4:04:28 
 * @subject   Collection
 * @content     ㄴ List
 *                  ㄴ ArrayList 컬렉션 클래스 - 동기화 처리 X, 단일 스레드 사용.
 *                  ㄴ Vector    컬렉션 클래스 - 동기화 처리 O, 멀티 스레드 사용. 
 */ 
public class Ex10 {

	public static void main(String[] args) {
		// 순서 유지 O, 중복 허용 O, 멀티스레드 안전(동기화처리 O)
		Vector list = new Vector(); 
		list.add("이지혜");
		list.addElement("지영주"); // *
		list.add("최현아");
		list.addElement("김유진");
		
		System.out.println( list );
		System.out.println( list.size() );     // 4
		System.out.println( list.capacity() ); // 10 *
		list.trimToSize();
		System.out.println( list.capacity() ); // 4
		
		list.add("홍길동");
		System.out.println( list.size() );     // 5
		System.out.println( list.capacity() ); // 8
		
		// 첫번째 요소
		System.out.println( list.get(0) );
		System.out.println( list.elementAt(0) ); // * 
		System.out.println( list.firstElement() ); // *
		
		// 마지막 요소
		System.out.println( list.get( list.size()-1  ) );
		System.out.println( list.lastElement() );  // *
		
		// 모든 요소를 반복자를 사용해서 출력하는 코딩을 하세요. 
		/*
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		*/
		
		// 최현아  찾아서 -> 김현아
		int index =  list.indexOf("최현아");
		System.out.println( "> index: " + index );
		
//		list.set(index, "김현아");
		list.setElementAt("김현아", index);
		
//		list.remove(index);		
//		list.add(index, "김현아");
//		list.insertElementAt("김현아", index);
		
		
		System.out.println( "-".repeat(100));
		// 반복자
		// 열거자
		Enumeration  en = list.elements();
		while (en.hasMoreElements()) {
			String name = (String) en.nextElement();
			System.out.println( name );
			
		}
		
	} // main

} // class








