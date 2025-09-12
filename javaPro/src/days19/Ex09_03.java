package days19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author kenik  
 * @date 2025. 9. 11. 오후 4:20:46 
 * @subject   리소스 자동 닫기
 * @content   각 라인 앞에 라인번호를 붙이기.    
 */ 
public class Ex09_03 {

	public static void main(String[] args) {
	 
		String fileName = ".\\src\\days19\\Ex01.java";
	    int lineNumber = 1;
		int one = 0;
		try (  FileReader fr = new FileReader(fileName);  ){	
			System.out.printf("%d: ", lineNumber++);
			while (  (one = fr.read())  != -1 ) {
				System.out.printf("%c", one);
				// one ==   \r\n   13,10
				if( one == 10) {
					System.out.printf("%d: ", lineNumber++);
				}
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println( " end ");
		

	} // main

} // class









