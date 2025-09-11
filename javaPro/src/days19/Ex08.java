package days19;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 9. 11. 오후 3:40:22 
 * @subject   국어 점수를 입력받아서 출력하는 코딩
 * @content   1) getScore() 메서드 선언 
 */ 
public class Ex08 {

	public static void main(String[] args) {
		
		int kor = 0;
		
		try {
			kor = getScore();
			System.out.println("> kor: " + kor);
			
		} catch (IOException e) { 
			e.printStackTrace();
		}
		
		System.out.println(" end ");

	} // main

	private static int getScore() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		
		System.out.print("> 점수 입력 ? ");
		String input = scanner.next();
		
		String regex = "^(\\d|[1-9]\\d|100)$";
		
		if (input.matches(regex)) {
			score = Integer.parseInt(input);
			return score;
		} else {
			// 강제로 예외 발생시키겠다.
			// throw 문 예외를 강제로 발생시키는 문
			throw new IOException("> 점수 입력 잘못!!!(0~100)");
			//throw new RuntimeException("> 점수 입력 잘못!!!(0~100)");
		}
		
		// return score;
	}

} // class








