package days26;

import java.io.File;
import java.io.FileReader;
import java.util.Date;

/**
 * @author kenik  
 * @date 2025. 9. 22. 오후 2:10:11 
 * @subject   파일 입출력
 * @content              [프로그램(기준)]
 *        Ex01.java  ->                 ->    Ex01_02.java
 *         파일       입스               출스       파일 저장
 *         
 *         FileReader/FileWriter 를 사용해서
 *         XXXReader/XXXWriter  문자스트림, 바이트스트림 
 *         
 *         File 클래스 사용
 *           ㄴ 파일 또는 디렉토리 다루기 위한 기능(파일정보, 파일 생성, 수정, 삭제 등등)이 구현된 클래스
 */ 
public class Ex05 {

	public static void main(String[] args) {
		
		String userDir = System.getProperty("user.dir");
		//System.out.println( userDir );
		String parent = String.format("%s\\src\\days26", userDir);
		// C:\E\Class\SS24Class\JavaClass\javaPro\src\days26
		//System.out.println( parent );		
		String child = "Ex01.java";		
		File file = new File(parent, child);
		int code ;
		try ( FileReader fr = new FileReader(file); ){
		    String fileName = file.getName();
		    long fileLength =  file.length();
		    long lmTime = file.lastModified();
		    
		    Date d = new Date(lmTime);
		    // System.out.println( d.toLocaleString() );
		    
		    
		    System.out.printf("> fileName:%s, %d(bytes), %d, %s \n"
		    		, fileName, fileLength
		    		, lmTime
		    		, d.toLocaleString() );
		    
		    // EOF 파일의 끝  -1을 반환
		    while( ( code = fr.read() )	!= -1 ) {
		    	//System.out.printf("%1$d(%1$c)\n", code);
		    	System.out.printf("%c", code);
		    }
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main

} // class
