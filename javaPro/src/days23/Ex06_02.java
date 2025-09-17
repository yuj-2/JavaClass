package days23;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.util.Graphic2D;

import days14.Student;

/**
 * @author kenik  
 * @date 2025. 9. 17. 오후 2:32:25 
 * @subject   3반 학생의 성적 처리
 * @content   ( ArrayList를 사용해서 수정 )
 *            days15.Ex01.java
 */ 
public class Ex06_02 {

	public static void main(String[] args) throws IOException {
		final int CLASS_COUNT = 3 ;
		final int STUDENT_COUNT = 30 ;		
		
 		ArrayList blist1 = new ArrayList(); // 1반 30명
 		ArrayList blist2 = new ArrayList(); // 2반 
 		ArrayList blist3 = new ArrayList(); // 3반
		
//		ArrayList  [] list13 = new ArrayList[CLASS_COUNT];
		
		ArrayList tlist = new ArrayList();
		tlist.add(blist1);
		tlist.add(blist2);
		tlist.add(blist3);
		
		// tlist.get(0);  // 1반 학생이 들어있는 ArrayList
		
		
		// Alt + Shift + A 
		// counts[0] = 1반의 입력받은 학생수
		// counts[1] = 2반의 입력받은 학생수
		// counts[2] = 3반의 입력받은 학생수
		// 반의 입력받은 학생수(index) : counts[반-1] 얻어온다.
		int [] counts = new int[CLASS_COUNT];  // index

		// 입력
		/* 테스트
		for (int i = 0; i < students.length; i++) { 
			for (int j = 0; j < students[i].length; j++) { 
				students[i][j] = new Student();
				students[i][j].no = j+1;
			} // j 
		} // i
		 */
		
		/*
		inputStudentInfo(students, counts);	

		// 등수
		procStudentRank(students, counts);
		
		// 출력
		printStudentInfo(students, counts);
		*/

	} // main

	private static void procStudentRank(Student[][] students, int[] counts) {
		// 3x30
		// [1] 총점
		//     3x30 총점
		for (int i = 0; i < counts.length; i++) {
			for (int j = 0; j < counts[i]; j++) {
				// students[i][j].tot  students[i][j].rank students[i][j].wrank
				for (int i2 = 0; i2 < counts.length; i2++) {
					for (int j2 = 0; j2 < counts[i2]; j2++) {
						//  students[i2][j2].tot 
						if(students[i][j].tot < students[i2][j2].tot) {
							students[i][j].wrank++;
							if(i == i2) students[i][j].rank++;
						}
					}
				}
			}
		}
		
	}

	private static void inputStudentInfo(Student[][] students, int[] counts) throws IOException {
		Scanner scanner = new Scanner(System.in);
		char con = 'y';
		int ban;   // 1,2,3
		
		int no;
		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;
		
		do {
			// 1. 반 부터 입력
			System.out.print("> 1. 반 입력 ? ");			
			ban = scanner.nextInt();  // 1,2,3
			// counts
			System.out.printf("> 2. %d반 [%d번] 학생 이름,국어,영어,수학 입력 ? ", ban
					, counts[ban-1]+1 );
			
			no = counts[ban-1]+1;
			name = getName(); // scanner.next();
			kor = getScore(); // scanner.nextInt();
			eng = getScore(); // scanner.nextInt();
			mat = getScore(); // scanner.nextInt();			
			tot = kor + eng + mat;
			avg = (double)tot/3;			
			wrank = rank = 1;
			
			students[ban-1][counts[ban-1]] = new Student();
			
			students[ban-1][counts[ban-1]].no = no;
			students[ban-1][counts[ban-1]].name = name;
			students[ban-1][counts[ban-1]].kor = kor;
			students[ban-1][counts[ban-1]].eng = eng;
			students[ban-1][counts[ban-1]].mat = mat;
			students[ban-1][counts[ban-1]].tot = tot;
			students[ban-1][counts[ban-1]].avg = avg;
			students[ban-1][counts[ban-1]].rank = rank;
			students[ban-1][counts[ban-1]].wrank = wrank;

			counts[ban-1]++;

			// 입력 계속 여부 체크
			System.out.print("> 학생 입력 계속 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available()); // 13, 10
		} while ( Character.toUpperCase(con) == 'Y' );

	}

	private static void printStudentInfo(Student[][] students, int[] counts) {
		for (int i = 0; i < students.length; i++) {  // 3반
			System.out.printf("[%d]반의 학생수 : %d명\n", i+1, counts[i]);
			for (int j = 0; j < counts[i]; j++) {
				System.out.printf("%s", students[i][j].getInfo() );
			}
			Graphic2D.drawLine(50, '-');
		} // i
	} // printInfo
	
	
	public static String getName() { 
		char [] nameArr = new char[3];
		Random rnd = new Random();
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣'-'가'+1)+'가');
		} 
		String name = new String(nameArr);
		return name;
	}

	public static int getScore() {
		return  (int)( Math.random()*101 ) ;
	}

} // class

