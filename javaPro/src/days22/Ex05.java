package days22;

import java.text.DecimalFormat;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오전 11:22:24 
 * @subject   
 * @content 
 */ 
public class Ex05 {

	public static void main(String[] args) {

		/*
		 * [12.9 형식화 클래스]
		 *   ㄴ 숫자, 날짜, 문자열 데이터를 일정한 형식에 맞게
		 *      출력(표현)할 수 있는 기능을 가진 클래스를 
		 *      형식화 클래스 라고 한다. 
		 *   ㄴ 1) DecimalFormat 클래스 - 숫자   
		 *   ㄴ 2) SimpleDateFormat 클래스 - 날짜  
		 *   ㄴ 3) ChoiceFormat 클래스  
		 *   ㄴ 4) MessageFormat 클래스    
		 * */
		
		int money = 3257600;
		//         3,257,600
		// [1]
//		String strMoney = String.format("\%,d", money);
//		System.out.println( strMoney );
		
		// [2] 형식화 클래스 - DecimalFormat 
		String pattern = "\u00A4#,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		String strMoney =  df.format(money);
		System.out.println( strMoney );
		
	} // main

} // class
