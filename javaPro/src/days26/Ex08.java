package days26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author kenik  
 * @date 2025. 9. 22. 오후 4:43:19 
 * @subject   
 * @content 
 */ 
public class Ex08 {

	public static void main(String[] args) {
		// 키보드 한 문자 입력
		// System.in.read();

		// 바이트 스트림             -> 문자 변환
		InputStream is = System.in;
		
//		BufferedReader br = 
//				new BufferedReader(new InputStreamReader(System.in));

		System.out.print("한 문자 입력 ? ");
		try {
			/*
			byte [] b = new byte[3];
			int n = is.read(b);
			// byte[] -> char 변환
			char one = new String(b).charAt(0);
			System.out.println( one );			
			*/
			
			/*
			InputStreamReader isr =  new InputStreamReader(is);
			int code = isr.read();
			System.out.printf("%1$d - %1$c \n", code);
			*/
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String name =  br.readLine();
			System.out.println( name );
			
		} catch (IOException e) { 
			e.printStackTrace();
		}

	} // main

} // class










