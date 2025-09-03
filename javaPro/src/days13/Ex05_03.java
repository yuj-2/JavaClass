package days13;

import java.util.Random;

/**
 * @author kenik  
 * @date 2025. 9. 3. 오후 3:11:43 
 * @subject 테스트   
 * @content 
 */ 
public class Ex05_03 {

	public static void main(String[] args) {
		
		int [][] lottos = new int[3][6];
		
		for (int i = 0; i < lottos.length; i++) {
			fillLotto(lottos[i]);
		}
		
		
		for (int i = 0; i < lottos.length; i++) {
			dispLotto(lottos[i]);
		}
		
	} // main
	
	// int [] lottos  [23][36][09][39][16][20] 생성하는 메서드
	private static void fillLotto(int[] lottos) {
		 
		Random rnd = new Random();
		int index = 0;
		int n;
		
		while ( index < 6 ) {
			n = rnd.nextInt(45)+1;
			// 중복체크하는 메서드 선언
			// boolean  isDuplicateLotto(찾을대상배열, 찾을값, 찾을위치)  
			// 중복되면 true, 중복되지않으면 false 반환
			if (!isDuplicateLotto(lottos, n, index)) {				
				lottos[index++] = n;
			}			
		} // while 
	}

	//  중복 체크 메서드
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

	// int [] lottos  [23][36][09][39][16][20]  출력 메서드
	private static void dispLotto(int[] lottos) {
		
		for (int l : lottos) {
			System.out.printf("[%02d]", l);
		}
		System.out.println();
		
	}

} // class




