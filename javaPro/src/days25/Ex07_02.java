package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

/**
 * @author kenik  
 * @date 2025. 9. 19. 오후 2:36:33 
 * @subject    
 * @content           oracle.properties 파일을 Properties 컬렉션 클래스를 
 *                    사용해서 읽어와서 변수에 저장 후 출력
 */ 
public class Ex07_02 {

	public static void main(String[] args) {
		// DB 연결 설정 정보
		String className = null;  // JDBC드라이버            
		String url = null;     
		String user = null;
		String password = null;
		 
		String fileName = ".\\src\\days25\\oracle.properties";
		
		try ( FileReader fr = new FileReader(fileName) ){
			 
			 Properties p  = new Properties();
			 // p.store() , p.stoerToXML() 저장
			 
			 // load() 메서드는 기능이
			 // oracle.properties 파일로 부터 읽어와서 Properties 객체 p에 저장
			 p.load(fr);
			 // setProperty()/ getProperty() 
			 className = p.getProperty("className");
			 url = p.getProperty("url");
			 user = p.getProperty("user");
			 password = p.getProperty("password");
			
			 System.out.println( className );
			 System.out.println( url );
			 System.out.println( user );
			 System.out.println( password );
			 
			System.out.println(" end ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	} // main

} // class




