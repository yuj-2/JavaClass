package days04;

import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 21. 오후 4:36:40 
 * @subject   
 * @content 
 */ 
public class Ex11_02 {

	public static void main(String[] args) {
		// [문제] 점수 입력 ( 0~100 )      if문 사용해서~
		//      수/우/미/양/가
		//      수  90<=   <=100
		//      우  80<=   <= 89
		//      가  0<=    <= 59
		
		// 출력형식)
		//   95점은 '수'입니다.
		
		int score;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("> 국어 점수(score) 입력 ? ");
		
		// if (  scanner.hasNextInt() == false) {
		if ( !scanner.hasNextInt() ) {
			System.out.println("[알림] 점수 0~100 !!!");
			// 프로그램 종료!!!
			return ;
		}
		
		score = scanner.nextInt();
		
		if ( 0<=score && score <=100) {
			// 수~가
			if (90<=score && score <=100) {
				System.out.printf("%d점은 '수'입니다.", score); 
			}
			if (80<=score && score <=89) {
				System.out.printf("%d점은 '우'입니다.", score); 
			}
			if (70<=score && score <=79) {
				System.out.printf("%d점은 '미'입니다.", score); 
			}
			if (60<=score && score <=69) {
				System.out.printf("%d점은 '양'입니다.", score); 
			}
			if (0<=score && score <=59) {
				System.out.printf("%d점은 '가'입니다.", score); 
			}
		} else {
			System.out.println("[알림] 점수 0~100 !!!");
		} 

	}//main

}//class
