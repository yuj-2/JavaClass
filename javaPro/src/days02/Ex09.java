package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author kenik  
 * @date 2025. 8. 19. 오후 3:05:28 
 * @subject p66 문자열을 기본타입으로 변환
 * @content 키보드로 부터 이름을 입력받아서 처리.
 */ 
public class Ex09 {

	public static void main(String[] args) throws IOException {
		
		/*
		 java.io.BufferedReader br = 
				 new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
 		//String inputData = br.readLine() ;		
		//String name = inputData;
		
		System.out.print("> 이름 입력 ? ");
		// Unhandled exception type IOException
		String name = br.readLine();
		
		System.out.println( "> 이름은 \"" + name + "\"이다.");

		// Ex09_02.java
	}

}




