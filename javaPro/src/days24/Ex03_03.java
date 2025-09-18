package days24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 9. 18. 오전 10:34:37 
 * @subject   로또 번호 출력 예제    
 * @content   ArrayList
 *               요소 HashSet
 *               입출력 메서드 각각 기억
 *                
 *    입력형식
 *    > 게임 횟수 입력 ? 3
 *    
 *    출력형식                                    ArrayList        int [][] lottos ;
 *      [1 게임]		[42][36][21][38][6][26]   -> HashSet lotto   int [] lotto
		[2 게임]		[11][7][19][2][25][15]    -> HashSet lotto   int [] lotto
		[3 게임]		[36][33][44][42][18][10]  -> HashSet lotto   int [] lotto
 */ 
public class Ex03_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numberOfGames;	
		
		ArrayList lottos = new ArrayList();

		System.out.print("> 게임 횟수 입력 ? ");
		numberOfGames = scanner.nextInt(); // 유효성 검사~		
		
		createLottoGames(lottos, numberOfGames);
		printLottoGames(lottos);


	} // main

	private static void printLottoGames(ArrayList lottos) {
		int numberOfGames = lottos.size(); // 
		
		for (int i = 0; i < numberOfGames ; i++) {      // 행 크기 4
			System.out.printf("[%d 게임]\t", i+1);			
			HashSet lotto = (HashSet) lottos.get(i);			
			Iterator ir = lotto.iterator();
			while (ir.hasNext()) {
				int n = (int) ir.next();
				System.out.printf("[%d]", n );
			}			
			System.out.println();
		} // for i 
		
		 
	}

	private static void createLottoGames(ArrayList lottos, int numberOfGames) {		
		Random rnd = new Random();		 
		int n;
		for (int i = 0; i < numberOfGames; i++) {  // 게임횟수만큼 로또번호 발생.
			HashSet lotto = new HashSet(6);
			while ( lotto.size() < 6 ) {       // 한 게임 로또 발생.
				n = rnd.nextInt(45)+1; 
				lotto.add(n);			
			} // while			
			lottos.add(lotto);
		} // for i
	}  
	 

} // class
