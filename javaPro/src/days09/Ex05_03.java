package days09;

/**
 * @author kenik  
 * @date 2025. 8. 28. 오후 4:03:32 
 * @subject   재귀 함수 예) 팩토리얼( factorial ) 
 * @content 
 */ 
public class Ex05_03 {

	public static void main(String[] args) {
		int n = 5;
		// int result = factorial(n);
		int result = recursiveFactorial(n);
		System.out.println( result );

	}

	private static int recursiveSum(int n) {
		if(n == 1) return 1;
		else return  n + recursiveSum(n-1);
	}
	
	private static int recursiveFactorial(int n) {
		if ( n == 0 || n == 1)  return 1;  
		else return n * recursiveFactorial(n-1);
	}

	private static int factorial(int n) {
		int result = 1;
		// 1*2*3*... *(n-1)*n
		for (int i = 1; i <= n; i++) {
			result *= i;
		}		
		return result;
	}

}
