package days09;

/**
 * @author kenik  
 * @date 2025. 8. 28. 오후 3:34:49 
 * @subject   재귀 함수 예)
 * @content 
 */ 
public class Ex05_02 {

	public static void main(String[] args) {
		int n = 10;
		// int result = sum( n );
		int result = recursiveSum( n );
		System.out.printf("1~%d까지의 합: %d\n", n, result);
	}

	// 10 + 9 + 8 + 7 +...+2+ 1      ( 암기 )
	private static int recursiveSum(int n) {
		if(n == 1) return 1;
		else return  n + recursiveSum(n-1);
	}

	private static int sum(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += i;
		}
		return result;
	}

}








