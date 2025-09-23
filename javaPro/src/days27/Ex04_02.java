package days27;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.util.FileUtil;

/**
 * @author kenik  
 * @date 2025. 9. 23. 오후 2:14:38 
 * @subject   javaPro 폴더 안에
 * @content      ㄴ 서브 디렉토리(하위 폴더 ) 정보 출력
 *               ㄴ 파일 정보 출력
 */ 
public class Ex04_02 {

	public static void main(String[] args) {
		
		String pathname = System.getProperty("user.dir");
		// C:\E\Class\SS24Class\JavaClass\javaPro
		// System.out.println( pathname );
		
		File parent = new File(pathname);
		// System.out.println( parent.isDirectory() ); // true
		
		String pattern = "yyyy-MM-dd a h:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		// 하위 폴더 + 파일 목록
		File [] list = parent.listFiles();
		for (int i = 0; i < list.length; i++) {			
			File f = list[i];
			String fname = f.getName();
			long lmTime = f.lastModified();
			// 2025-09-27 오후 2:20
			Date d  = new Date(lmTime);
			String ext = null;
			if ( f.isFile() ) {
				ext = FileUtil.getExtension(fname);
				ext =  ext.substring(1).toUpperCase().concat(" 파일");				
			}
			
			System.out.printf("%s\t%s\t%s\t%s\n"
					, f.isDirectory() ?"["+ fname+"]" : fname
					, sdf.format(d)
					, f.isDirectory() ? "파일폴더" : ext
					, f.isDirectory() ? "" : f.length() +"(bytes)"
					);
			
			
		} // for i


	} // main 

}







