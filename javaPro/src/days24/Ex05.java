package days24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 * @author kenik  
 * @date 2025. 9. 18. 오후 12:06:25 
 * @subject  빙고 게임  
 * @content 
 */ 
public class Ex05 {

	public static void main(String[] args) {
		
		int [][] bingo = new int[5][5];
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			al.add(i);
		}
		// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25]
		System.out.println( al );
		
		// 
		Random rnd = new Random();
		
		int i = 0;
		while ( !al.isEmpty() ) {
			
			int index = rnd.nextInt( al.size() ); // 0<= index <25
			int n = al.remove(index); 
			bingo[i/5][i%5] = n; 
			i++;
		}

		dispBingo(bingo);
	} // main

	private static void dispBingo(int[][] bingo) {
		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				System.out.printf("[%02d]", bingo[i][j]);
			} // j
			System.out.println();
		} // i
	}

} // class















