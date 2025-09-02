package days07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author kenik  
 * @date 2025. 8. 26. 오후 4:03:57 
 * @subject   계속 입력할래? y/n
 * @content   
 */ 
public class Ex07_02 {

	public static void main(String[] args) throws IOException {
		String name;
		byte kor, eng, mat; 
		kor=eng=mat=0; 
		short tot = 0;
		double avg = 0; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char con = 'y';
		int count = 0;
		
		do {
			System.out.printf("  > [%d]번째 이름, 국어, 영어, 수학 입력: ", ++count);
			String input = br.readLine(); // "홍길동,78,99,66"
			 
			String [] xArr = input.split(","); 
			name = xArr[0]; 
			kor = Byte.parseByte(xArr[1]); 
			eng = Byte.parseByte(xArr[2]); 
			mat = Byte.parseByte(xArr[3]);		
			tot = (short)(kor + eng + mat);
			avg = (double)tot / 3;  
			
			// 출력
			System.out.printf("이름: \"%s\"\n"
					+ "  국어: %d\n"
					+ "  영어: %d\n"
					+ "  수학: %d\n"
					+ "  총점: %d\n"
					+ "  평균: %.2f", name, kor, eng, mat, tot, avg);
			// 파일 , DB 저장
			
			System.out.printf("\n\n 입력 계속 할래? ");
			con = br.readLine().charAt(0);			
		} while (con == 'Y' || con == 'y');
		 
		System.out.println(" end ");

	}// main

}// class








