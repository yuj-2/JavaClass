package days03;

import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 20. 오전 11:43:47 
 * @subject   p78 키보드로부터 입력 처리
 * @content    1) BufferedReader 클래스 
 *             2) Scannner 클래스
 */ 
public class Ex04_03 {	 

	public static void main(String[] args) {
		String name;
		int kor, eng, mat;
		
		Scanner scanner = new Scanner(System.in);
		String pattern = ",";
		scanner.useDelimiter(pattern); 
		 
		// 홍길동,98,78,67
		// 홍길동 98 78 67     엔터
		System.out.print("  > 이름_국어_영어_수학 입력: ");
		// scanner.nextLine()
		name = scanner.next();
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		mat = scanner.nextInt();
		 
		
		System.out.printf("이름: \"%s\"\n"
				+ "  국어: %d\n"
				+ "  영어: %d\n"
				+ "  수학: %d\n" , name, kor, eng, mat);

	}//main

}// class
