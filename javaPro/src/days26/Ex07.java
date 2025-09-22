package days26;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * @author kenik  
 * @date 2025. 9. 22. 오후 4:03:54 
 * @subject   [메모리 스트림]
 * @content   주로 다른 곳에서 입,출력하기 전에 메모리 상에 데이터를 
 *            임시로 저장해서 사용할 목적의 스트림
 *            
 *            byte 메모리 스트림 - ByteArray[IS]/ByteArry[OS] 바이트 스트림 
 *            char 메모리 스트림 - CharArray[R]/CharArray[W]  문자 스트림
 *            String 메모리 스트림 - StringReader/StringWriter 문자 스트림
 */ 
public class Ex07 {

	public static void main(String[] args) {
		byte [] buf = { 0,1,2,3,4,5,6,7,8,9 };
		try (ByteArrayInputStream bais = new ByteArrayInputStream(buf);
			 ByteArrayOutputStream baos = new ByteArrayOutputStream();	){
			int b;
			while ( (b=bais.read()) != -1) {
				System.out.println(
					String.format("%08d", Integer.parseInt( Integer.toBinaryString(b)  ))	
						);
				baos.write(b);
			} // while
			
			// baos 출력..
			byte [] outBuf = baos.toByteArray();
			System.out.println( Arrays.toString( outBuf ));

		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main

} // class









