package days07;

import java.io.IOException;

/**
 * @author kenik  
 * @date 2025. 8. 26. 오후 3:30:33 
 * @subject   
 * @content 
 */ 
public class Ex06_02 {

	public static void main(String[] args) throws IOException {
		// [문제]
		// 한 라인에 10개 + 50라인 출력 후에
		// 엔터치면 계속합니다.

//		[55182('힎')][55183('힏')][55184('힐')][55185('힑')][55186('힒')]
//		[55187('힓')][55188('힔')][55189('힕')][55190('힖')][55191('힗')]
		// 한글 완성형
		for (int i = '가', count = 1, lineNumber = 1; i <= '힣'; i++, count++) { 
			
			if(count==1) System.out.printf("%d: ", lineNumber);
			
			System.out.printf("[%1$d('%1$c')]", i);
			if( count % 10 == 0) {
				System.out.println(); // 개행
				count = 0; 
				
				if( lineNumber%50 ==0 ) {
					System.out.println("> 엔터치면 계속합니다.");
					System.in.read();
					System.in.skip(System.in.available()); // 엔터 제거
				}
				lineNumber++;
			}// if
		}

		// 모음
		/*
		for (int i = 'ㅏ'; i <= 'ㅣ'; i++) { 
			System.out.printf("[%d('%c')]\n", i, i);
		}
		 */

		// 자음
		/*
		for (int i = 'ㄱ'; i <= 'ㅎ'; i++) { 
			System.out.printf("[%d('%c')]\n", i, i);
		}
		 */

		/*
		for (int i = 'A'; i <= 'z'; i++) {
			if(91 <= i && i <= 96) continue;
			System.out.printf("[%d('%c')]\n", i, i);
		}
		 */

	}

}
