package days26;

import java.io.BufferedReader;
import java.io.StringReader;

/**
 * @author kenik  
 * @date 2025. 9. 22. 오후 4:16:44 
 * @subject   메모리 스트림
 * @content   StringReader/StringWriter 기억.
 */ 
public class Ex07_02 {

	public static void main(String[] args) {
		String source = "package days26;\r\n"
				+ "\r\n"
				+ "import java.io.ByteArrayInputStream;\r\n"
				+ "import java.io.ByteArrayOutputStream;\r\n"
				+ "import java.util.Arrays;\r\n"
				+ "\r\n"
				+ "/**\r\n"
				+ " * @author kenik  \r\n"
				+ " * @date 2025. 9. 22. 오후 4:03:54 \r\n"
				+ " * @subject   [메모리 스트림]\r\n"
				+ " * @content   주로 다른 곳에서 입,출력하기 전에 메모리 상에 데이터를 \r\n"
				+ " *            임시로 저장해서 사용할 목적의 스트림\r\n"
				+ " *            \r\n"
				+ " *            byte 메모리 스트림 - ByteArray[IS]/ByteArry[OS] 바이트 스트림 \r\n"
				+ " *            char 메모리 스트림 - CharArray[R]/CharArray[W]  문자 스트림\r\n"
				+ " *            String 메모리 스트림 - StringReader/StringWriter 문자 스트림\r\n"
				+ " */ \r\n"
				+ "public class Ex07 {\r\n"
				+ "\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "		byte [] buf = { 0,1,2,3,4,5,6,7,8,9 };\r\n"
				+ "		try (ByteArrayInputStream bais = new ByteArrayInputStream(buf);\r\n"
				+ "			 ByteArrayOutputStream baos = new ByteArrayOutputStream();	){\r\n"
				+ "			int b;\r\n"
				+ "			while ( (b=bais.read()) != -1) {\r\n"
				+ "				System.out.println(\r\n"
				+ "					String.format(\"%08d\", Integer.parseInt( Integer.toBinaryString(b)  ))	\r\n"
				+ "						);\r\n"
				+ "				baos.write(b);\r\n"
				+ "			} // while\r\n"
				+ "			\r\n"
				+ "			// baos 출력..\r\n"
				+ "			byte [] outBuf = baos.toByteArray();\r\n"
				+ "			System.out.println( Arrays.toString( outBuf ));\r\n"
				+ "\r\n"
				+ "		} catch (Exception e) {\r\n"
				+ "			e.printStackTrace();\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "	} // main\r\n"
				+ "\r\n"
				+ "} // class\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "";
		// [문제]
		// source 문자열에서 
		// 20번째 라인의 문자열을 찾아서 출력		
//		String [] sArr =  source.split("\r\n");
//		System.out.println( sArr[19] );
		
		// 메모리스트림 : 문자열 StringReader/StringWriter 문자 스트림 사용.
		try (StringReader sr = new StringReader(source);
			 BufferedReader br = new BufferedReader(sr);	){
			int lineNumber = 1;
			while( lineNumber++ <= 19 ) br.readLine();
			String line20 = br.readLine();
			System.out.println( line20 );
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	} // main

} // class





