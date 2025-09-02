package days07;

import java.util.Arrays;
import java.util.Random;

/**
 * @author kenik  
 * @date 2025. 8. 26. 오전 7:05:03 
 * @subject   
 * @content 
 */ 
public class Ex01 {

	public static void main(String[] args) {

		// 로또 번호 1개 출력 코딩. ( 1~45 )
		// 1. Math.random()
		// 2. Random 클래스 
		Random rnd = new Random();
		//System.out.println( rnd.nextInt(45)+1 );   // 1 <= 정수(int)+1  < 46
		// 중복 로또 번호 제거
		// 로또 번호 저장할 변수 선언
		// int lotto1, lotto2, lotto3, lotto4, lotto5, lotto6;
		int [] lottos = new int[6];
		// index=6
		//                    ↓
		// [0, 0, 0, 0, 0, 0]
		//System.out.println( Arrays.toString(lottos ));
		int index = 0;
		int n;
		boolean flag = false; // true

		//  30, 40, 
		while ( index < 6 ) {
			n = rnd.nextInt(45)+1; //45
			System.out.println(">>>> " + n);
			// 중복체크	
			//boolean flag = false;
			flag = false;
			for (int i = 0 ; i < index; i++) {
				if( lottos[i] == n ) {
					flag = true;
					break;
				}
			} // for

			if( !flag ) {
				lottos[index++] = n;
				System.out.println( Arrays.toString(lottos ) + " / " + index);
			}
		} // while

		/*
		n = rnd.nextInt(45)+1;
		lottos[index++] = n;
		System.out.println( Arrays.toString(lottos ) + " / " + index);

		n = rnd.nextInt(45)+1;
		lottos[index++] = n;
		System.out.println( Arrays.toString(lottos ) + " / " + index);

		n = rnd.nextInt(45)+1;
		lottos[index++] = n;
		System.out.println( Arrays.toString(lottos ) + " / " + index);
		 */

	}// main

}// class









