package days06;

public class Ex02_05 {

	public static void main(String[] args) {
		// 1 -> "가위"
		// 2 -> "바위"
		// 3 -> "보"
		// > com=3, user=1
		// > com=보, user=가위
		
		/*
		int [] kors = new int[3];
		
		kors[0] = 90; 
		kors[1] = 87;
		kors[2] = 99;
		*/
		
		// 배열 초기화
		//int [] kors = new int[] {90, 87, 99};
		int [] kors = {90, 87, 99};
		
		
		// 배열 크기
	    System.out.println(kors.length);
		// 0,1,2 요소를 출력
	    // index(첨자값) : 0,1,2
		System.out.println( kors[0] );
		System.out.println( kors[1] );
		System.out.println( kors[2] );
		 

	}// main

}// class





