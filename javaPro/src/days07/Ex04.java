package days07;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 26. 오전 11:13:59 
 * @subject   
 * @content 
 */ 
public class Ex04 {

	public static void main(String[] args) throws IOException {
	    /*
		> 한 문자 입력 ? a엔터
		a		
		> 한 문자 입력 ? b엔터
		b
		*/
		
		char ch;
		
		System.out.print("> 한 문자 입력 ? ");
		int input = System.in.read();// a  엔터= \r \n
		ch = (char)input;
		System.out.println( ch );
		
		// System.in.read(); // 13
		// System.in.read(); // 10
		System.in.skip(  System.in.available() );
		
		System.out.print("> 한 문자 입력 ? ");
		input = System.in.read(); 
		ch = (char)input;
		System.out.println( ch );
		 
		System.out.println("end");
		/*
		Scanner scanner = new Scanner(System.in);		
		System.out.print("> 한 문자 입력 ? ");		
		String input = scanner.next();
		char ch = input.charAt(0);		
		// System.out.printf( "'%c'", ch );
		System.out.printf( "%d", (int)ch );  //44032
		*/ 

	}// main

}// class











