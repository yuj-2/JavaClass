package days24;

/**
 * @author kenik  
 * @date 2025. 9. 18. 오후 12:41:21 
 * @subject   
 * @content 
 */ 
public class Ex05_02 {

	public static void main(String[] args) {
		// 1차원 배열 -> 2차원 배열 변환
		int [] m = {1,2,3,4,5,6,7,8};
		
		int [][] n = new int[4][2];
		
		// 코딩 
		// i    i     i/2 i%2
		// 0  m[0]   n[0][0]
		// 1  m[1]   n[0][1]
		// 2  m[2]   n[1][0]
		// 3  m[3]   n[1][1]
		// 4  m[4]   n[2][0]
		int col = n[0].length;
		for (int i = 0; i < m.length; i++) {
			n[i/col][i%col] =  m[i];
		}
		
		

	}

}
