package days04;

import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 21. 오전 7:05:01 
 * @subject   
 * @content 
 * 		이나영 결석(병가)
 * 		이지혜 목/금 결석 (개인사정)
 */ 
public class Ex01 {

	public static void main(String[] args) {
		// 풀이
		String name = "이창익";
		char grade = 'D';
		double height = 189.89;
		
		// 이창익 A 189.98
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 이름 학점 키 입력 ? ");
		name = scanner.next();
		String input = scanner.next();
		grade = input.charAt(0);
		height = scanner.nextDouble();	
		
		System.out.printf("이름:%s\n학점:%c\n키:%.2f\n", name, grade, height);
		
		/* 내 코딩
		// 1. Scanner
		// 2. 이름, 학점, 키
		// 3. printf()
		*/

		// scanner.close();
	}//main

}//class












