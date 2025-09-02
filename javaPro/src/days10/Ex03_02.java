package days10;

/**
 * @author kenik  
 * @date 2025. 8. 29. 오후 2:22:39 
 * @subject   
 * @content 
 */ 
public class Ex03_02 {

	public static void main(String[] args) {
		//  [정보처리기사 실기]
		int money = 125760;
		int unit = 50000;
		boolean sw = false;
//		int [] unit = {50000,10000,5000,1000,500,100,50, 10, 5, 1};
		//                  /5    /2   /5   /2  /5   /2  /5  /2 /5
		int count = 0;
		while (unit >= 1) {
			count = money/unit;
			System.out.printf("%d : %d개\n", unit, count  );			
			money = money%unit;
			unit /= sw?2:5;			
			sw = !sw;
		}
	 
		/*
		share = money/unit;
		rest = money%unit;
		System.out.printf("5만원 : %d 개\n", share  );
		money = rest;
		*/ 
		
	} // main

} // class


/*
5만원 : 2 개
1만원 : 2 개
5천원 : 1 개
1천원 : 0 개
5백원 : 1 개
1백원 : 2 개
5십원 : 1 개
1십원 : 1 개
5원 : 0 개
1원 : 0 개
*/








