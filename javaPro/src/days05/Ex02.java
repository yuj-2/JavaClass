package days05;

import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 22. 오전 10:39:17 
 * @subject   
 * @content 
 */ 
public class Ex02 {

	public static void main(String[] args) {

		int score;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("> 국어 점수(score) 입력 ? ");

		if ( !scanner.hasNextInt() ) {
			System.out.println("[알림] 점수 0~100 !!!"); 
			return ;
		}

		// 87
		score = scanner.nextInt();
		char grade = '가';
		
		// 
		switch (   0<=score && score <=100 ? 1 : 0   ) {
		case 1:
			switch (score/10) {
			// case 9,10:
			case 10: 
			case 9:
				grade = '수';
				break;
			case 8:				
				grade = '우';
				break;
			case 7:
				grade = '미';
				break;
			case 6:
				grade = '양';
				break;
			default:
				grade = '가';
				break;
			}
			System.out.printf("%d점은 '%c'입니다.", score, grade);
			break; 
		default:
			System.out.println("[알림] 점수 0~100 !!!");
			break;
		}
			 

	} // main

	/* 내 코딩...
	public static void main(String[] args) {


	} // main
	 */

} // class
