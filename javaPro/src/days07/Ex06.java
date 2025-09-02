package days07;

import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 26. 오후 2:50:25 
 * @subject   
 * @content 
 */ 
public class Ex06 {

	public static void main(String[] args) {
		// [문제] 한 문자를 입력받아서
		// 숫자, 한글, 특수문자, 대문자, 소문자 등등 파악해서 출력
		// ( 특수문자 ! @ # $ )
		char one;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 한 문자 입력 ? ");
		String input = scanner.next();
		one = input.charAt(0);
		// System.out.printf("one='%c'", one);
		if ('0'<= one && one <= '9') {
			System.out.println("숫자");
		} else if ((one >= '가' && one <= '힣') || (one >= 'ㄱ' && one <= 'ㅎ') || (one >= 'ㅏ' && one <= 'ㅣ')) {
			// str.matches(".*[ㄱ-ㅎㅏ-ㅣ가-힣].*")
			System.out.println("한글");
		} else if (one =='!' || one =='@' || one =='#' || one =='$') {
			System.out.println("특수문자");
		} else if ('A'<= one && one <= 'Z') {
			System.out.println("알파벳 대문자");
		} else if ('a'<= one && one <= 'z') {
			System.out.println("알파벳 소문자");
		} else {
			System.out.println("입력 잘못!!!");
		}
		
		

	} // main

} // class








