package days13;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 9. 3. 오후 12:27:33 
 * @subject   
 * @content 
 */ 
public class Ex04 {

	public static void main(String[] args) throws IOException {
		final int STUDENT_COUNT= 25;

		String [] names = new String[STUDENT_COUNT];

		// 0열 국어, 1열 영어, 2열 수학, 3열 총점, 4열 등수
		int [][] infos = new int[STUDENT_COUNT][5];
		
		double [] avgs = new double[STUDENT_COUNT];

		int count = 0;  // 입력받은 학생수  == 각 배열의 index 사용

		String name;
		int kor, eng, mat;
		int tot;
		double avg;

		Scanner scanner = new Scanner(System.in);
		char con = 'Y';

		do {			
			System.out.printf("> [%d]번 학생의 이, 국, 영, 수 입력 ? ", count+1);
			// 홍길동 90 88 99
			name = getName(); //scanner.next();
			kor = getScore(scanner, "국어"); // scanner.nextInt();
			eng = getScore(scanner, "영어"); // scanner.nextInt();
			mat = getScore(scanner, "수학"); // scanner.nextInt();			 
			tot = kor + eng + mat;
			avg = (double)tot/3;		

			names[count] = name;
			infos[count][0] = kor;
			infos[count][1]= eng;
			infos[count][2] = mat;
			infos[count][3] = tot;
			avgs[count] = avg;

			count++;			 

			System.out.print("> 입력 계속 할거니? ");			 
			con = (char)System.in.read();
			System.in.skip(System.in.available()); // CRLF(\r\n) 제거
			//} while ( con == 'Y' || con == 'y');
		} while ( Character.toUpperCase(con) == 'Y');

		// 등수 처리 메서드 선언 + 호출
		// processRanking
		processRanking(infos, count);

		System.out.printf("> 입력받은 학생수 : %d명\n", count);
		for (int i = 0; i < count; i++) {
			System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					i+1, names[i]
							, infos[i][0]									
							, infos[i][1]
							, infos[i][2]
							, infos[i][3], avgs[i], infos[i][4]);

		} // 

		System.out.println(" end ");

	} // main

	private static void processRanking(int[][] infos, int count) {
		for (int i = 0; i < count; i++) { 
			infos[i][4]= 1;
			for (int j = 0; j < count; j++) { 
				if( infos[i][3] < infos[j][3]) {
					infos[i][4]++;
				}
			}
		}
	}

	private static String getName() {
		// 한글 1문자 랜덤하게 발생시킬 예정
		char [] nameArr = new char[3];		
		Random rand = new Random();		
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)( rand.nextInt('힣' - '가' + 1) + '가' );
		}		 
		String name = String.valueOf(nameArr);
		return name; // 1+"" = "1"  'a'+""="a"  3.14+""="3.14"  true+""="true"
	}

	private static int getScore(Scanner scanner, String subject) {		
		return (int)(Math.random()*101); // 0<= int  <=100
	}

} // class

