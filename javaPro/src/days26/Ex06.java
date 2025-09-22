package days26;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author kenik  
 * @date 2025. 9. 22. 오후 3:28:02 
 * @subject   
 * @content 
 */ 
public class Ex06 {

	public static void main(String[] args) {
		//                     C:\Windows\System32\calc.exe
		String originalFile = "C:\\Program Files (x86)\\EditPlus 3\\editplus.exe";	
		String copiedFile = ".\\editplus-복사.exe";
		
		// > 처리 시간: 7185538300(ns)
		fileCopy_byteStream(originalFile, copiedFile);
		
		System.out.println( " end ");

	} // 

	private static void fileCopy_byteStream(String originalFile, String copiedFile) {
		long startTime = System.nanoTime();
		
		int code ;
		try ( FileInputStream fis = new FileInputStream(originalFile); 
			  FileOutputStream fos = new FileOutputStream(copiedFile)){		     
		    while( ( code = fis.read() )	!= -1 ) {  
		    	fos.write(code);
		    }			
		    fos.flush();  
		} catch (Exception e) {
			e.printStackTrace();
		}
		long endTime = System.nanoTime();
		System.out.println( "> 처리 시간: " + (endTime - startTime) +"(ns)" );
	}

} // 
