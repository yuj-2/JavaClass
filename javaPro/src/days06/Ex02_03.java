package days06;

import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 25. 오전 11:43:49 
 * @subject   가위(1), 바위(2), 보(3) 게임.
 * @content 
 */ 
public class Ex02_03 {

	public static void main(String[] args) {
		// 기록된 세번 실패 날짜가 오늘하고 같으면 ...
		
		int inputCount = 0;
		boolean isFlag = true;
		String input; // 입력받은 값(문자열) 
		String regex = "[1-3]";
		int com, user; // 컴퓨터, 사용자
		com = (int)(Math.random()*3)+1; // 1~3;

		Scanner scanner = new Scanner(System.in);

		do {
			inputCount++;
			
			/*
			if( inputCount > 3 ) {
				System.out.println(" 3번째 실패로 오늘은 프로그램 종료!!!");
				return;
			}
			*/
			
			System.out.printf("> [%d번째입력] user 가위(1)/바위(2)/보(3) 선택 ? ", inputCount);		
			input = scanner.next();
			if (!(isFlag=input.matches(regex))) {
				System.out.println("입력잘못!!");
				//
				if (inputCount == 3) {
					System.out.println(" 3번째 실패로 오늘은 프로그램 종료!!!");
					// 어딘가는 오늘날짜에 세번 실패했다는 정보를 기록
					return;
				}
			}
			
			
		} while (!isFlag);

		user = Integer.parseInt(input);
		System.out.printf("> user=%d\n", user);
		System.out.printf("> com=%d, user=%d\n", com, user);

		// 게임 승자 판단 ~ 
		/*                    컴퓨터 - 사용자 
		 *   사용자↖컴퓨터     가위(1)	바위(2)	보(3)
		 *   -------------------------------------
		 *   가위(1)  	:     0      1(컴)    2(사)
		 *   바위(2)  	:    -1(사)    0      1(컴)
		 *   보(3)   	:    -2(컴)   -1(사)     0
		 * */
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






