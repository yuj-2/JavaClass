package days03;

/**
 * @author kenik  
 * @date 2025. 8. 20. 오후 4:45:15 
 * @subject   
 * @content 
 */ 
public class Ex09 {

	public static void main(String[] args) {
		
		/* 오버플로우, 언더플로우 개념 이해...
		// int a = Integer.MAX_VALUE; // 2147483647
		// a = a + 5;  // 오버플로우
		
		int a = Integer.MIN_VALUE; // -2147483648
		a = a - 1;    // 언더플로우    // 2147483647
		System.out.println(a);
		*/  
		
		// 예)
		
		int i = Integer.MAX_VALUE;
		int j = 100;
		//int k = i + j;  // 오버플로우 
		long k = i + (long)j;  // 오버플로우 
		
		System.out.printf("%d + %d = %d \n", i, j, k);

	}//main

}//class






