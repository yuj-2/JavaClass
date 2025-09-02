package days07;

import java.io.IOException;
import java.util.Iterator;

/**
 * @author kenik  
 * @date 2025. 8. 26. 오전 10:37:31 
 * @subject   ASCII  for문 사용해서 출력
 * @content   한 라인에 10개씩 출력하고 개행
 *            5라인 출력
 *            각 라인마다 라인번호를 붙이자. 
 */ 
public class Ex03_04 {

	public static void main(String[] args) throws IOException {
		
		for (int i = 0, count = 1, lineNumber = 1; i < 256; i++, count++) {
			
			if(count==1) System.out.printf("%02d: ", lineNumber++);
			
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




