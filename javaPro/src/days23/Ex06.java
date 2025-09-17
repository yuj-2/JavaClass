package days23;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import days14.Student;

/**
 * @author kenik  
 * @date 2025. 9. 17. 오후 2:09:56 
 * @subject 한 반에 30명 학생의 성적 처리 코딩.  
 * @content 1) 1차원 배열 선언
 *          2) 2차원 배열 선언
 *          3) 클래스 Student 선언
 *             클래스 배열 사용
 *             days14.Ex14.java
 *          4) ArrayList 사용해서 코딩 수정...    
 */ 
public class Ex06 {

	public static void main(String[] args) throws IOException {

		final int STUDENT_COUNT= 30;		
		
		ArrayList slist = new ArrayList(STUDENT_COUNT);

		int count = 0;

		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		int no;

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

			Student s = new Student();
			s.no = count+1;
			s.name = name;
			s.kor = kor;
			s.eng = eng;
			s.mat = mat;
			s.tot = tot;
			s.avg = avg;	
			
			slist.add(s); 
			
			count++;			 

			System.out.print("> 입력 계속 할거니? ");			 
			con = (char)System.in.read();
			System.in.skip(System.in.available());  
		} while ( Character.toUpperCase(con) == 'Y');

		// 등수 처리 코딩
		procRank(slist);
		// 
		
		System.out.printf("> 입력받은 학생수 : %d명\n", count);

		Iterator ir = slist.iterator();
		
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.no, s.name, s.kor, s.eng, s.mat, s.tot, s.avg,
					s.rank);
		} 

		System.out.println(" end ");

	} // main

	private static void procRank(ArrayList slist) {
		for (int i = 0; i < slist.size(); i++) {
			// s 는 등수를 매길 학생의 성적정보를 가지고 있는 객체
			Student s  =  (Student) slist.get(i);
			s.rank = 1; // 초기화
			// 총점 비교할 모든 반 학생들 
			for (int j = 0; j <  slist.size(); j++) {
				Student t  =  (Student) slist.get(j);
				if ( s.tot < t.tot ) {
					s.rank++;
				}
			} // for j
			
		} // for i
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