package days10;

/**
 * @author kenik  
 * @date 2025. 8. 29. 오후 2:22:39 
 * @subject   
 * @content 
 */ 
public class Ex03 {

	public static void main(String[] args) {
		//  [정보처리기사 실기]
		int money = 125760;
		
		int share; // 몫
		int rest;  // 나머지
		
		int [] unit = {50000,10000,5000,1000,500,100,50, 10, 5, 1};
		String [] s_unit = { "5만원","1만원","5천원", "1천원", "5백원", "1백원","5십원","1십원","5원","1원" };
		
		for (int i = 0; i < unit.length; i++) {
			share = money/unit[i];
			rest = money%unit[i];
			System.out.printf("%s : %d 개\n",s_unit[i], share  );
			money = rest;
		}
		
		/*
		share = money/50000;
		rest = money%50000;
		System.out.printf("5만원 : %d 개\n", share  );
		money = rest;
		
		share = money/10000;
		rest = money%10000; // 5760
		System.out.printf("1만원 : %d 개\n", share  );
		money = rest;

		share = money/5000;
		rest = money%5000; // 5760
		System.out.printf("5천원 : %d 개\n", share  );
		money = rest;
		
		share = money/1000;
		rest = money%1000; // 5760
		System.out.printf("1천원 : %d 개\n", share  );
		money = rest;
		
		share = money/500;
		rest = money%500; // 5760
		System.out.printf("5백원 : %d 개\n", share  );
		money = rest;

		share = money/100;
		rest = money%100; // 5760
		System.out.printf("1백원 : %d 개\n", share  );
		money = rest;
		

		share = money/50;
		rest = money%50; // 5760
		System.out.printf("5십원 : %d 개\n", share  );
		money = rest;
		

		share = money/10;
		rest = money%10; // 5760
		System.out.printf("1십원 : %d 개\n", share  );
		money = rest;

		share = money/5;
		rest = money%5; // 5760
		System.out.printf("5원 : %d 개\n", share  );
		money = rest;
		

		share = money/1;
		rest = money%1; // 5760
		System.out.printf("1원 : %d 개\n", share  );
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








