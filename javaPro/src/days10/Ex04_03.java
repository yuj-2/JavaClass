package days10;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author kenik  
 * @date 2025. 8. 29. 오후 3:37:21 
 * @subject   배열 단점 -> 컬렉션 클래스
 * @content 
 */ 
public class Ex04_03 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int [] korArr = new int[3];
		int index = 0;
		//              ↓
		// [90][88][50]
		String regex = "^(100|[1-9]?\\d)$";
		String input;
		char con = 'y';

		do {			
			// 배열이 가득 찼는지 확인 후에 배열크기 증가 코딩..
			if(korArr.length == index) {
				System.out.println("2개 증가");
				int length = korArr.length + 2;
				int [] temp = new int[length];
				for (int i = 0; i < korArr.length; i++) {
					temp[i] = korArr[i];
				}
				korArr = temp;
			}

			do {
				System.out.printf("> [%d]번 학생의 국어점수 입력 ? ", index+1);
				input = scanner.next();				
			} while (!input.matches(regex)); 

			korArr[index++] = Integer.parseInt(input);

			// 입력 계속할래? y
			System.out.print("> 입력 계속할래 ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available()); 
		} while (con == 'Y' || con == 'y');

		dispKorArr(korArr, index);

	} // main

	private static void dispKorArr(int[] korArr, int index) {
		System.out.printf("> 입력받은 학생수: %d명\n", index);
		for (int i = 0; i < index; i++) {
			System.out.printf("[%d]번 학생의 국어점수: %d\n"
					, i+1, korArr[i]);
		}
		// 최고점 : 
		// 최저점 :
		// 평균   :
		int maxKor, minKor, totKor;
		maxKor = IntStream.of(korArr).max().getAsInt();
		minKor = IntStream.of(korArr).limit(index).min().getAsInt();
		double avgKor = IntStream.of(korArr).limit(index).average().getAsDouble();
		/*
		totKor = maxKor = minKor = korArr[0];
		for (int i = 1; i < index; i++) {
			if( maxKor < korArr[i] ) maxKor = korArr[i];
			else if( minKor > korArr[i] ) minKor = korArr[i];
			totKor += korArr[i];
		}
		double avgKor = (double) totKor / index;
		*/
		System.out.printf( "> 최고점 : %d점\n", maxKor );
		System.out.printf( "> 최저점 : %d점\n", minKor );
		System.out.printf( "> 평균점 : %.2f점\n", avgKor );

	}

} // class







