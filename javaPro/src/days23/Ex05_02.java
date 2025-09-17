package days23;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author kenik  
 * @date 2025. 9. 17. 오후 12:45:42 
 * @subject   JCF
 * @content   L/S/M
 *             ㄴ ArrayList 컬렉션 클래스 
 */ 
public class Ex05_02 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList(); 
		list.add("이나영");
		list.add("이창익");
		list.add("김수진");
		list.add("장소예");
		
		// (암기)
		// 모든 요소를 출력.... Iterator 타입  iterator()
		//                    반복자
		
		Iterator ir = list.iterator();
		
		// 반복자  요소 가지고 있니? true/false hasNext()
		// 다음 요소를 반환하는 메서드 : next()
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println( name );
		}
		
		
	} // 

}
