package days27;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author kenik  
 * @date 2025. 9. 23. 오후 4:39:17 
 * @subject   시간표.pdf
 * @content   시간표-1.pdf ! 시간표-9.pdf  => 하나의 시간표2.pdf 파일로 합치자.
 */ 
public class Ex04_08 {

	public static void main(String[] args) throws IOException {
		Vector<FileInputStream> v = new Vector<>();
		for (int i = 1; i <= 9 ; i++) {
			FileInputStream fis = new FileInputStream(".\\src\\days27\\시간표-"+i+".pdf");
			v.add(fis);
		}
		
		Enumeration<FileInputStream> en = v.elements();		
		SequenceInputStream sis = new SequenceInputStream(en);
		
		try ( FileOutputStream fos = new FileOutputStream(".\\src\\days27\\시간표two.pdf") ){
			int b;
			while( (b = sis.read()) != -1 ) {
				// System.out.println( b );
				fos.write(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println( " end ");
		
	} //main

} // class
