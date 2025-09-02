package days03;

import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 20. 오전 11:43:47 
 * @subject   p78 키보드로부터 입력 처리
 * @content    1) BufferedReader 클래스 
 *             2) Scannner 클래스
 */ 
public class Ex04 {	// Ex04_02.java

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("  > 이름 입력: ");
		String name = scanner.nextLine();
		
		System.out.printf("이름: %s\n", name);

	}//main

}// class
