package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 20. 오전 8:11:10 
 * @subject   Scanner 사용해 코딩 수정... ( 복습 ) 
 * @content 
 */ 
public class Ex01_03 {

	public static void main(String[] args) throws IOException {
		
		String name;
		byte kor, eng, mat; 
		kor=eng=mat=0; 
		short tot = 0;
		double avg = 0; 
		
		Scanner scanner = new Scanner(System.in);
		 
		System.out.print("  > 이름 국어 영어 수학 입력: ");
		name = scanner.next();
		kor = scanner.nextByte();
		eng = scanner.nextByte();
		mat = scanner.nextByte();
		 
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

 