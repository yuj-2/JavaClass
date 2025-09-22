package days26;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author kenik  
 * @date 2025. 9. 22. 오후 3:28:02 
 * @subject   보조 스트림을 사용해서 파일 복사
 * @content   바이트 스트림   XXXInputStream, XXXOutputSteam
 *                         FileInputStream, FileOutputStream
 *                         버퍼 기능이 있는 바이트 보조 스트림을 사용해서 코딩 수정.
 *                         BufferedInputStream, BufferedOutputStream 
 */ 
public class Ex06_02 {

	public static void main(String[] args) {
		//                     C:\Windows\System32\calc.exe
		String originalFile = "C:\\Program Files (x86)\\EditPlus 3\\editplus.exe";	
		String copiedFile = ".\\editplus-복사.exe";
		
		// > 처리 시간: 7185538300(ns)
		// > 처리 시간: 17783500(ns)
		fileCopy_byteStream(originalFile, copiedFile);
		
		System.out.println( " end ");

	} // 

	private static void fileCopy_byteStream(String originalFile, String copiedFile) {
		long startTime = System.nanoTime();
		final int BUFFER_SIZE = 1024; 
		
		int n ;
		try ( FileInputStream fis = new FileInputStream(originalFile);
			  BufferedInputStream bis = new BufferedInputStream(fis, BUFFER_SIZE); 	
			  FileOutputStream fos = new FileOutputStream(copiedFile);
			  BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE);
				){		  
			byte [] b = new byte[BUFFER_SIZE];			
		    while( ( n = bis.read(b) )	!= -1 ) {  
		    	bos.write(b, 0, n);
		    }			
		    bos.flush();  
		} catch (Exception e) {
			e.printStackTrace();
		}
		long endTime = System.nanoTime();
		System.out.println( "> 처리 시간: " + (endTime - startTime) +"(ns)" );
	}

} // 
