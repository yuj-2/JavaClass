package days03;

/**
 * @author kenik  
 * @date 2025. 8. 20. 오후 5:14:34 
 * @subject    p87 정확한 계산은 정수 연산으로
 * @content 
 */ 
public class Ex10_02 { // Ex10_02.java

	public static void main(String[] args) {
		int apple = 1;
		int totalPieces = apple * 10;
		int number = 7;
		 
		int result = totalPieces - number;
		
		// 사과 1개에서 남은 양: 0.29999999999999993
		System.out.println("10조각에서 남은 조각: " + result);
		System.out.println("사과 1개에서 남은 양: " + result/10.0);
		

	}

}
