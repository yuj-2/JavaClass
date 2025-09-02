package days05;

/**
 * @author kenik  
 * @date 2025. 8. 22. 오후 3:43:24 
 * @subject   while문    비교
 * @content   do~while문 설명
 */ 
public class Ex07 {

	public static void main(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10+=55
		// 0
		// =0
		// =0
		// i   sum    i<=10
		// 12   11     11<=10 false
		
		// 11+=11
		int i=11, sum=0;
		
		do {
			System.out.printf("%d+", i);
			sum += i;
			i++;
		} while (i<=10);
		
		/*
		while (i<=10) {
			System.out.printf("%d+", i);
			sum += i;
			i++;
		}
		*/
		
		System.out.printf("\b=%d", sum);
		
	} // main

} // class




