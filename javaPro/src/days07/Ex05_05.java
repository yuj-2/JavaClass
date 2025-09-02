package days07;

/**
 * @author kenik  
 * @date 2025. 8. 26. 오후 2:32:36 
 * @subject   
 * @content 
 */ 
public class Ex05_05 {

	public static void main(String[] args) {
		// k=1   2단 3단 4단
		// k=2   5단 6단 7단
		// k=3   8단 9단
		
		OUT:for (int k = 1; k <= 3; k++) {
			for (int j = 1; j <= 9; j++) {      // 1~9
				for (int i = 3*k-1; i <= 3*k-1+2; i++) {  // 단
					if( i == 10 ) break OUT;
					System.out.printf("%d*%d=%02d ", i, j, i*j );
				}
				System.out.println(); // 개행
			}
			System.out.println(); // 개행
		}

		// 세로 구구단 출력
		/*
		for (int j = 1; j <= 9; j++) {      // 1~9
			for (int i = 2; i <= 4; i++) {  // 단
				System.out.printf("%d*%d=%02d ", i, j, i*j );
			}
			System.out.println(); // 개행
		}
		System.out.println(); // 개행
		for (int j = 1; j <= 9; j++) {      // 1~9
			for (int i = 5; i <= 7; i++) {  // 단
				System.out.printf("%d*%d=%02d ", i, j, i*j );
			}
			System.out.println(); // 개행
		}
		System.out.println(); // 개행
		for (int j = 1; j <= 9; j++) {      // 1~9
			for (int i = 8; i <= 9; i++) {  // 단
				System.out.printf("%d*%d=%02d ", i, j, i*j );
			}
			System.out.println(); // 개행
		}
		*/


	}

}
