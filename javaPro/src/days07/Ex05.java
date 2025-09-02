package days07;

/**
 * @author kenik  
 * @date 2025. 8. 26. 오후 12:16:24 
 * @subject 제어문 활용~  
 * @content 
 */ 
public class Ex05 {

	public static void main(String[] args) {
		// ( 2~9단 )구구단 출력
		// 2*1=2
		// 2*2=4
		// 2*3=6
		// 2*4=8
		// 2*5=10
		// :
		// 2*9=18
		/*
		System.out.printf("2*1=2\n");
		System.out.printf("2*2=4\n");
		System.out.printf("2*3=2\n");
		System.out.printf("2*4=2\n");
		System.out.printf("2*5=2\n");
		// :
		System.out.printf("2*8=2\n");
		System.out.printf("2*9=18\n");
		*/
		
		/*
		dan=2	dan<=9 참
		
		i=1     i <= 9 참
		i=2     i <= 9 참
		:
		i=9     i <=9 참
		i=10    i <=9 거짓
		[2단]개행
		2*1=2개행
		2*2=4개행
		:
		2*9=18개행
		
		
		dan=3	dan<=9 참
		i=1     i <= 9 참
		i=2     i <= 9 참
		:
		i=9     i <=9 참
		i=10    i <=9 거짓
		[3단]개행
		3*1=3개행
		3*2=4개행
		:
		3*9=27개행 
		
		dan=10	dan<=9 거짓
		 * */
		
		for (int dan = 2; dan <= 9; dan++) {
			System.out.printf("[%d단]\n", dan);
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d*%d=%02d\n", dan, i, dan*i);
			}
		}
		
		/*
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d*%d=%02d\n", 2, i, 2*i);
		}
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d*%d=%02d\n", 3, i, 3*i);
		}
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d*%d=%02d\n", 3, i, 3*i);
		}
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d*%d=%02d\n", 3, i, 3*i);
		}
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d*%d=%02d\n", 3, i, 3*i);
		}
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d*%d=%02d\n", 3, i, 3*i);
		}
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d*%d=%02d\n", 3, i, 3*i);
		}
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d*%d=%02d\n", 9, i, 9*i);
		}
		*/

	} // main

} // class











