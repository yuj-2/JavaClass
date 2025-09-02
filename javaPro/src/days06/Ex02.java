package days06;

import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 25. 오전 11:43:49 
 * @subject   가위(1), 바위(2), 보(3) 게임.
 * @content 
 */ 
public class Ex02 {

	public static void main(String[] args) {
		 
		int com, user; // 컴퓨터, 사용자
		com = (int)(Math.random()*3)+1; // 1~3;
		
		Scanner scanner = new Scanner(System.in);
		
		String regex = "[1-3]";
		System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");		
		String input = scanner.next();
		
		if( input.matches(regex) ) {
			user = Integer.parseInt(input);
			System.out.printf("> user=%d\n", user);
		}else {
			System.out.println("입력잘못!!!");
			return ;	// 프로그램 종료!!
		}
		
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






