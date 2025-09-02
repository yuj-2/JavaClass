package days08;

import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 8. 27. 오후 4:32:36 
 * @subject   days03.Ex01_03.java 파일 복사 + 붙이기.
 * @content 
 */ 
public class Ex09 {

	public static void main(String[] args) {
		
		String name;
		byte kor, eng, mat; 
		kor=eng=mat=0; 
		short tot = 0;
		double avg = 0; 
		
		Scanner scanner = new Scanner(System.in);		 
		
		name = getName(scanner);
		kor = getScore(scanner, "국어");
		eng = getScore(scanner, "영어");
		mat = getScore(scanner, "수학");
		 
		tot = getTotal(kor, eng, mat); // ;
		avg = getAvg(tot, 3) ;// ;  
		
		printScore(name, kor, eng, mat, tot, avg );
		
		
	}

	private static void printScore(String name, byte kor, byte eng, byte mat, short tot, double avg) {
		System.out.printf("이름: \"%s\"\n"
				+ "  국어: %d\n"
				+ "  영어: %d\n"
				+ "  수학: %d\n"
				+ "  총점: %d\n"
				+ "  평균: %.2f", name, kor, eng, mat, tot, avg);

	}

	private static double getAvg(short tot, int subjectCount) { 
		return (double)tot / subjectCount;
	}

	private static short getTotal(byte kor, byte eng, byte mat) { 
		return (short)(kor + eng + mat);
	}

	// 점수 -  입력값에 대한 유효성 검사
	private static byte getScore(Scanner scanner, String subject) {
		//Scanner scanner = new Scanner(System.in);
		String regex ="^([1-9]?\\d|100)$"; // [0-9]  == \d
		String input;
		boolean flag = true;
		do {
			if( !flag ) {
				System.out.printf("[알림] 점수입력잘못(0~100)!!!\n");
			}
			System.out.printf("%s 점수 입력 ? ", subject);
			input = scanner.next();	
			flag = input.matches(regex);
		} while ( !flag  );
		
		byte score = Byte.parseByte(input); // 1a
		return score;
	}

	private static String getName(Scanner scanner) {
		//Scanner scanner = new Scanner(System.in);
		System.out.print("1. 이름 입력 ? ");
		String name = scanner.next();
		return name;
	}

}
