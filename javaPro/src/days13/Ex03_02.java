package days13;

/**
 * @author kenik  
 * @date 2025. 9. 3. 오후 12:06:12 
 * @subject   
 * @content 
 */ 
public class Ex03_02 {

	public static void main(String[] args) {
		
		// 2차원 배열의 초기화
		/*
		int [][] m = new int[2][4];
		// 초기화
		m[0][0]=1; m[0][1]=2; m[0][2]=3; m[0][3]=4; 
		m[1][0]=5; m[1][1]=6; m[1][2]=7; m[1][3]=8;
		*/
		/*
		int [][] m = new int[][] {
										{1,2,3,4}, // 0행
										{5,6,7,8}  // 1행
								 };
		*/
		int [][] m = { 
				           {1,2,3,4}, 
				           {5,6,7,8} 
		             };
		
		// 출력
		dispM(m);

	} // main
	
	private static void dispM(int[][] m) { 
		for (int i = 0; i < m.length; i++) {      // 행 크기 4
			for (int j = 0; j < m[i].length; j++) {  // 열 크기
				System.out.printf("m[%d][%d]=%d ", i, j, m[i][j] );
			} // for j
			System.out.println();
		} // for i 
	}

} // class






