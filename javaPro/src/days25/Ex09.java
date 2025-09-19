package days25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * @author kenik  
 * @date 2025. 9. 19. 오후 3:47:54 
 * @subject   Arrays 클래스 - 배열(Array)을 사용하기 쉽도록 기능이 구현된 클래스
 * @content                 sort(), toString(), fill(), binarySearch() 등등
 *            [ Collections 클래스 ] - 컬렉션 클래스를 사용하기 쉽도록 기능이 구현된 클래스
 *            
 */ 
public class Ex09 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);	
		/* [1]
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		*/
		// [2]
		Collections.addAll(list, 1,2,3,4,5);		
		System.out.println(list);	// [1, 2, 3, 4, 5]	
		//                              0  1  2  3  4
		
		// 전광판 - 광고   [ 하세요. ㅌㅋ]
		// 오른쪽 2칸씩 회전(이동)
		/*
		while (true) {			
			Collections.rotate(list, 1);
			System.out.println(list);
			// 1초간 기다렸다가 while문 다시 반복
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		}
		*/

		// 0   2  값 교환
		/* [1]
		int temp = list.get(0);
		list.set(0, list.get(2) );
		list.set(2, temp);
		System.out.println( list);
		*/
		// [2]
		/*
		Collections.swap(list, 0, 2);
		System.out.println( list);
		*/
		
		// [1] 
		/*
		Random rnd = new Random();
		int idx1 = 0, idx2;
		for (int i = 0; i < 10; i++) {			 
			idx2 = rnd.nextInt( list.size()-1)+1; // 0<=   <10			
			int temp = list.get(idx1);
			list.set(0, list.get(idx2) );
			list.set( idx2 , temp );			 			
		}
		*/
		// [2]
		Collections.shuffle(list);
		System.out.println( list);
		
		// 오름차순 정렬
		Collections.sort(list);
		// 내림차순 정렬
		//reverseOrder() 메서드가 내림차순으로 정렬할 수있는 Comparator 객체 반환
		Collections.sort(list, Collections.reverseOrder());
		System.out.println( list);
		
		// int index = list.indexOf(30); 
		int index = Collections.binarySearch(list, 30);
		System.out.println( index );
		
		System.out.println( list); // [5, 4, 3, 2, 1]
		Collections.reverse(list);
		System.out.println( list); // [1, 2, 3, 4, 5]
		
		Collections.fill(list, 0);
		System.out.println( list );
		
		Collections.replaceAll(list, 0, -1);
		System.out.println( list );
		
		// 등등 컬렉션 클래스를 사용하기 쉽도록 기능이 구현된 클래스가 
		// Collections 클래스이다. 
		
	} // main

} // class











