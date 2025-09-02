package days04;

import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 21. 오후 4:36:40 
 * @subject   
 * @content 
 */ 
public class Ex11_03 {

	public static void main(String[] args) { 
		int score;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("> 국어 점수(score) 입력 ? ");
		 
		if ( !scanner.hasNextInt() ) {
			System.out.println("[알림] 점수 0~100 !!!"); 
			return ;
		}
		
		score = scanner.nextInt();
		
		char grade = '가';
		if ( 0<=score && score <=100) {  // 99
			if (90<=score)  grade = '수';	   
			else if (80<=score) grade = '우';
			else if (70<=score ) {
				grade = '미';
			}else if (60<=score) {
				grade = '양';
			}else{
				grade = '가';
			}
			
			System.out.printf("%d점은 '%c'입니다.", score, grade);
		} else {
			System.out.println("[알림] 점수 0~100 !!!");
		} 

	}//main

}//class
