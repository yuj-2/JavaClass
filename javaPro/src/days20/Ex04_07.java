package days20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

/**
 * @author kenik  
 * @date 2025. 9. 12. 오후 4:13:33 
 * @subject   
 * @content 
 */ 
public class Ex04_07 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days20\\학생명단.txt";
		String line = null;
		int lineNumber = 1;
		String [] nameArr = new String[14];
				
		try ( FileReader fr = new FileReader(fileName); 
		      BufferedReader br = new BufferedReader(fr);){
			int i = 0;
			while ( (line = br.readLine())  != null ) {
				// System.out.printf("%d: %s\n", lineNumber++, line);
				nameArr[i++] = line;
			} // while
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		// System.out.println( Arrays.toString(nameArr) );
		String content = "<ol>\n";
		       content +="\t<li>";
		       content += String.join("</li>\n\t<li>", nameArr);
		       content += "</li>\n";		
		       content += "</ol>";		
		System.out.println(content);


	} // main

} // class
