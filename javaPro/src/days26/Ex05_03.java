package days26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

/**
 * @author kenik  
 * @date 2025. 9. 22. 오후 2:10:11 
 * @subject   파일 입출력   ( 파일 복사 )
 * @content   FileReader   버퍼기능이 있는 보조스트림을 사용해서  성능 향상
 *            FileWriter 
 *            
 *            버퍼 보조 스트림 
 *            BufferedReader
 *            BufferedWriter 
 */ 
public class Ex05_03 {

	public static void main(String[] args) {
		String userDir = System.getProperty("user.dir");
		// 원본 파일
		String originalFile = String.format("%s\\src\\days26\\%s", userDir, "Ex01.java");
		// System.out.println( originalFile );
		// 복사한 파일
		String copiedFile = String.format("%s\\src\\days26\\%s", userDir, "Ex01-복사.java");
		
		// > 처리 시간: 3997400(ns)
		// > 처리 시간: 1119500(ns)
		fileCopy_textStream(originalFile, copiedFile);
		
		System.out.println( " end ");

	} // main

	private static void fileCopy_textStream(String originalFile, String copiedFile) {
		long startTime = System.nanoTime();
		final int BUFFER_SIZE = 1024; 
		int n ; // 읽어온 문자 수
		try ( FileReader fr = new FileReader(originalFile);
			  BufferedReader br = new BufferedReader(fr, BUFFER_SIZE);	 
			  FileWriter fw = new FileWriter(copiedFile);
			  BufferedWriter bw = new BufferedWriter(fw, BUFFER_SIZE);	
				){
		    
			char [] cbuf = new char[BUFFER_SIZE];
			
			// br를 사용해서 여러 문자를 한 꺼번에 읽어와서 cbuf 라는 char 배열에
			// 채운다.
		    while( ( n = br.read(cbuf) ) != -1 ) { 
		    	// System.out.printf("%c", code);
		    	// cbuf 배열의 0 위치부터 읽어온 수 n 위치 까지만 파일로 저장.
		    	bw.write(cbuf, 0, n);
		    }
			
		    bw.flush(); // 쓰기 작업..( 스트림 저장 후 비우겠다 )
		    // 자동  fw.close();    + flush() 
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		long endTime = System.nanoTime();
		System.out.println( "> 처리 시간: " + (endTime - startTime) +"(ns)" );
	}

} // class










