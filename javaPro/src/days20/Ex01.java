package days20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author kenik  
 * @date 2025. 9. 12. 오전 7:06:38 
 * @subject   
 * @content 
 */ 
public class Ex01 {

	public static void main(String[] args) {
		/*  [문제] 9:15 제출 ~
			학생명단.txt  파일을 읽어서 출력.
			( 
			   ㄱ. try~with~resources 문 사용
			   ㄴ. FileReader 만 사용 ( BufferedReader X )
			   ㄷ.  앞에 LineNumber 붙이기 
			)
		 * */
		
		// 상대 경로
		String fileName = ".\\src\\days20\\학생명단.txt";
		String line = null;
		int lineNumber = 1;
		
		try ( FileReader fr = new FileReader(fileName); 
		      BufferedReader br = new BufferedReader(fr);){
			while ( (line = br.readLine())  != null ) {
				System.out.printf("%d: %s\n", lineNumber++, line);
			} // while
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 

	} // main

} // class





