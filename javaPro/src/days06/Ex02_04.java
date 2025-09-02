package days06;

import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 25. 오전 11:43:49 
 * @subject   가위(1), 바위(2), 보(3) 게임.
 * @content 
 */ 
public class Ex02_04 {

	public static void main(String[] args) { 
		int inputCount = 0;
		boolean isFlag = true;
		String input;  
		String regex = "[1-3]";
		int com, user;  
		String [] rpsArr = { "", "가위","바위","보" };
		
		com = (int)(Math.random()*3)+1;  
		Scanner scanner = new Scanner(System.in);

		do {
			inputCount++; 
			System.out.printf("> [%d번째입력] user 가위(1)/바위(2)/보(3) 선택 ? ", inputCount);		
			input = scanner.next();
			if (!(isFlag=input.matches(regex))) {
				System.out.println("입력잘못!!");
				//
				if (inputCount == 3) {
					System.out.println(" 3번째 실패로 오늘은 프로그램 종료!!!");					  
					return;
				}
			}
			
			
		} while (!isFlag);

		user = Integer.parseInt(input);
		// System.out.printf("> user=%d\n", user);
		
		System.out.printf("> com=%s(%d), user=%s(%d)\n"
				, rpsArr[com], com
				, rpsArr[user], user);
 
		switch (  com - user ) {
		case 0:
			System.out.println("무승부");
			break;
		case 1: case -2:
			System.out.println("컴퓨터 승리");
			break;
		case -1: case 2:
			System.out.println("사용자 승리");
			break; 
		}


	} // main

} // class






