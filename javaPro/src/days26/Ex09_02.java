package days26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kenik  
 * @date 2025. 9. 22. 오후 5:15:18 
 * @subject   18.8 기본 타입 스트림.
 * @content   기본형 8가지를 읽기/쓰기 쉽게 하도록 만든 [바이트 스트림.]
 *            DataInputStream, Data[OutputStream]
 *            
 *            Ex09.java(쓰기) Ex09_02.java(읽기) 설명
 *            Ex10.java Ex10_02.java 설명  DataInputStream, Data[OutputStream]
 */ 
public class Ex09_02 {

	public static void main(String[] args) { 
		String name ;
		int kor , eng , mat ;
		int tot;
		double avg ;
		boolean gender ;

		String fileName = "student.txt"; // 파일로 저장.
		//  파일 끝에 계속 추가 true
		try ( FileReader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr);	
				){
			String line;
			String pattern = "([가-힣]{2,}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3}),([0-9.]{4,7}),(true|false)";

			while ( (line = br.readLine()) != null ) {
				// System.out.println( line );

				Pattern p = Pattern.compile(pattern);
				Matcher m = p.matcher(line);
				// m.matches()
				// m.find() 
				while ( m.find() ) {
					name = m.group(1);
					kor = Integer.parseInt( m.group(2) );
					eng = Integer.parseInt( m.group(3) );
					mat = Integer.parseInt( m.group(4) );
					tot = Integer.parseInt( m.group(5) ); 
					avg = Double.parseDouble( m.group(6) );
					gender = Boolean.parseBoolean(m.group(7));
					System.out.printf("%s,%d,%d,%d,%d,%f,%b\n"
							, name, kor, eng, mat, tot, avg, gender);
				}			

			} 
			}catch (Exception e) {
			e.printStackTrace();
		} // try

		System.out.println(" end ");
	}  // main

}
