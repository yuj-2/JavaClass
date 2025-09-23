package days27;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author kenik  
 * @date 2025. 9. 23. 오전 10:40:08 
 * @subject   Sequence InputStream 
 * @content   순차적인 +  입력용 바이트 스트림
 *             ㄴ 여러 개의 입력용 스트림을 순차적으로 처리할 수 있는 바이트 스트림.
 *             예)
 *             용량이 큰 파일을 여러 개의 작은 파일로 분리해서 생성했다면
 *             -> 하나의 큰 스트림 처리.
 */ 
public class Ex02 {
	
	public static void main(String[] args) throws IOException {
		byte [] n = { 1,2,3 };
		ByteArrayInputStream baisN = new ByteArrayInputStream(n);
		byte [] m = { 4,5,6 };
		ByteArrayInputStream baisM = new ByteArrayInputStream(m);
		byte [] k = { 7,8,9 };
		ByteArrayInputStream baisK = new ByteArrayInputStream(k);
		
		// 각각의 배열로 부터 메모리 스트림을 3개 생성
		// 메모리 스트림 3개를 순차적으로 처리하는 SequenceInputStream을 
		// 사용하는 예제를 구현.
		
		Vector<ByteArrayInputStream> v = new Vector<>();
		v.add(baisN);
		v.add(baisM);
		v.add(baisK);
		
		// 열거자
		Enumeration<ByteArrayInputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		
		int b;
		while( (b = sis.read()) != -1 ) {
			System.out.println( b );
		}
		
		
	} // main

} // class

















