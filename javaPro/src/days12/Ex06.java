package days12;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author yujin  
 * @date 2025. 9. 2. 오후 3:13:56 
 * @subject   
 * @content 
 */ 
public class Ex06 {
	public static void main(String[] args) {
		// 0~9 정수를 랜덤하게 m 배열에 채워넣기
		// [결과]
		// 0 - 5개
		// 1 - 7개
		// 2 - 30개
		// :
		// 9 - 23개

//		int [] m = new int[100];
		Random rnd = new Random();
		int[] m = IntStream.generate(() -> rnd.nextInt(10)).limit(100).toArray();
		int count = 0;
		String s ="";
		for (int i = 0; i <= 9; i++) {
			count = 0;
			s = "";
			for (int j = 0; j < m.length; j++) {
				if(m[j] == i) {
					count++;
					s += j + ", ";
				}
			}
			System.out.printf("%d - %d개(%s)\n", i, count,s);
		}
		
 	}//main
}//class
