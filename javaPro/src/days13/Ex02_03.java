package days13;

/**
 * @author kenik  
 * @date 2025. 9. 3. 오전 11:20:32 
 * @subject   
 * @content 
 */ 
public class Ex02_03 {

	public static void main(String[] args) {
		
		int [][][] m = new int[2][3][4];
		
		System.out.println( m.length ); // 2  면의 크기
		
		System.out.println( m[0].length ); // 0면의 행의 크기 3
		System.out.println( m[1].length ); // 1면의 행의 크기 3
		
		System.out.println( m[0][0].length ); // 0면0행의 열의 크기 4
		System.out.println( m[0][1].length ); // 0면1행의 열의 크기 4
		System.out.println( m[0][2].length ); // 0면2행의 열의 크기 4
		
		System.out.println( m[1][0].length ); // 1면0행의 열의 크기 4
		System.out.println( m[1][1].length ); // 1면1행의 열의 크기 4
		System.out.println( m[1][2].length ); // 1면2행의 열의 크기 4
		
		m[0][0][0] = 1;
		m[0][0][1] = 2;
		
		m[1][2][1] = 10;
		
		dispM(m);

	} // main

	private static void dispM(int[][][] m) {
		for (int i = 0; i < m.length; i++) {       // 면 크기
			System.out.printf("%d면\n", i);
			for (int j = 0; j < m[i].length; j++) {   // 행 크기
				for (int k = 0; k < m[i][j].length; k++) { // 열크기
					System.out.printf("m[%d][%d][%d]=%d "
							, i, j, k, m[i][j][k]);
				} // for k
				System.out.println();
			} // for j
			System.out.println();
		} // for i
	}

} // class






