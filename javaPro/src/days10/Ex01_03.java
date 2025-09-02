package days10;

import com.util.RrnUtils;

/**
 * @author kenik  
 * @date 2025. 8. 29. 오전 11:28:11 
 * @subject   
 * @content 
 */ 
public class Ex01_03 {

	public static void main(String[] args) {
		String rrn = "830412-2700001";
		System.out.println( rrn );
		
		System.out.println( RrnUtils.isRrnCheck(rrn) );
		
		/*
		ㅍ - 검증번호
		ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11} 
        즉, 소괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ이다. 
        (단, 10은 0, 11은 1로 표기한다.)
        */
		
		/*
		int ㄱ = Integer.parseInt( rrn.substring(0, 1) ) ;
		int ㄴ = Integer.parseInt( rrn.substring(1, 2) ) ;
		int ㄷ = Integer.parseInt( rrn.substring(2, 3) ) ;
		int ㄹ = Integer.parseInt( rrn.substring(3, 4) ) ;
		int ㅁ = Integer.parseInt( rrn.substring(4, 5) ) ;
		int ㅂ = Integer.parseInt( rrn.substring(5, 6) ) ;
		//                                       6,7   -
		int ㅅ = Integer.parseInt( rrn.substring(7, 8) ) ;
		int ㅇ = Integer.parseInt( rrn.substring(8, 9) ) ;
		int ㅈ = Integer.parseInt( rrn.substring(9, 10) ) ;
		int ㅊ = Integer.parseInt( rrn.substring(10, 11) ) ;
		int ㅋ = Integer.parseInt( rrn.substring(11, 12) ) ;
		int ㅌ = Integer.parseInt( rrn.substring(12, 13) ) ;
		
		int ㅍ = Integer.parseInt( rrn.substring(13, 14) ) ;

		int checkSum = 11-((2*ㄱ+3*ㄴ+4*ㄷ+5*ㄹ+6*ㅁ+7*ㅂ+8*ㅅ+9*ㅇ+2*ㅈ+3*ㅊ+4*ㅋ+5*ㅌ) % 11);
		if(checkSum == 10) checkSum= 0;
		else if( checkSum == 11) checkSum=1;
		
		if( checkSum == ㅍ)   System.out.println("올바른 주민등록번호이다.");
		else                  System.out.println("잘못된 주민등록번호이다.");
		
		*/
	} // main
	
} // class









