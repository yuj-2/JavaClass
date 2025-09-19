package days25;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Properties;

/**
 * @author kenik  
 * @date 2025. 9. 19. 오후 2:36:33 
 * @subject   Map - Properties 컬렉션 클래스  ***
 * @content           ㄴ String key, String value
 *                    ㄴ Hashtable의 자식 클래스
 *                    ㄴ 주로 설정 정보를 저장
 */ 
public class Ex06_02 {

	public static void main(String[] args) {
		// DB 연결 설정 정보
		String className = "oracle.jdbc.driver.OracleDriver";  // JDBC드라이버            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";      
		String user = "scott";
		String password = "tiger"; 
		
//		String fileName = ".\\src\\days25\\oracle.properties";
		String fileName = ".\\src\\days25\\oracle.xml";
		
		// Key String, Value String
		Properties p = new Properties();
		// put()/get()
		p.setProperty("className", className);
		p.setProperty("url", url);
		p.setProperty("user", user);
		p.setProperty("password", password);
		
		//{password=tiger, className=oracle.jdbc.driver.OracleDriver, user=scott, url=jdbc:oracle:thin:@localhost:1521:xe}
		//System.out.println( p );
		
		//try (FileWriter fw = new FileWriter(fileName) ){
		try ( FileOutputStream fos = new FileOutputStream(fileName) ){
			//p.store(fw, "Oracle Database Config");
			p.storeToXML(fos, "Oracle Database Config");
			System.out.println(" end ");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	} // main

} // class




