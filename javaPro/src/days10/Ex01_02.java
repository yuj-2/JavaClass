package days10;

import java.util.Date;
import java.util.Iterator;

/**
 * @author kenik  
 * @date 2025. 8. 29. 오전 10:42:30 
 * @subject   
 * @content 
 */ 
public class Ex01_02 {

	public static void main(String[] args) {
		// 오늘날짜를 기준으로 생일이 지났는지 여부 체크
		// 오늘날짜 = 2025.8.29
		String [] rrnArr = {
				"830412-2700001"   // true
				, "830912-2700001" // false
				, "830812-2700001" // true
				, "830830-2700001" // false
		};
		
		for (int i = 0; i < rrnArr.length; i++) {
			System.out.println( isBeforeBirthday(rrnArr[i]) );
		}
		
		// 생일이 지나지 않으면 true 반환
		// 생일이 지나면  false 반환
		//boolean b = isBeforeBirthday(rrn);
		//System.out.println( b );
		
	} // main 

	// [2]
	private static boolean isBeforeBirthday(String rrn) {
		// 412
		int birthMD = Integer.parseInt( rrn.substring(2, 6) ); 
		
		// 오늘날짜의 월/일
		Date today = new Date(); 
		//today.before(today);
		//today.after(today)
		
		int todayMonth = today.getMonth() + 1;  // 800
		int todayDay = today.getDate(); // 29
		// 829
		int todayMD = todayMonth*100 + todayDay;
		
		if(  birthMD <  todayMD )
			  return true;
		else
			  return false;
	}
	
	/* [1]
	private static boolean isBeforeBirthday(String rrn) {
		// 생일의 월/일
		int birthMonth = Integer.parseInt( rrn.substring(2, 4) );// 04
		int birthDay = Integer.parseInt( rrn.substring(4, 6) );  // 12
		
		// 오늘날짜의 월/일
		Date today = new Date(); 
		int todayMonth = today.getMonth() + 1; 
		int todayDay = today.getDate();
		
		if(  birthMonth < todayMonth || 
			( birthMonth == todayMonth  && birthDay < todayDay ) )
			  return true;
		else
			  return false;
	}
	*/

} // class






