package days14;

/**
 * @author kenik  
 * @date 2025. 9. 4. 오후 4:32:44 
 * @subject   
 * @content 
 */ 
public class Ex13 {

	public static void main(String[] args) {
		// 클래스 배열 초기화
		/*
		Person [] pArr = new Person[3];
		pArr[0] = new Person();
		pArr[1] = new Person();
		pArr[2] = new Person();
		*/
		
		Person [] pArr = {
				new Person(),
				new Person(),
				new Person()
				};
		
		// 배열 초기화
		/*
		int [] m = new int[3];
		m[0]=1;
		m[1]=2;
		m[2]=3;
		
		int [] m = new int[] {1,2,3};
		int [] m = {
				1,
				2,
				3
				};
		*/
		/*
		// int [][] m = new int[2][4];
		int [][] m = {
						{1,2,3,4},
						{5,6,7,8}
		             };
		*/

	} // main

} // class


/* 클래스 사용시 NullPointerException 발생하는 근본 이유
		// NullPointerException
		Person p1 = null;
		p1.name = "김다원";
 */




