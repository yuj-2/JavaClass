package days13;

public class Ex03_03 {

	public static void main(String[] args) {
		// 3차원 배열의 초기화
		// 2면 3행 4열 3차원 배열 초기화 1 코딩을 하세요 . 
		// int [][][] m = new int[2][3][4];
		int [][][] m = {
				{
					{1,1,1,1},
					{1,1,1,1},
					{1,1,1,1}
				},
				{
					{1,1,1,1},
					{1,1,1,1},
					{1,1,1,1}
				}
		             };
		dispM(m);

	}
	
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


}
