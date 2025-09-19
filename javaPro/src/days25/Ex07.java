package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author kenik  
 * @date 2025. 9. 19. 오후 2:36:33 
 * @subject    
 * @content           oracle.config 파일을 FileReader 사용해서 
 *                    읽어와서 변수에 저장 후 출력
 */ 
public class Ex07 {

	public static void main(String[] args) {
		// DB 연결 설정 정보
		String className = null;  // JDBC드라이버            
		String url = null;     
		String user = null;
		String password = null;
		
		// 1. 파일 저장 -> 파일 읽어와서 사용...(가정)
		// FileReader , BufferedReader 사용 
		String fileName = ".\\src\\days25\\oracle.config";
		
		try ( FileReader fr = new FileReader(fileName);
			 BufferedReader br = new BufferedReader(fr)){
			String line = null;
			
			while ( (line=br.readLine())!= null) {
				String [] kv = line.split("=");
				String key = kv[0];
				String value = kv[1];
				System.out.printf("%s=%s\n", key, value);
			} 
			
			System.out.println(" end ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	} // main

} // class




