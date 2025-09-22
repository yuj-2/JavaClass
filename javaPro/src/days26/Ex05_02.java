package days26;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

/**
 * @author kenik  
 * @date 2025. 9. 22. 오후 2:10:11 
 * @subject   파일 입출력   ( 파일 복사 )
 * @content              
 *            원본 파일
 *            복사한 파일
 */ 
public class Ex05_02 {

	public static void main(String[] args) {
		String userDir = System.getProperty("user.dir");
		// 원본 파일
		String originalFile = String.format("%s\\src\\days26\\%s", userDir, "Ex01.java");
		// System.out.println( originalFile );
		// 복사한 파일
		String copiedFile = String.format("%s\\src\\days26\\%s", userDir, "Ex01-복사.java");
		
		// > 처리 시간: 3997400(ns)
		fileCopy_textStream(originalFile, copiedFile);
		
		System.out.println( " end ");

	} // main

	private static void fileCopy_textStream(String originalFile, String copiedFile) {
		long startTime = System.nanoTime();
		
		int code ;
		try ( FileReader fr = new FileReader(originalFile); 
			  FileWriter fw = new FileWriter(copiedFile)){
		    
			// int <-  한문자 <- fr.read()
		    while( ( code = fr.read() )	!= -1 ) { 
		    	// System.out.printf("%c", code);
		    	fw.write(code);
		    }
			
		    fw.flush(); // 쓰기 작업..( 스트림 저장 후 비우겠다 )
		    // 자동  fw.close();    + flush() 
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		long endTime = System.nanoTime();
		System.out.println( "> 처리 시간: " + (endTime - startTime) +"(ns)" );
	}

} // class










