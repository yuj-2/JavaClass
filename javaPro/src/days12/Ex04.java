package days12;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author yujin  
 * @date 2025. 9. 2. 오후 2:13:54 
 * @subject   카드 섞기, 화투 섞기
 * @content 
 */ 
public class Ex04 {
	public static void main(String[] args) {
		
		int [] m = IntStream.rangeClosed(1, 10).toArray();
		
		System.out.println(Arrays.toString(m));
		
		shuffle(m); // 배열을 무작위 섞기
		
		System.out.println(Arrays.toString(m));
	}//main

	//=========================================================

	
	// [3]
	private static void shuffle(int[] m) {
		Random rnd = new Random();
		int idx1=0, idx2;
		for (int i = 0; i < 10; i++) {
			idx2=rnd.nextInt(m.length-1)+1;
			
			int temp = m[idx1];
			m[idx1] = m[idx2];
			m[idx2] = temp;
			
			System.out.printf("%d. [%d][%d]: %s\n",
					i+1, idx1, idx2,Arrays.toString(m));
		}//for
	}

	
	/*[2]
	private static void shuffle(int[] m) {
		Random rnd = new Random();
		int idx1, idx2;
		for (int i = 0; i < 10; i++) {
			int [] idxArr = new Random().ints(0,10).distinct().limit(2).toArray();
			idx1 = idxArr[0];
			// idx2 = idxArr[1];
			int temp = m[idx1];
			m[idx1] = m[idxArr[1]];
			m[idxArr[1]] = temp;
			
			System.out.printf("%d. [%d][%d]: %s\n",
					i+1, idx1, idxArr[1],Arrays.toString(m));
		}//for
	}
	*/
	
	/* [1]
	private static void shuffle(int[] m) {
		Random rnd = new Random();
		int idx1, idx2;
		for (int i = 0; i < 10; i++) {
			idx1=rnd.nextInt(m.length);
			idx2=rnd.nextInt(m.length);
			
			int temp = m[idx1];
			m[idx1] = m[idx2];
			m[idx2] = temp;
			
			System.out.printf("%d. [%d][%d]: %s\n",
					i+1, idx1, idx2,Arrays.toString(m));
		}//for
	}
	
	*/
	
}
