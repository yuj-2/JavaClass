package days07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author kenik  
 * @date 2025. 8. 26. 오후 4:03:57 
 * @subject   
 * @content 
 */ 
public class Ex07 {

	public static void main(String[] args) throws IOException {
		String name;
		byte kor, eng, mat; 
		kor=eng=mat=0; 
		short tot = 0;
		double avg = 0; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 홍길동,78,99,66     엔터
		System.out.print("  > 이름, 국어, 영어, 수학 입력: ");
		String input = br.readLine(); // "홍길동,78,99,66"
		
		// String [] xArr = 문자열.split(구분자) 메서드
		String [] xArr = input.split(",");
		// "홍길동"  xArr[0]
		name = xArr[0];
		// "78" xArr[1]   String->byte
		kor = Byte.parseByte(xArr[1]);
		// "99" xArr[2]
		eng = Byte.parseByte(xArr[2]);
		// "66" xArr[3]
		mat = Byte.parseByte(xArr[3]);
		
		tot = (short)(kor + eng + mat);
		avg = (double)tot / 3;  
		System.out.printf("이름: \"%s\"\n"
				+ "  국어: %d\n"
				+ "  영어: %d\n"
				+ "  수학: %d\n"
				+ "  총점: %d\n"
				+ "  평균: %.2f", name, kor, eng, mat, tot, avg);



	}// main

}// class








