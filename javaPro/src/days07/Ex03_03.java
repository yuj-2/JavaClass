package days07;

import java.io.IOException;
import java.util.Iterator;

/**
 * @author kenik  
 * @date 2025. 8. 26. 오전 10:37:31 
 * @subject   ASCII  for문 사용해서 출력
 * @content   한 라인에 10개씩 출력하고 개행
 */ 
public class Ex03_03 {

	public static void main(String[] args) throws IOException {
		/*
		 * 0 ~ 255
		 * 
		 * 0 1 2 3 4 5 6 7 8  9 개행
		 * 10                19 개행
		 * 20                29 개행
		 *                   39
		 *                   49 
		 * :
		 * 
		 * 5 라인을 출력 후 아무키나 누르면 계속합니다. (엔터)
		 * 
		 * 
		 * 5 라인을 출력 후 아무키나 누르면 계속합니다. (엔터)
		 * 
		 * */
		 
		for (int i = 0, count = 1; i < 256; i++, count++) {		 
			System.out.printf("[%c]", (char)i); 
			if( count%10 == 0) {
				System.out.println();
				count = 0;
			}// if
			
			if( i%50 == 49 ) {
				System.out.println("> 엔터치면 계속합니다.");
				System.in.read();
				System.in.skip(System.in.available()); // 엔터 제거
			}
		}// for
		
	} // main

} // class




