package days25;

import java.io.FileWriter;

/**
 * @author kenik  
 * @date 2025. 9. 19. 오후 2:36:33 
 * @subject   Map - Properties 컬렉션 클래스  ***
 * @content           ㄴ String key, String value
 *                    ㄴ Hashtable의 자식 클래스
 *                    ㄴ 주로 설정 정보를 저장
 */ 
public class Ex06 {

	public static void main(String[] args) {
		// DB 연결 설정 정보
		String className = "oracle.jdbc.driver.OracleDriver";  // JDBC드라이버            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";      
		String user = "scott";
		String password = "tiger"; 
		
		// 1. 파일 저장 -> 파일 읽어와서 사용...(가정)
		// FileReader , BufferedReader 사용
		// FileWriter , BufferedWriter 사용.
		String fileName = ".\\src\\days25\\oracle.config";
		try ( FileWriter fw = new FileWriter(fileName) ){
			
			fw.write(String.format("%s=%s\r\n", "className", className));
			fw.write(String.format("%s=%s\r\n", "url", url));
			fw.write(String.format("%s=%s\r\n", "user", user));
			fw.write(String.format("%s=%s\r\n", "password", password));
			
			// fw.close(); 자동으로 닫기.
			System.out.println(" end ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	} // main

} // class




