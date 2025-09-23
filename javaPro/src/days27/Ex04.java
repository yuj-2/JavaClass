package days27;

import java.io.File;
import java.io.IOException;

import com.util.FileUtil;

/**
 * @author kenik  
 * @date 2025. 9. 23. 오후 2:00:41 
 * @subject   
 * @content 
 */ 
public class Ex04 {

	public static void main(String[] args) throws IOException {
		// [ File 클래스 ] 
		//   파일 또는 폴더 다룰 수 있는 기능이 구현된 클래스
		String pathname = ".\\src\\days27\\Ex01.java";
		File f = new File(pathname);
		
		//  .\src\days27\Ex01.java
		System.out.println( f.getPath() );
		// C:\E\Class\SS24Class\JavaClass\javaPro\.\src\days27\Ex01.java
		System.out.println( f.getAbsolutePath() );
		// C:\E\Class\SS24Class\JavaClass\javaPro\src\days27\Ex01.java
		System.out.println( f.getCanonicalPath() );
		
		System.out.println( "=".repeat(100) );	
		
		// System.out.println( f.exists() );
		if ( f.exists() ) {
			System.out.println( f.isDirectory() ); // false
			System.out.println( f.isFile() ); // true
			System.out.println( f.length() +" (bytes)");
		} // if
		
		System.out.println( File.separator );     //  \
		System.out.println( File.pathSeparator ); //  ;
		
		
		String fileName = f.getName();
		System.out.println( fileName ); // Ex01.java
		
		// 확장자만 얻어오고 싶다     .java
		// 확장자를 제외한 순수한 파일명을 얻어오고 싶다. 
		// fileName.split(".");
		int pos = fileName.indexOf(".");
		String baseFileName = fileName.substring(0, pos);
		String ext = fileName.substring(pos);
		System.out.println( baseFileName );
		System.out.println( ext );
		// com.util.FileUtil.java
		
		baseFileName = FileUtil.getBaseName(fileName);
		ext = FileUtil.getExtension(fileName);
		System.out.println( baseFileName );
		System.out.println( ext );
		

	} // main

} // class










