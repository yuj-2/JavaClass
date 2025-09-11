package days19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author kenik  
 * @date 2025. 9. 11. 오후 4:20:46 
 * @subject   리소스(데이터를 제공하는 객체) 자동 닫기
 * @content     ㄴ 파일, DB
 *              open()     반드시      -> close()  
 */ 
public class Ex09 {

	public static void main(String[] args) {
		// 절대 경로
		String fileName = "C:\\E\\Class\\SS24Class\\JavaClass\\javaPro\\src\\days19\\Ex01.java";
		// FileReader 클래스 *** 
		// FileWriter 클래스
		FileReader fr = null;
		int one = 0;
		try {
			fr = new FileReader(fileName);
			
			// EndOfFile == EOF
			while (  (one = fr.read())  != -1 ) {
				System.out.printf("%c", one);
			}
			/*
			one = fr.read();
			System.out.printf("%1$d(%1$c)\n", one);
			one = fr.read();
			System.out.printf("%1$d(%1$c)\n", one);
			one = fr.read();
			System.out.printf("%1$d(%1$c)\n", one);
			one = fr.read();
			System.out.printf("%1$d(%1$c)\n", one);
			one = fr.read();
			System.out.printf("%1$d(%1$c)\n", one);
			one = fr.read();
            */
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NullPointerException e) {
				e.printStackTrace();
			} 
		}
		
		System.out.println( " end ");
		

	} // main

} // class









