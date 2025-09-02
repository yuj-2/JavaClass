package days08;

/**
 * @author kenik  
 * @date 2025. 8. 27. 오전 11:11:41 
 * @subject   
 * @content 
 */ 
public class Ex02_02 {

	public static void main(String[] args) {
		// 주민등록번호( resident registration number )
		String rrn = "830412-1700001";
		
		
		
		//            012345678
		System.out.println( rrn.substring(7) );
		System.out.println( rrn.substring(0, 8) + "*".repeat(6));
		
		// [3] 출력)  830412-1******    substring(0,2) 메서드
		int year = Integer.parseInt( rrn.substring(0, 2) );
		int month = Integer.parseInt( rrn.substring(2, 4) );
		int day = Integer.parseInt( rrn.substring(4, 6) );
		
	    System.out.printf("생년월일: %d년 %02d월 %d일", year, month, day);
		
		
		
		/*
		// [2] 출력)  830412-1******
		String [] rrnArr = rrn.split("-");
		rrnArr[1] = rrnArr[1].charAt(0) + "*".repeat(6);
		System.out.println( rrnArr[0] +"-" + rrnArr[1]   );
		System.out.println( String.join("-", rrnArr)  );
		*/

		/*
		// [1] 출력)  830412-*******
		String [] rrnArr = rrn.split("-");
		rrnArr[1] = "*".repeat(7);
		System.out.println( rrnArr[0] +"-" + rrnArr[1]   );
		System.out.println( String.join("-", rrnArr)  );
		*/
	}

}










