package days13;

import java.util.Random;
import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 9. 3. 오후 2:23:22 
 * @subject   로또 번호 출력 예제    
 * @content 
 *    입력형식
 *    > 게임 횟수 입력 ? 3
 *    
 *    출력형식
 *      [1 게임]		[42][36][21][38][6][26]
		[2 게임]		[11][7][19][2][25][15]
		[3 게임]		[36][33][44][42][18][10]  
 */ 
public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numberOfGames;	
		int [][] lottos ;
		
		System.out.print("> 게임 횟수 입력 ? ");
		numberOfGames = scanner.nextInt(); // 유효성 검사~		
		lottos = new int[numberOfGames][6];  // 동적 배열
		
		// 게임횟수만큼 (로또번호6) 개씩 발생시켜서 위의 lottos 배열을 채워넣기
		createLottoGames(lottos);
		printLottoGames(lottos);
		

	} // main

	private static void createLottoGames(int[][] lottos) {
		int numberOfGames  = lottos.length; // 게임횟수
		
		Random rnd = new Random();
		int index = 0;
		int n;
		
		for (int i = 0; i < numberOfGames; i++) {  // 게임횟수만큼 로또번호 발생.
			index = 0;
			while ( index < 6 ) {       // 한 게임 로또 발생.
				n = rnd.nextInt(45)+1; 
				if (!isDuplicateLotto(lottos[i], n, index)) {				
					lottos[i][index++] = n;
				}			
			} // while
			
		} // for i
	}
	
	private static boolean isDuplicateLotto(int[] lottos, int n, int index) {
		boolean flag = false;
		for (int i = 0 ; i < index; i++) {
			if( lottos[i] == n ) {
				flag = true;
				break;
			}
		} // for
		return flag;
	}

	private static void printLottoGames(int[][] lottos) {
		
		// [1 게임]		[42][36][21][38][6][26]
		for (int i = 0; i < lottos.length; i++) {      // 행 크기 4
			System.out.printf("[%d 게임]\t", i+1);
			for (int j = 0; j < lottos[i].length; j++) {  // 열 크기
				System.out.printf("[%d]", lottos[i][j] );
			} // for j
			System.out.println();
		} // for i 
		
	}

} // class







