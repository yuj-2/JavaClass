package days06;

/**
 * @author kenik  
 * @date 2025. 8. 25. 오후 4:35:22 
 * @subject   
 * @content 
 */ 
public class Ex05_02 {

	public static void main(String[] args) {

		// 세 정수 중에 가장 큰 값
		int a = 7, b = 5, c = 10;

		// 1. 삼항연산자
		// int max =   a>b?(a>c?a:c):(b>c?b:c);

		// 2. if문
		/*
		int max;

		if ( a > b ) {
			//max = a;
			if ( a > c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			//max = b;
			if ( b > c) {
				max = b;
			} else {
				max = c;
			}
		}
		*/
		
		// 3.   Math.max();
		int max = Math.max(a,b);
		max = Math.max(max, c);
		
		


	}// main

}// class








