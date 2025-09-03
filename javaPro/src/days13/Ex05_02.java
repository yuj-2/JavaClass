package days13;

import java.util.Random;

/**
 * @author kenik  
 * @date 2025. 9. 3. 오후 3:40:25 
 * @subject   
 * @content 
 */ 
public class Ex05_02 {

	public static void main(String[] args) {

		int [][] lottos = new int[3][6];

        fillLottos(lottos);
		dispLottos(lottos);
	} // main
	
	private static void fillLottos(int[][] lottos) {
		for (int i = 0; i < lottos.length; i++) {  // 행			
			fillLotto(lottos[i]);
		}		
	}

	// 한 게임 => [00][00][00][00][00][00]
	private static void fillLotto(int[] lotto) {		 
		Random rnd = new Random();
		int index = 0;
		int n;		
		while ( index < 6 ) {
			n = rnd.nextInt(45)+1; 
			if (!isDuplicateLotto(lotto, n, index)) {				
				lotto[index++] = n;
			}			
		} // while 
	}

	private static boolean isDuplicateLotto(int[] lotto, int n, int index) {
		boolean flag = false;
		for (int i = 0 ; i < index; i++) {
			if( lotto[i] == n ) {
				flag = true;
				break;
			}
		} // for
		return flag;
	}

	// 2차원 배열 출력하는 메서드 
	private static void dispLottos(int[][] lottos) {
		for (int i = 0; i < lottos.length; i++) {  // 행
			System.out.printf("[%d 게임]\t", i+1);
			dispLotto(lottos[i]);
		}
	}
	
	// 1차원 배열 출력 메서드
	private static void dispLotto(int[] lotto) {
		for (int l : lotto) {
			System.out.printf("[%02d]", l);
		}
		System.out.println();
	}



} // class




