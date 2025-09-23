package days27;

import java.io.File;
import java.io.FileFilter;

import com.util.FileUtil;

/**
 * @author kenik  
 * @date 2025. 9. 23. 오후 2:37:15 
 * @subject   
 * @content 
 */ 
public class Ex04_03 {

	public static void main(String[] args) {
		// days26 폴더 안에 있는 .png 파일만 정보를  출력
		
		String pathname = ".\\src\\days26";
		File f = new File(pathname);
		
		File [] list =  f.listFiles( (t) -> { 
					String ext = FileUtil.getExtension( t.getName() );
					return ext.equals(".png");
				}
		 );
		
		for (int i = 0; i < list.length; i++) {
			System.out.println( list[i].getName() );
		}
		
		
		/* [1]
		File [] list =  f.listFiles();		
		for (int i = 0; i < list.length; i++) {
			File f2 = list[i];
			if( f2.isFile() ) {
				String fileName = f2.getName();
				String ext = FileUtil.getExtension(fileName);
				if( ext.equals(".png")) {
					System.out.println( fileName );
				}
			} // if
			
		} // for i
		*/

	} // main

} // class








