package days05;

import java.util.Random;

public class Ex09_02 {

	public static void main(String[] args) {
		// 1,2,3
		Random rnd = new Random();
		// 1<= int <=3
		for (int i = 0; i < 10; i++) {
			System.out.println(rnd.nextInt(3)+1);			
		}
		

	}

}
