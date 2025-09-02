package days06;

import java.util.Iterator;
import java.util.Random;

/**
 * @author kenik  
 * @date 2025. 8. 25. 오전 6:55:51 
 * @subject   
 * @content 
 */ 
public class Ex01 {

	public static void main(String[] args) {
		
		// 1~45 임의의 정수 : 6개 발생.   중복체크 X
		/*
		for (int i = 1; i <= 6 ; i++) {
			System.out.println( (int)(Math.random() *45)+1 );			
		}
		*/
		
		Random rnd = new Random();
		//  1<= rnd.nextInt(45)+1 <= 45
		for (int i = 1; i <= 6 ; i++) {
			System.out.println( rnd.nextInt(45)+1 );			
		}

	}//main

}//class 













