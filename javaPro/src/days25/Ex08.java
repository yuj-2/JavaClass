package days25;

import java.util.Enumeration;
import java.util.Properties;

/**
 * @author kenik  
 * @date 2025. 9. 19. 오후 3:28:48 
 * @subject   
 * @content 
 */ 
public class Ex08 {

	public static void main(String[] args) {
		/*
		String dir = System.getProperty("user.dir");
		System.out.println( dir );
		*/
		
		// 시스템의 환경 정보를 담고 있는 Properties 객체 p를 반환
		Properties p = System.getProperties();
		
		// 모든 key값을 출력
		/* [1]
		Set<Object> ks = p.keySet();
		Iterator<Object> ir = ks.iterator();
		while (ir.hasNext()) {
			String key =  (String) ir.next();
			System.out.println(key);
		}
		*/
		
		// [2] 열거자
		Enumeration<String> en = (Enumeration<String>) p.propertyNames();
		while (en.hasMoreElements()) {
			String key = (String) en.nextElement();
			String value = p.getProperty(key);
			// put() / get()  형변환 코딩 추가 X
			// setProperty() / getProperty()
			System.out.printf( "%s=%s\n", key, value );			
		}

	} // main

} // class






