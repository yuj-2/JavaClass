package days08;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args) throws IOException {
		// [문제]
		// 한 라인에 10개 + 50라인 출력 후에
		// 엔터치면 계속합니다.
		
		for (int i = '가', count = 1, lineNum=1; i <= '힣'; i++, count++) {
			if(count==1) System.out.printf("%04d : ",lineNum);
			System.out.printf("[%1$d  %1$c]",i);
			
			if(count % 10 == 0) {
				System.out.println();
				count = 0;
				if(lineNum % 50 == 0) {
					System.out.println("엔터");
					System.in.read();
					System.in.skip(System.in.available());
				}//if
				lineNum++;
			}//if
		}//for
	}

}
