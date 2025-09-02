package days09;

import java.util.Arrays;
import java.util.Random;

/**
 * @author kenik  
 * @date 2025. 8. 28. 오전 7:08:20 
 * @subject   메서드 선언-> 메서드 호출
 * @content 
 */ 
public class Ex01 {
	
	public static void main(String[] args) {
		
		int [] lottos = new int[6];
		
		fillLotto(lottos);
		dispLotto(lottos);
		
		
	}// main

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

	private static void dispLotto(int[] lottos) {
		
		for (int l : lottos) {
			System.out.printf("[%02d]", l);
		}
		System.out.println();
		
	}

	


} // class







