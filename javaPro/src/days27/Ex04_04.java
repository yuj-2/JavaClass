package days27;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.util.FileUtil;

/**
 * @author kenik  
 * @date 2025. 9. 23. 오후 3:10:12 
 * @subject   days26 폴더를 검색해서 "제네릭" 문자열을 
 * @content   가지고 있는 파일을 검색해서 출력.
 */ 
public class Ex04_04 {

	public static void main(String[] args) {
		
		File d = new File(".\\src\\days26");
		String word = "제네릭";
		
		File [] jlist = d.listFiles( (n)-> {
			 String ext = FileUtil.getExtension(n.getName());
			 return ext.equals(".java");
		});
		
		int lineNumber = 1;
		
		System.out.printf("Path\tLine\tText\n");
		
		for (int i = 0; i < jlist.length; i++) {
			File jf = jlist[i];
			lineNumber = 1;
			String fileName = jf.getName();
			String line = null; 
			
			try ( FileReader fr = new FileReader(jf);
				  BufferedReader br = new BufferedReader(fr); ){
				
				while ( (line = br.readLine()) != null ) {
					if( line.contains(word) ) {
						System.out.printf("%s\t%d\t%s\n"
								, fileName, lineNumber
								, line.replaceAll(word, "<"+ word+">"));
					}
					lineNumber++;
				} // while
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} // for i
		

	} // main

} // class



