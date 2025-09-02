package days07;

import java.util.Iterator;

/**
 * @author kenik  
 * @date 2025. 8. 26. 오전 10:37:31 
 * @subject   ASCII  for문 사용해서 출력
 * @content   한 라인에 10개씩 출력하고 개행
 */ 
public class Ex03_02 {

	public static void main(String[] args) {
		/*
		 * 0 ~ 255
		 * 
		 * 0 1 2 3 4 5 6 7 8  9 개행
		 * 10                19 개행
		 * 20                29 개행
		 * :
		 * */
		
		// int count = 0;
		for (int i = 0, count = 1; i < 256; i++, count++) {			
			// if( i%10 == 0 && i != 0 ) System.out.println();
			System.out.printf("[%c]", (char)i);
			//if( i%10 == 9) System.out.println();
			if( count%10 == 0) {
				System.out.println();
				count = 0;
			}
		}
		
	} // main

} // class




