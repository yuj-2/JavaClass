package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author yujin  
 * @date 2025. 9. 2. 오전 9:41:17 
 * @subject  30명 학생의 이름,국,영,수,총,평 저장/출력 
 * @content 
 */ 
public class Ex01 {

	public static void main(String[] args) throws IOException {
		// 배열 설명
		final int STUDENT_COUNT=30;
		String [] names = new String[STUDENT_COUNT];
		int [] kors = new int[STUDENT_COUNT];
		int [] engs = new int[STUDENT_COUNT];
		int [] mats = new int[STUDENT_COUNT];
		int [] tots = new int[STUDENT_COUNT];
		double [] avgs = new double[STUDENT_COUNT];

		int count = 0; // 입력받은 학생수 == 각 배열의 index 사용

		String name;
		int kor, eng, mat;
		int tot;
		double avg;

		Scanner scanner = new Scanner(System.in);
		char con = 'Y';
		do {

			System.out.printf("> [%d] 학생의 이름,국어,영어,수학 입력 ? ",count+1);
			// 홍길동 90 92 88
			name = getName();  //scanner.next();
			kor = getScore(scanner, "국어");    //scanner.nextInt();
			eng = getScore(scanner, "영어");    //scanner.nextInt();
			mat = getScore(scanner, "수학");    //scanner.nextInt();
			tot = kor + eng + mat;
			avg = (double)tot/3;

			names[count] = name;
			kors[count] = kor;
			engs[count] =eng;
			mats[count] = mat;
			tots[count] = tot;
			avgs[count] = avg;
			
			count++;
			
			System.out.print("> 입력 계속? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available()); // CRLF(\r\n)제거
			
			
		} while (Character.toUpperCase(con)== 'Y');
		//모든 학생 출력
		System.out.printf("> 입력받은 학생수 : %d명\n", count);
		for (int i = 0; i < count; i++) {
			System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
					i+1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i]);
			
		}
		
		System.out.println("end");

	}//main

	//==========================================================
	
	private static String getName() {
		// 한글 1문자 랜덤하게 발생시킬 예정
		char [] nameArr = new char[3];
		
		Random random = new Random();
		

		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)(random.nextInt('힣' - '가' + 1)+ '가');
		}
		String name = String.valueOf(nameArr);
		//return one + ""; // 1+"" = "1" , 'a'+"" = "a" true+""="true" , 3.14+""="3.14"
		return name;
	}


	//==========================================================
	
	private static int getScore(Scanner scanner, String subject) {
		
		
		return (int)(Math.random()*101); //0<=int<101
	}

}//class
