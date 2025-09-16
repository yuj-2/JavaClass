package days22;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오전 11:34:07 
 * @subject   
 * @content 
 */ 
public class Ex05_02 {

	public static void main(String[] args) {
		
		String strMoney = "₩3,257,600.00";		
		int money ;  // 3257600
		
		/* [1]
		String regex = "([₩,]|\\.\\d{2})";
		strMoney = strMoney.replaceAll(regex, "");
		System.out.println( strMoney );
		money = Integer.parseInt(strMoney);
		System.out.println( money );
		*/
		
		// [2]
		String pattern = "\u00A4#,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		
		try {
			Number n =  df.parse(strMoney);
			// Number -> int
			money = n.intValue();
			System.out.println( money );
		} catch (ParseException e) { 
			e.printStackTrace();
		}

	} // main

} // class







