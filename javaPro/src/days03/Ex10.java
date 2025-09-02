package days03;

/**
 * @author kenik  
 * @date 2025. 8. 20. 오후 5:14:34 
 * @subject    p87 정확한 계산은 정수 연산으로
 * @content 
 */ 
public class Ex10 { // Ex10_02.java

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		//                1 - 7*0.1
		//                1-   0.7
		//                0.3
		double result = apple - number * pieceUnit;
		
		// 사과 1개에서 남은 양: 0.29999999999999993
		System.out.println("사과 1개에서 남은 양: " + result);
		

	}

}
