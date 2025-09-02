package days08;

import java.util.Random;

/**
 * @author kenik  
 * @date 2025. 8. 27. 오전 10:50:05 
 * @subject   
 * @content 
 */ 
public class Ex02 {

	public static void main(String[] args) {
		String card ="7655-8988-9234-5677";
		String regex = "-";
		String [] cardArr = card.split(regex);
		Random rnd = new Random();
		int starIndex = rnd.nextInt(4);  // 0<=  정수  <4
		cardArr[starIndex] = "****";
		
		// cardArr 배열의 각 요소값을 연결해서 출력.
//		System.out.printf( "%s-%s-%s-%s"
//				, cardArr[0],cardArr[1], cardArr[2], cardArr[3]); 
		
		// 배열의 각 요소값을 연결할 때 사용하는 join() 메서드 (암기)
		String result = String.join("-", cardArr);
		System.out.println( result );

		/*  결재할 때 마다 영수증보면 임의의 숫자 4개가 ****로  출력.
		"7655-****-9234-5677"
		"7655-8988-9234-****"
		"****-8988-9234-5677"
		"7655-8988-****-5677"
	    */
	}

}
