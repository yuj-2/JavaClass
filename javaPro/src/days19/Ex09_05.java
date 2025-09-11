package days19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author kenik  
 * @date 2025. 9. 11. 오후 4:20:46 
 * @subject   리소스 자동 닫기
 * @content   ㄴ one = fr.read() 파일의 끝을 만날 때 까지 한문자씩 읽어와서 출력
 *               한 라인씩 읽어와서 출력. (코딩을 수정)
 */ 
public class Ex09_05 {

	public static void main(String[] args) {
	    // 절대경로
		// 상대경로 
		// C:\E\Class\SS24Class\JavaClass\javaPro
		String userDir = System.getProperty("user.dir");
//		System.out.println( userDir );
		
		 
		// .  상대경로 기호: 현재 디렉토리
		// .. 상위 폴더로 이동
		// String fileName = ".\\src\\days19\\Ex01.java"; // 파일명
		// 절대경로
		// String fileName =  userDir +"\\src\\days19\\Ex01.java"; // 파일명
		// String fileName = ".\\.classpath";
		// String fileName = ".classpath";
		//String fileName = ".\\..\\Sample.java";
		String fileName = ".\\..\\..\\test.txt";
		
	    int lineNumber = 1;
		String line = null; // 한 라인을 읽어와서 저장할 변수 선언 
		try (  FileReader fr = new FileReader(fileName);
			   BufferedReader br = new BufferedReader(fr);	){ // Reader in  매개변수 다형성	
		    
			while ( (line =  br.readLine()) != null    ) {
				System.out.printf("%d: %s\n", lineNumber++, line);
			} 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	 
		System.out.println( " end ");
		

	} // main

} // class









