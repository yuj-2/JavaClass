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
 *            자동으로 리소스(자원)을 닫기 :  try~with~ resources 문   
 */ 
public class Ex09_02 {

	public static void main(String[] args) {
	 
		String fileName = "C:\\E\\Class\\SS24Class\\JavaClass\\javaPro\\src\\days19\\Ex01.java";
	  
		int one = 0;
		try (  FileReader fr = new FileReader(fileName);  ){		 
			while (  (one = fr.read())  != -1 ) {
				System.out.printf("%c", one);
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println( " end ");
		

	} // main

} // class









