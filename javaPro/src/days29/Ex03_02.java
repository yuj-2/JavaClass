package days29;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @author kenik  
 * @date 2025. 9. 25. 오전 10:16:53 
 * @subject  컬렉션 클래스 + 메서드 중에 함수형 인터페이스를 매개변수
 * @content 
 */ 
public class Ex03_02 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		// System.out.println( list );
		/*
		Consumer<Integer> c = new Consumer<Integer>() {			
			@Override
			public void accept(Integer t) {
				System.out.printf("[%d]", t);
			}
		};
		*/
		
		// Consumer<Integer> c = (t) -> System.out.printf("[%d]", t); 
		
		list.forEach((t) -> System.out.printf("[%d]", t));

	} // main 

} // class





